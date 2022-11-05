package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AttributeExample {

	
	@Test(description = "Login Test")
	public void test4() {
		System.out.println("Test4");
	}
	
	@Test(priority = 1, description = "Add product")
	public void test2() {
		System.out.println("Test2");
		Assert.assertTrue(false);
	}

	@Test(priority = 2, dependsOnMethods = {"test2", "test4"})
	public void test3() {
		System.out.println("Test3");
		
	}

	@Test(priority = 3, dependsOnMethods = {"test3"}, alwaysRun = true, enabled = false)
	public void test1() {
		System.out.println("Test1");
	}

}


// adding something

// updating

// deleting