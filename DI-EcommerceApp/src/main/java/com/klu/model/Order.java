package com.klu.model;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class Order {

    private int orderId;
    private String custmoreName;
    private String productName;

    @Value("4")
    private int quantity;

    public Order(@Value("101") int order,
                 @Value("Avinash") String CustmoreName) {
        this.orderId = order;
        this.custmoreName = CustmoreName;
    }

    @Value("Laptop")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void display() {
        System.out.println("Following is order details:");
        System.out.println("OrderId: " + orderId);
        System.out.println("CustomerName: " + custmoreName);
        System.out.println("ProductName: " + productName);
        System.out.println("Quantity: " + quantity);
    }
}

