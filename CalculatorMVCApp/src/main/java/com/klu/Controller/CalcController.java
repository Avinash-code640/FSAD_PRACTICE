package com.klu.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klu.Service.CalcService;

@RestController
@RequestMapping("/calc")
public class CalcController {

    @Autowired
    private CalcService service;

    @RequestMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return service.add(a, b);
    }

    @RequestMapping("/subtract/{a}/{b}")
    public int subtract(@PathVariable int a, @PathVariable int b) {
        return service.subtract(a, b);
    }

    @RequestMapping("/multiply/{a}/{b}")
    public int multiply(@PathVariable int a, @PathVariable int b) {
        return service.multiply(a, b);
    }

    @RequestMapping("/divide")
    public double divide(@RequestParam int a, @RequestParam int b) {
        return service.divide(a, b);
    }
}

