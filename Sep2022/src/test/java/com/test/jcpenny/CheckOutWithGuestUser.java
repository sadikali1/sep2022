package com.test.jcpenny;

import org.testng.annotations.Test;

import com.pages.CartPage;
import com.pages.HomePage;
import com.pages.ProductDetailsPage;
import com.pages.ShippingPage;
import com.pages.SigninPage;
import com.util.BaseTest;

public class CheckOutWithGuestUser extends BaseTest{
	
	String product = "Fieldcrest Luxury Alden Linen Light-Filtering Rod Pocket Back Tab Single Curtain Panel";

	@Test
	public void CheckOutWithGuestUserTest() {
		HomePage homePage = new HomePage(driver);
		homePage.searchProduct(product);
		
		ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
		productDetailsPage.verifyProduct(product);
		
		productDetailsPage.addToCart();
		productDetailsPage.clickCheckOut();
		
		CartPage cartPage = new CartPage(driver);
		cartPage.verifyProduct(product);
		cartPage.clickOnCheckOut();
		
		SigninPage signInPage = new SigninPage(driver);
		signInPage.clickOnGuestButton();
		
		ShippingPage sippingPage = new ShippingPage(driver);
		sippingPage.fillGuestInfo();
	}	
	
}
