package com.oops;

public class PolyExample1 {
	
	public void add() {
		int result = 10+20;
		System.out.println(result);
	}
		
	public void add(int a, int b) {
		int result = a + b;
		System.out.println(result);
	}

	public void add(int a, int b, int c) {
		int result =a + b + c ;
		System.out.println(result);
	}
	
	public void add(String fname, String lname) {
		String fullName = fname + " "+ lname;
		System.out.println(fullName);
	}
	
	public void add(int a, String b) {
		System.out.println(a + b);
	}
}


// Two types
// Method overloading , Compile Time poly, Static Binding
// Method overriding, Run time poly, dynamic binding 