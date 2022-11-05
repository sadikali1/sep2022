package com.oops;

public interface IAC {

	final int a = 10;
	
	abstract public void printAC();
	
	default void test1() {
		System.out.println("Testing 1");
	}
	
	public static void sum() {
		int a = 10 +20;
		System.out.println("Testing 2 " +  a );
	}
	
	private void sum1() {
		System.out.println("Private method");
	}
}

// final variable ( can not change )
