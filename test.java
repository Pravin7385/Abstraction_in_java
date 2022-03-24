package com.Opps.abstraction;

// Abstraction --> it is the process of hiding the some details and 
//					only showing the important information.


//1st way to achieve Abstraction is Abstract class.

public abstract class test {

	abstract void x1(); // declaration only
	abstract void x2();	
}

class Sub extends test{
	
	@Override
	void x1() {
		System.out.println("this is x1 method");
	}
	void x2() {
		System.out.println("thos is x2 method");
	}
	
	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.x1();
		sub.x2();
	}
}
