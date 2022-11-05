package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigninPage {

	private WebDriver driver;

	public SigninPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void login(String user, String password) {
		driver.findElement(By.cssSelector("[id='email']")).sendKeys(user);
		driver.findElement(By.cssSelector("[id='cartSignInPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@data-automation-id='at-sign-in-button']")).click();
	}
	
	public void clickOnGuestButton() {
		driver.findElement(By.xpath("(//button[@data-automation-id=\"at-continue-as-guest\"])[2]")).click();
	}
}
