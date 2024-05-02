package com.springcore.task;

import java.util.Map;

public class Product {
	
	Map<String,String> details;
	Customer customer;
	
	Product(){}
	public Map<String, String> getDetails() {
		return details;
	}
	public void setDetails(Map<String, String> details) {
		this.details = details;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Product(Map<String, String> details, Customer customer) {
		super();
		this.details = details;
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Product [details=" + details + ", customer1=" + customer + "]";
	}
	
	public void xmlInit() {
		System.out.println("i am from xml - init - product");
	}
	public void xmlDestroy() {
		System.out.println("i am from xml - destroy - product");
	}
	
	
	
}
