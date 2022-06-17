package com.greatlearning.model;

public class Customer {
/**
 * Enter the account number and the password of a customer
 * 
 */
	private String bankAccountNo;
	private String password;
	

	public Customer(String bankAccountNo, String password) {
		this.bankAccountNo = bankAccountNo ;
		this.password = password;
				
	}
	
	
	@Override
	public String toString() {
		return "Customer [bankAccountNo=" + bankAccountNo + ", password=" + password + "]";
	}


	public String getBankAccountNo() {
		return bankAccountNo;
	}
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
