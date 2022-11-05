package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetExamples {
	
	@Test
	public void selenium() throws InterruptedException {		
		WebDriverManager.chromedriver().setup();	
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Facebook – log in or sign up", title);
		
		//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		//String url = driver.getCurrentUrl();
		//System.out.println(url);
		
		//String source = driver.getPageSource();
		//System.out.println(source);
		
		String text = driver.findElement(By.tagName("h2")).getText();
		Assert.assertEquals(text, "Facebook helps you connect and share with the people in your life.");
				
		String placeHolder = driver.findElement(By.xpath("//input[@id='email']")).getAttribute("placeholder");
		System.out.println(placeHolder);
		Assert.assertEquals("Email address or phone number", placeHolder);
		
		String fontSize = driver.findElement(By.xpath("//button[@name='login']")).getCssValue("font-size");
		System.out.println(fontSize);
	}

}
