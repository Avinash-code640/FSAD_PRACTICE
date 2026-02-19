package com.klu.model;

import org.springframework.stereotype.Component;

@Component
public class Product {

    private int productId;
    private String productName;
    private double price;
    private int quantity;
    private String category;

    public Product() {
        this.productId = 101;
        this.productName = "Tuxedo";
        this.price = 45000.0;
        this.quantity = 1;
        this.category = "Clothing";
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }
}
