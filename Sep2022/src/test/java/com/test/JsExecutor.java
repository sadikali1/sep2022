package com.test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsExecutor {

	@Test
	public void testCaptureScreenshot() throws IOException {
		WebDriverManager.chromedriver().setup();	
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/upload-download");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(2000, 2000)");
		
		WebElement element = driver.findElement(By.id("downloadButton"));
		js.executeScript("arguments[0].click()", element);
		
		WebElement element1 = driver.findElement(By.xpath("//div[text()='Interactions']"));
		js.executeScript("arguments[0].scrollIntoView(true)", element1);
		
	}
}
