package com.springcore.task;

import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Customer {
	
	String name;
	String email;
	Map<String,String> address;
	Set<Integer> mobile;
	Customer(){}
	public Customer(String name, String email, Map<String, String> address, Set<Integer> mobile) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.mobile = mobile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Map<String, String> getAddress() {
		return address;
	}
	public void setAddress(Map<String, String> address) {
		this.address = address;
	}
	public Set<Integer> getMobile() {
		return mobile;
	}
	public void setMobile(Set<Integer> mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", address=" + address + ", mobile=" + mobile + "]";
	}
	@PostConstruct
	public void annoInit() {
		System.out.println("i am from anno - init - customer");
	}
	@PreDestroy
	public void annoDestroy() {
		System.out.println("i am from anno - destroy - customer");
	}

}
