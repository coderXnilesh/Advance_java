package com.jspiders.multithreading.resources;

public class Account {
	private double accountBalance;
	public void deposite(double amount) {
		System.out.println("Amount Of Rupees "+amount+"Has Been Credited");
		accountBalance += amount;
		System.out.println("Current Account balance is: "+accountBalance);
	}
	public void withdraw(double amount) {
		System.out.println("Amount Of Rupees: "+amount+" has Been Debited");
		accountBalance -= amount;
		System.out.println("Current Account Balance Is: "+accountBalance);
	}
}
