package com.jspiders.multithreading.main;

import com.jspiders.multithreading.threads.MyThread1;
import com.jspiders.multithreading.threads.MyThread1_1;

public class MyMain {
	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1();
		MyThread1_1 myThread1_1 = new MyThread1_1();
		myThread1.start();
		myThread1_1.start();
	}
}
