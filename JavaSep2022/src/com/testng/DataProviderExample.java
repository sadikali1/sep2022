package com.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	@Test(dataProvider = "TestData")
	public void testAdd(int a1, int b1, int c1) {	
		int result  =  a1+b1;
		Assert.assertEquals(result, c1);
	}

	
	@Test(dataProvider = "UserData", dataProviderClass = MyDataProvider.class)
	public void testUsers(String fname, String lastName, String email) {	
		System.out.println(fname + " "+ lastName + " "+email);
		
		// findElement(By.xpa()).send(fname)
		// findElement(By.xpa()).send(fname)
		// findElement(By.xpa()).send(fname)
		
	}
	
	
	@DataProvider(name="TestData")
	public Object[][] getData() {
		
		Object[][] obj = new Object[][] {
			{1, 2, 3},
			{10, 20, 30},
			{15, 5, 20},
			{10, 5, 15},
			{1, 15, 20},
			{1, 20, 21}
		};
		
		return obj;
	}
	
	
}
