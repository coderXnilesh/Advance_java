package com.jspiders.multithreading.main;

import com.jspiders.multithreading.resources.MyResources;
import com.jspiders.multithreading.threads.MyThread6;
import com.jspiders.multithreading.threads.MyThread7;

public class ThreadMain5 {
	public static void main(String[] args) {
		MyResources myResource = new MyResources();
		MyThread6 myThread6 = new MyThread6(myResource);
		MyThread7 myThread7 = new MyThread7(myResource);
		myThread6.start();
		myThread7.start();
	}
}
