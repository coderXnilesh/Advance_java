package com.jspiders.multithreading.main;

import com.jspiders.multithreading.threads.MyThread2;

public class MyMain2 {
	public static void main(String[] args) {
		MyThread2 myThread2 = new MyThread2();
		Thread thread2 = new Thread(myThread2);
		thread2.getClass();
		thread2.setName("saurabh");
		thread2.setPriority(9);
		System.out.println(thread2);
		
		thread2.start();
	}
}
