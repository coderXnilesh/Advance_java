package com.jspiders.multithreading.threads;

import com.jspiders.multithreading.resources.MyResources;

public class MyThread6 extends Thread{
private MyResources myResources;

public MyThread6(MyResources myResources) {
	this.myResources = myResources;
}
@Override
	public void run() {
		synchronized (myResources.resource1) {
			System.out.println("Lock Is applied on Resource One...");
			synchronized (myResources.resource2) {
				System.out.println("Lock Is Applied on Resource Two...");
			}
		}
	}
}
