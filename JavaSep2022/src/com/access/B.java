package com.access;

public class B extends A {

	public void printB() {
		System.out.println(name);
	}
	
	
	
	public static void main(String[] args) {
		B b = new B();
		b.printName();
	}
}
