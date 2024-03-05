package com.jspiders.designpatterns.creational;

public class SingletonLazy {

	private static SingletonLazy singletonLazy = new SingletonLazy();
	
	private SingletonLazy() {
		System.out.println("Constructor is Invoked");
	}
	public static SingletonLazy getObject() {
		
		if (singletonLazy == null) {
			singletonLazy = new SingletonLazy();
		}
		return singletonLazy;
	}
		
}

