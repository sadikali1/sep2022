package com.str;

public class StringBufferExample {

	public static void main(String[] args) {

		StringBuilder ob = new StringBuilder("QA");
		StringBuilder ob1 = new StringBuilder("QA Testing");
		
		System.out.println(ob);
		System.out.println(ob.hashCode());
		
		ob.append("Testing");
		System.out.println(ob);
		System.out.println(ob.hashCode());
		
		System.out.println(ob.insert(2, "Raj"));
		System.out.println(ob.replace(0, 2, "Eng"));
		
		System.out.println(ob.delete(1,2));
		
		System.out.println(ob1.reverse());
		
	}
}
