package com.util;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	protected WebDriver driver;
	protected String userName;
	protected String password;
	
	@BeforeClass
	public void beforeSetup() {
		String browserType = Config.getConfigValue("BrowserType");
		userName = Config.getConfigValue("UserName");
		password = Config.getConfigValue("Password");

		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.edgedriver().setup();
		
		if(browserType.equals("chrome"))
			driver = new ChromeDriver();
		else if(browserType.equals("firefox"))
			driver = new FirefoxDriver();
		else if(browserType.equals("edge"))
			driver = new EdgeDriver();
		else 
			throw new RuntimeException("Please provide valid browser type");

		String appUrl = Config.getConfigValue("Url");
	
		driver.navigate().to(appUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
