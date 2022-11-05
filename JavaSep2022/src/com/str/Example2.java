package com.str;

public class Example2 {

	public static void main(String[] args) {

		String name1 = "QA";
		String name2 = "QA";
		String name3 = new String("QA");
		String name4 = "qa";
		String name5 = "QA Automation testing";
		String name6 = new String();
		String name7 = "          QA Automation testing                           ";
		
		
		System.out.println(name1 == name2);
		System.out.println(name1 == name3);
		
		System.out.println(name1.equals(name3));
		System.out.println(name1.equals(name2));
		System.out.println(name1.equalsIgnoreCase(name4));
		// == check variable reference and value both 
		System.out.println("================================");
		System.out.println(name5.contains("Automation"));
		System.out.println(name5.startsWith("QA"));
		System.out.println(name5.endsWith("ing"));
		
		System.out.println(name6.isEmpty());
		System.out.println(name5.length());
		
		System.out.println(name5.toUpperCase());
		System.out.println(name5.toLowerCase());
		System.out.println(name7);
		System.out.println(name7.trim());
		
		System.out.println(name5.replace("testing", "Engineer"));
		
		String[] str = name5.split(" ");
		System.out.println(str[1] );
		
		char[] ch =  name5.toCharArray();
		System.out.println(ch.length);
	}

}
