package com.pages.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigninPage {

	private WebDriver driver;

	@FindBy(css = "[id='email']")
	private WebElement userInput;

	@FindBy(css = "[id='cartSignInPassword']")
	private WebElement passwordInput;

	@FindBy(xpath = "//button[@data-automation-id='at-sign-in-button']")
	private WebElement loginButton;

	@FindBy(xpath = "(//button[@data-automation-id='at-continue-as-guest'])[2]")
	private WebElement guestButton;

	public SigninPage(WebDriver driver) {
		this.driver = driver;
	}

	public void login(String user, String password) {
		userInput.sendKeys(user);
		passwordInput.sendKeys(password);
		loginButton.click();
	}

	public void clickOnGuestButton() {
		guestButton.click();
	}
}
