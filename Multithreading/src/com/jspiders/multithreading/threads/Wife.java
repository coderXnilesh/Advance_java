package com.jspiders.multithreading.threads;

import com.jspiders.multithreading.resources.Account;

public class Wife extends Thread{
	private Account account;
	
	public Wife(Account account) {
		super();
		this.account = account;
	}



	@Override
	public void run() {
		account.deposite(2000);
		account.withdraw(5000);
	}
}
