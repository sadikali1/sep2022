package com.test.jcpenny.factory;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.factory.HomePage;
import com.pages.factory.ProductDetailsPage;
import com.util.BaseTest;

public class SearchProduct extends BaseTest {

	String product = "Fieldcrest Luxury Alden Linen Light-Filtering Rod Pocket Back Tab Single Curtain Panel";
	
	@Test
	public void searchProductTest() {
		
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);		
		homePage.searchProduct(product);
		
		ProductDetailsPage pd = PageFactory.initElements(driver, ProductDetailsPage.class);
		pd.verifyProduct(product);	
	}	
}


// BDD framework
// GitHub
// Basic like setup Appium 