package com.pages.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CartPage {

	private WebDriver driver;
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(css = "[data-automation-id='at-product-title-link']")
	private WebElement productTitle;
	
	@FindBy(id="checkoutButton")
	private WebElement checkoutButton;
	
	public void verifyProduct(String product) {
		String cartProductTitle = productTitle.getText();
		Assert.assertEquals(product, cartProductTitle);		
	}
	
	public void clickOnCheckOut() {
		checkoutButton.click();
	}
}
