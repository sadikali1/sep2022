package com.steps;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsDef {

	private int a;
	private int b;
	private int result;
	
	@Given("I have two numbers {int} and {int}")
	public void i_have_two_numbers_and(Integer int1, Integer int2) {
		a = int1;
		b = int2;
	}

	@When("I added both numbers")
	public void i_added_both_numbers() {
		result = a + b;
	}

	@Then("I verify result is {int}")
	public void i_verify_result_is(Integer int1) {
		Assert.assertEquals(result, int1);
	}

	@Given("I am common for all scenario")
	public void i_am_common_for_all_scenario() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

}
