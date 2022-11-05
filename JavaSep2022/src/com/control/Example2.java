package com.control;

public class Example2 {

	public static void main(String[] args) {

			int age = 35;
			int weight = 35;
			
			if(age > 18) {
				if(weight > 45) {
					System.out.println("Eligible for blood donation");
				}else {
					System.out.println("His weight is less than 45 so he is not eligible for bllod donation");
				}				
			}else {
				System.out.println("Not eligible for blood donation");
			}
	}

}
