package com.jspiders.multithreading.threads;

import com.jspiders.multithreading.resources.MyResources;

public class MyThread7 extends Thread{
	private MyResources myResource;

	public MyThread7(MyResources myResource) {
		super();
		this.myResource = myResource;
	}
	@Override
	public void run() {
	synchronized (myResource.resource2) {
		System.out.println("Lock is applied on resource 2 by MyThread7");
		synchronized (myResource.resource1) {
			System.out.println("Lock is applied on resource 1 by MyThread7");
		}
	}
	}
}
