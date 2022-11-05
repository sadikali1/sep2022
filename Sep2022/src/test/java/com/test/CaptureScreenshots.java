package com.test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshots {
	
	@Test
	public void testCaptureScreenshot() throws IOException {
		WebDriverManager.chromedriver().setup();	
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		TakesScreenshot tc = (TakesScreenshot) driver;
		File file1 = tc.getScreenshotAs(OutputType.FILE);
		File file2 = new File("screenshot.png");
		FileUtils.copyFile(file1, file2);
		
		WebElement element = driver.findElement(By.id("alertButton"));
		File file3 =  element.getScreenshotAs(OutputType.FILE);
		File file4 = new File("button.png");
		FileUtils.copyFile(file3, file4);
	}

}
