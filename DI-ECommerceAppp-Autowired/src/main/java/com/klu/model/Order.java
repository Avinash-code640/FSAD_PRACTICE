package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {
private int orderId;
private String custmoreName;
private int quantity;
@Autowired
private Product product;

public Order() {
	this.orderId = 2005;
	this.custmoreName = "Avinash";
	this.quantity = 3;
}
  public void display() {
	  System.out.println("the following are order details");
	  System.out.println("OrderId:"+orderId);
	  System.out.println("CustmoreName:"+custmoreName);
	  System.out.println("Quantity:"+quantity);
	  System.out.println("ProductId:"+product.getProductId());
	  System.out.println("ProductName:"+product.getProductName());
	  System.out.println("ProductPrice:"+product.getPrice());
	  System.out.println("ProductCategory:"+product.getCategory());
  }
}
