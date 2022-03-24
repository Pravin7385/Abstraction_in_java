package com.Opps.abstraction;

// 2nd way to achieve abstraction is interface

public interface Test2 {
	
	public abstract void x1();
}

class Example implements Test2{
	
	@Override
	public void x1() {
		System.out.println("this is methd 1");
	}
	
	public static void main(String[] args) {
		Example example = new Example();
		example.x1();
	}
}


