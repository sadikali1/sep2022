package com.cons;

public class Students extends ParentClass{
	
	String name;
	int rollNumber;
	
	public Students() {
		super("Testing");
		System.out.println("default constructor");
	}
	
	public Students(String name) {
		super(name);
		this.name = name;
		System.out.println("parameterize constructor");
	}
	
	
	public Students(String name, int number) {
		this(name);	
		this.name = name;
		this.rollNumber = number;
		System.out.println("parameterize constructor with INteger");
		
	}	
	
}
