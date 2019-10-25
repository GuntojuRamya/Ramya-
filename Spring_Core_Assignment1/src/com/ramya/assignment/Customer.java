package com.ramya.assignment;


public class Customer 
{
	private int customerId;
	private String customerName;
	private String customerContact;
	private String customeraddress;

	private Address address;
	
	
	public Customer() {
		super();
	}


	public Customer(int customerId, String customerName, String customerContact, String customeraddress, Address address) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customeraddress = customeraddress;
		this.address = address;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustomerContact() {
		return customerContact;
	}


	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}


	public String getCustomeraddress() {
		return customeraddress;
	}


	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerContact="
				+ customerContact + ", customeraddress=" + customeraddress + ", address=" + address + "]";
	}
	
	
}
