package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProductDetailsPage {

	private WebDriver driver;

	public ProductDetailsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void verifyProduct(String product) {
		String text = driver.findElement(By.cssSelector("h1[data-automation-id='product-title']")).getText();
		Assert.assertEquals(product, text);	
	}
	
	public void addToCart() {
		driver.findElement(By.cssSelector("[data-automation-id='addToCart']")).click();
	}
	
	public void clickCheckOut() {
		driver.findElement(By.cssSelector("[data-automation-id='at-panel-checkout-button']")).click();
	}
}
