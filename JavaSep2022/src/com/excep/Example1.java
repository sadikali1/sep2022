package com.excep;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example1 {

	static String name;

	public static void main(String[] args) throws IOException{
		
		int len = getLength(name);
		System.out.println(len);
		
		/*
		// File path is passed as parameter
        File file = new File(
            "C:\\Users\\pankaj\\Desktop\\test.txt"); 
       
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
				while ((st = br.readLine()) != null)            
				    System.out.println(st);
		
	

		try {
			System.out.println(name.length());
			int a = 1 / 0;
			System.out.println(a);
		} catch (NullPointerException ex) {
			System.out.println("Null Pointer Exception Handled");
		} catch (ArithmeticException ar) {
			System.out.println("Arithmetic Exception Handle");
		}catch(RuntimeException ex) { 
			System.out.println("Runtime Exception");
		}finally{
			System.out.println("Finally Executed");
		}

		System.out.println("Done"); */
	}
	
	
	public static int getLength(String str) throws IOException{
		if(str == null) {
			throw new IOException("Please provide String value");
		}
		return str.length();
	}
}

// try, catch, finally, throw and throws