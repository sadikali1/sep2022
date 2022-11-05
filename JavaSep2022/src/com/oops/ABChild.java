package com.oops;

public class ABChild extends AB implements IAB {

	public void add(int a) {
		System.out.println("Implement in child class");	
	}

	
	public void printValue() {
		System.out.println("Testing");
	}


	@Override
	public void printAC() {
		// TODO Auto-generated method stub
		
	}


	
}
