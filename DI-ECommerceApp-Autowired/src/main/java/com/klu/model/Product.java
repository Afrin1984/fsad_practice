package com.klu.model;

import org.springframework.stereotype.Component;

@Component
public class Product {
	private int productId;
	private String productName;
	private double price;
	private String category;
	
	public Product() {
		this.productId=101;
		this.productName="Laptop";
		this.price=45000.0;
		this.category="Mechanics";
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
	public String getCategory() {
		return category;
	}

}
