package com.klu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.klu.model.Student;
import com.klu.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    private List<Student> studentList = new ArrayList<>();

    // Welcome
    @Override
    public String getWelcomeMessage() {
        return "Welcome to Student MVC CRUD Application";
    }

    // Create
    @Override
    public Student createStudent(Student student) {
        studentList.add(student);
        return student;
    }

    // Read - Get by Id
    @Override
    public Student getStudentById(int id) {
        for (Student s : studentList) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    // Read - Get All
    @Override
    public List<Student> getAllStudents() {
        return studentList;
    }

    // Update
    @Override
    public Student updateStudent(int id, Student student) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                student.setId(id);
                studentList.set(i, student);
                return student;
            }
        }
        return null;
    }

    // Delete (Fixed - No ConcurrentModificationException)
    @Override
    public String deleteStudent(int id) {
        boolean removed = studentList.removeIf(s -> s.getId() == id);

        if (removed) {
            return "Student record deleted Successfully";
        } else {
            return "No student record found";
        }
    }

    // Search (Fixed - Proper String Comparison)
    @Override
    public List<Student> searchStudent(String name, String course) {
        List<Student> result = new ArrayList<>();

        for (Student s : studentList) {
            if (s.getName().equalsIgnoreCase(name) &&
                s.getCourse().equalsIgnoreCase(course)) {

                result.add(s);
            }
        }

        return result;
    }
}
