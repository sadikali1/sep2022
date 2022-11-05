package com.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	@Test
	public void testCheckBox() {
		WebDriverManager.chromedriver().setup();	
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/webtables");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	
		driver.findElement(By.id("addNewRecordButton")).click();
		driver.findElement(By.id("firstName")).sendKeys("Rahul");
		driver.findElement(By.id("lastName")).sendKeys("Kumar");
		driver.findElement(By.id("userEmail")).sendKeys("rahul.kumar@gmail.com");
		driver.findElement(By.id("age")).sendKeys("30");
		driver.findElement(By.id("salary")).sendKeys("100000");
		driver.findElement(By.id("department")).sendKeys("QA Automaton");
		driver.findElement(By.id("submit")).click();
		
		//  [class="rt-tbody"] >div > div > div:nth-of-type(4)
		// //div[@class="rt-tbody"]/div/div/div[4]
		
		List<WebElement> elements = driver.findElements(By.xpath("//*[@class='rt-tbody']/div/div/div[2]"));
		System.out.println(elements.size());
		
		boolean status = false;
		for(WebElement element : elements) {
			String emailAddress = element.getText();
			if(emailAddress.equals("raj.kumar@gmail.com")) {
				status = true;
				break;
			}
		}
		Assert.assertTrue(status, "Email not exits in table");
	}
	
}
