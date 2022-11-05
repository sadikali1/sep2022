package com.str;

public class Comp {
	
	public static void main(String[] args) {
		
		long time1 = System.currentTimeMillis();
		String name = "QA";
		for(int i=0; i<10000; i++) {
			name = name + "Testing";
		}
		long time2 = System.currentTimeMillis();
		System.out.println(time2 - time1);
		
		long time3 = System.currentTimeMillis();
		StringBuilder name1 = new StringBuilder("QA");
		for(int i=0; i<10000; i++) {
			name1 = name1.append("Testing");
		}
		long time4 = System.currentTimeMillis();
		System.out.println(time4 - time3);
	}

}
