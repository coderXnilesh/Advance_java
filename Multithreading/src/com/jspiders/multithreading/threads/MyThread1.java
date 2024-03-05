package com.jspiders.multithreading.threads;

public class MyThread1 extends Thread{
	
	@Override
	public void run() {
	for(int i =0;i<=20;i++){
		System.out.println("MyThread1::  "+i);
		}
	}
	

}
