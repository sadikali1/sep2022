package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumExample {
	
	private WebDriver driver;
	
	@Parameters({"browserType"})
	@Test
	public void selenium(String browserType) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\geckodriver-v0.31.0-win64 (2)\\geckodriver.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.edgedriver().setup();
		
		if(browserType.equals("chrome"))
			driver = new ChromeDriver();
		else if(browserType.equals("firefox"))
			driver = new FirefoxDriver();
		else
			driver = new EdgeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// click create account 
		WebElement element = driver.findElement(By.xpath("//a[@data-testid = 'open-registration-form-button']"));
		element.click();
		
		//Thread.sleep(3000);
		WebElement inputField = driver.findElement(By.xpath("//input[@name='firstname']"));
		inputField.clear();
		inputField.sendKeys("TestName");
		
		WebElement lastNameField = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastNameField.clear();
		lastNameField.sendKeys("lastName");
		
		driver.findElement(By.xpath("//input[@aria-label=\"Mobile number or email address\"]")).sendKeys("999010111");
		
		WebElement dayElement = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select select  = new Select(dayElement);
		//select.selectByIndex(3);
		//select.selectByValue("4");
		select.selectByVisibleText("10");
		
		WebElement elementMonth = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select select1 = new Select(elementMonth);
		//select1.selectByVisibleText("Jan");
		//select1.selectByIndex(3);
		select1.selectByValue("6");		
		
	}

}
