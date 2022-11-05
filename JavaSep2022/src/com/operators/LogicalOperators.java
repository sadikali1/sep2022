package com.operators;

public class LogicalOperators {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		//System.out.println(marks > 60 && marks < 75);  // 
		
		System.out.println(a > b && b > ++c);  //false && false == false
											 //true && false == false
											 //false && true == false
											 //true && true == true
		
		System.out.println(c);
		
		//System.out.println(a > b || b > c);  //false && false == false
											 //true && false == true
											 //false && true == true
											 //true && true == true
	}

}


// if number is greater 60 and less than 75 then define C
// if number is greater 75 and less than 90 then define B

//  && 
//