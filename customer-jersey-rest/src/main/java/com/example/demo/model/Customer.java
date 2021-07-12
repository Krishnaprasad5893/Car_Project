package com.example.demo.model;

public class Customer {
	private int customerId;
	private String cusomerName;
	private long phoneNumber;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCusomerName() {
		return cusomerName;
	}
	public void setCusomerName(String cusomerName) {
		this.cusomerName = cusomerName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Customer(int customerId, String cusomerName, long phoneNumber) {
		super();
		this.customerId = customerId;
		this.cusomerName = cusomerName;
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", cusomerName=" + cusomerName + ", phoneNumber=" + phoneNumber
				+ "]";
	}

}
