package com.steps;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {

	private WebDriver driver;
	
	@Given("I navigated url on browser")
	public void i_navigated_url_on_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}


	@When("I enter user name into user input field")
	public void i_enter_user_name_into_user_input_field() {
		driver.findElement(By.name("username")).sendKeys("admin");
	}



	@When("I enter password in password filed")
	public void i_enter_password_in_password_filed() {
		driver.findElement(By.name("password")).sendKeys("admin123");
	}



	@When("I click on login button")
	public void i_click_on_login_button() {
		driver.findElement(By.tagName("button")).click();
	}


	@Then("I verify user login successfully")
	public void i_verify_user_login_successfully() {
		Assert.assertTrue(driver.findElement(By.cssSelector("[alt=\"profile picture\"]")).isDisplayed());
	}
	
	@Then("Verify all menus option")
	public void verify_all_menus_option(DataTable table) {
		//List<List<String>> datas = table.asLists();
		//for(List<String> data : datas){
			//System.out.println(data.get(0));
			//Assert.assertTrue(driver.findElement(
					//By.xpath("//*[@class=\"oxd-main-menu-item-wrapper\"]/a/span[text()='"+data.get(0)+"']")).isDisplayed());
		//}
		
		
		List<Map<String, String>> datas = table.asMaps();
		
		for(Map<String, String> map :  datas) {
			System.out.println(map.get("Header"));
			Assert.assertTrue(driver.findElement(
					By.xpath("//*[@class=\"oxd-main-menu-item-wrapper\"]/a/span[text()='"+map.get("Header")+"']")).isDisplayed());
		
		}
		
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}


}
