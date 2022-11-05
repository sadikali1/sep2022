package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrameExample {
	
	@Test
	public void testFrame() {
		WebDriverManager.chromedriver().setup();	
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/frames");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame1");
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
	
		driver.switchTo().parentFrame();
		String text1 = driver.findElement(By.cssSelector("[id=\"framesWrapper\"] > div")).getText();
		System.out.println(text1);
		
		driver.switchTo().frame("frame2");
		String text2 = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text2);
		
	}

	
	@Test
	public void testNestedFrame() {
		WebDriverManager.chromedriver().setup();	
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/nestedframes");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("[id='frame1']")));
		String text = driver.findElement(By.tagName("body")).getText();
		System.out.println(text);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		String text1 =  driver.findElement(By.xpath("//body/p")).getText();
		System.out.println(text1);
		
		driver.switchTo().defaultContent();		
		String text2 = driver.findElement(By.cssSelector("[id=\"framesWrapper\"] > div")).getText();
		System.out.println(text2);
	}
}
