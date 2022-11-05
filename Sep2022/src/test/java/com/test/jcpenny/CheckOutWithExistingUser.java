package com.test.jcpenny;

import org.testng.annotations.Test;

import com.pages.CartPage;
import com.pages.HomePage;
import com.pages.ProductDetailsPage;
import com.pages.SigninPage;
import com.util.BaseTest;

public class CheckOutWithExistingUser extends BaseTest{
	
	String product = "Fieldcrest Luxury Alden Linen Light-Filtering Rod Pocket Back Tab Single Curtain Panel";
			
	@Test
	public void searchProductTest() {		
		HomePage homePage = new HomePage(driver);		
		homePage.searchProduct(product);
		
		ProductDetailsPage pd = new ProductDetailsPage(driver);
		pd.verifyProduct(product);	
		
		pd.addToCart();
		pd.clickCheckOut();
		
		CartPage cartPage = new CartPage(driver);
		cartPage.verifyProduct(product);
		cartPage.clickOnCheckOut();
		
		SigninPage signInPage = new SigninPage(driver);
		signInPage.login("admin", "admin");
		
	}	
	
}

// TDD 
// BDD framework