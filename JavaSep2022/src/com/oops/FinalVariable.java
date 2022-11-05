package com.oops;

public class FinalVariable {
	
	final int a;
	final static int b ;
	
	static {
		b = 10;
	}
	
	public FinalVariable() {
		a = 10;	
	}
	
	public void printA() {		
		System.out.println(a);
		System.out.println(b);
	}

}
