package com.capg.storeproject.bean;

public class Customer {
	private String customerName;
	private long customerMobileNumber;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerMobileNumber() {
		return customerMobileNumber;
	}
	public void setCustomerMobileNumber(long customerMobileNumber) {
		this.customerMobileNumber = customerMobileNumber;
	}
	public Customer(String customerName, long customerMobileNumber) {
		super();
		this.customerName = customerName;
		this.customerMobileNumber = customerMobileNumber;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerMobileNumber=" + customerMobileNumber + "]";
	}
	
	

}
