package com.test.jcpenny;

import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.ProductDetailsPage;
import com.util.BaseTest;

public class SearchProduct extends BaseTest{

	String product = "Fieldcrest Luxury Alden Linen Light-Filtering Rod Pocket Back Tab Single Curtain Panel";
		
	@Test
	public void searchProductTest() {
		
		HomePage homePage = new HomePage(driver);		
		homePage.searchProduct(product);
		
		ProductDetailsPage pd = new ProductDetailsPage(driver);
		pd.verifyProduct(product);	
	}	
	
}
