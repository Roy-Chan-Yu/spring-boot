package com.pouchen.roy.springboot.aop.model;

public class Account {

	private String accountNumber;
	private String accountType;
	
	public Account(String accountNumber, String accountType) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public String toString() {
		return "AccountNumber: "+accountNumber + " accountType: " + accountType;
	}
}
