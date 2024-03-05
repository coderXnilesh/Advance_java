package com.jspiders.multithreading.threads;

import java.util.Iterator;

public class MyThread11 extends Thread {
	@Override
	public void run() {
		String message = "java is a Programming Language";
		char[] charArray = message.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}
	}
}
