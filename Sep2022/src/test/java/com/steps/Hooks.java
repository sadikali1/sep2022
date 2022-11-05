package com.steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {
	
	@Before
	public void setup() {
		System.out.println("Executed Before Scenario");
	}

	
	@After
	public void tearDown() {
		System.out.println("Executed After Scenario");
	}
	
	@BeforeStep
	public void setupStep() {
		System.out.println("Executed Before Step");
	}
	
	
	@AfterStep
	public void setupSetp() {
		System.out.println("Executed After Step");
	}
}
