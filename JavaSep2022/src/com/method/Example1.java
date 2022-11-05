package com.method;

public class Example1 {
	
	public static void main(String[] args) {		
		Example1 obj = new Example1();
		obj.printMethod();
		obj.add();
		int result = obj.addition(10, 30);
		System.out.println(result);
		
		int result1 = obj.calc(10, 20, '*');
		System.out.println(result1);
	}

	
	public void printMethod() {
		System.out.println("Testing");
	}
	
	public void add() {
		int sum = 10+20;
		System.out.println(sum);
	}
	
	public int addition(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public int calc(int a, int b, char symbol) {
		int result = 0;
		switch(symbol) {
		case '+':
			result = a + b;
			break;
		case '-':
			result = a - b;
			break;
		case '*':
			result = a * b;
			break;
		case '/':
			result = a / b;
			break;
		case '%':
			result = a % b;
			break;
			
		}
		return result;		
	}
	
	
}
