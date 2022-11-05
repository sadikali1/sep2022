package com.array;

public class ArrayExample2 {

	public static void main(String[] args) {
		String[] a1 = {"Raj", "Ram", "Rajesh", "Akib", "Rogger"};
	
		printName(a1);
		
	}
	
	public static void printName(String[] names) {
		for(String name: names) {
			System.out.println(name);
		}
	}
}
