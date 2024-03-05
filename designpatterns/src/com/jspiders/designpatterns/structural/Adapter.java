package com.jspiders.designpatterns.structural;

public class Adapter extends Employee implements Event {
	@Override
public void womensDay() {
	System.out.println("The CG for the Women's day is: "+getName());
}

@Override
public void mensDay() {
	System.out.println("The CG for the Men's day is: "+getName());
}
}
