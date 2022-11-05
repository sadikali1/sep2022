package com.str;

public class Exmple1 {
	
	public static void main(String[] args) {
		
		String name = "Raj";
		System.out.println(name);
		System.out.println(name.hashCode());
		
		name = name.concat("Kumar");
		System.out.println(name);
		System.out.println(name.hashCode());
		
		String name1 = "Raj";
		System.out.println(name1);
		System.out.println(name1.hashCode());
		
		String str = new String("Raj");
		System.out.println(str);
		System.out.println(str.hashCode());
		
	}

}
