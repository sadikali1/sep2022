package com.testng;

import org.testng.annotations.DataProvider;

public class MyDataProvider {

	@DataProvider(name="UserData")
	public Object[][] getData1() {
		
		Object[][] obj = new Object[][] {
			{"Raj1", "Kumar1", "test1@gmail.com"},
			{"Raj2", "Kumar2", "test2@gmail.com"},
			{"Raj3", "Kumar3", "test3@gmail.com"},
			{"Raj4", "Kumar4", "test4@gmail.com"}
		};
		
		return obj;
	}
}
