@Regression
Feature: Title of your feature
  I want to use this template for my feature file


	Background: 
		Given I am common for all scenario
	
	@Smoke @Regression
  Scenario: Verify addition of two numbers
    Given I have two numbers 10 and 20
    When I added both numbers
    Then I verify result is 30

  @Regression
  Scenario Outline: Verify addition of two numbers
    Given I have two numbers <number1> and <number2>
    When I added both numbers
    Then I verify result is <result>

    Examples: 
      | number1 | number2 | result |
      |      10 |      20 |     30 |
      |      24 |      15 |     29 |
      |      12 |      13 |     25 |
      |       1 |      15 |     16 |
      |      16 |      14 |     30 |
      
    Examples: 
      | number1 | number2 | result |
      |      30 |      20 |     50 |
      
