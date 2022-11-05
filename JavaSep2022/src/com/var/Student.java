package com.var;

public class Student {
	
	public String name;
	public String email;
	public int rollNumber;  // Instance Variable
	
	static int code;
	
	public static void main(String[] args) {
		Student obj1 = new Student();
		obj1.name = "Raj";
		obj1.email = "raj@gmail.com";
		obj1.rollNumber = 10;	
		Student.code = 10;
		
		Student obj2 = new Student();
		obj2.name = "Rajesh";
		obj2.email = "Rajesh@gmail.com";
		obj2.rollNumber = 11;
		Student.code = 50;
		
		System.out.println(obj1.name + " "+ obj1.email + " "+obj1.rollNumber + " "+Student.code);
		System.out.println(obj2.name + " "+ obj2.email + " "+obj2.rollNumber + " "+Student.code);
	}

}

// Java Data Type

// Instance // Object
// Class

// Instance variable
