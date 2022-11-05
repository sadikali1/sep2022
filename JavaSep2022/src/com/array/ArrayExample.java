package com.array;

public class ArrayExample {

	
	public static void main(String[] args) {
		String[] a1 = new String[5];
	
		a1[0] = "Raj";
		a1[1] = "Ram";
		a1[2] = "Javed";
		a1[3] = "Karan";
		a1[4] = "Scot";
		
		for(String a11 : a1) {
			System.out.println(a11);
		}
		
		
		int[] a2 = new int[10];
		a2[0] = 10;
		a2[1] = 20;
		a2[2] = 30;
		
		System.out.println(a2[0]);
		System.out.println(a2[9]);
		
		/*
		for(int i=0; i<10; i++) {
			System.out.println(a2[i]);
		} */
		
		for(int a : a2) {
			System.out.println(a);
		}
		
	}

}
