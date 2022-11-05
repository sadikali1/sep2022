package com.pages.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ProductDetailsPage {

	private WebDriver driver;

	public ProductDetailsPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(css = "h1[data-automation-id='product-title']")
	private WebElement productTitle;

	@FindBy(css = "[data-automation-id='addToCart']")
	private WebElement addCartButton;

	@FindBy(css = "[data-automation-id='at-panel-checkout-button']")
	private WebElement checkOutButton;

	public void verifyProduct(String product) {
		String text = productTitle.getText();
		Assert.assertEquals(product, text);
	}

	public void addToCart() {
		addCartButton.click();
	}

	public void clickCheckOut() {
		checkOutButton.click();
	}

}
