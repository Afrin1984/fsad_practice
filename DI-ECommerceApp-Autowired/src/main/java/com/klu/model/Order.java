package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {
	private int orderId;
	private String customerName;
	private int quantity;
	@Autowired
	private Product pr;
	
	public Order() {
		this.orderId=225;
		this.customerName="Afrin";
		this.quantity=3;
	}
	
	public void display() {
		System.out.println("the following are order details");
		System.out.println("OrderId:"+orderId);
		System.out.println("CustometNmae:"+customerName);
		System.out.println("Quantity:"+quantity);
		System.out.println("ProductId:"+pr.getProductId());
		System.out.println("ProductName:"+pr.getProductName());
		System.out.println("Price:"+pr.getPrice());
		System.out.println("Category:"+pr.getCategory());
	}

}
