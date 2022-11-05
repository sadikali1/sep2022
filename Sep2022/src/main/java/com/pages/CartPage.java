package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CartPage {

	private WebDriver driver;
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void verifyProduct(String product) {
		String cartProductTitle = driver.findElement(By.cssSelector("[data-automation-id=\"at-product-title-link\"]")).getText();
		Assert.assertEquals(product, cartProductTitle);		
	}
	
	public void clickOnCheckOut() {
		driver.findElement(By.id("checkoutButton")).click();
	}
}
