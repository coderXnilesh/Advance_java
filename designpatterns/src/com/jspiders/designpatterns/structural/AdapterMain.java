package com.jspiders.designpatterns.structural;

public class AdapterMain {
public static void main(String[] args) {
	Adapter adapter = new Adapter();
	adapter.setEmpId(1);
	adapter.setDept("Science");
	adapter.setName("Saurabh");
	adapter.mensDay();
	adapter.setEmpId(2);
	adapter.setDept("Science");
	adapter.setName("sakshi");
	adapter.womensDay();
}
}
