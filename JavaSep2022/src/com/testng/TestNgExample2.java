package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNgExample2 {
	
	@Test
	public void test1() {
		String expected = "Men";
		String actual = "Mens"; // read from UI
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(actual, expected);
		
		soft.assertEquals(1, 2);
		soft.assertTrue(false);
		System.out.println("Testing");
		soft.assertAll();
		
	}

}


// Hard Assertion 
// Soft Assertion