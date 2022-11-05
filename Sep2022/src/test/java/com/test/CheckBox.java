package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
	
	@Test
	public void testCheckBox() {
		WebDriverManager.chromedriver().setup();	
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/checkbox");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		boolean status = driver.findElement(By.cssSelector("[id=\"tree-node-home\"]")).isSelected();
		System.out.println(status);
		driver.findElement(By.cssSelector("[class='rct-title']")).click();
		status = driver.findElement(By.cssSelector("[id=\"tree-node-home\"]")).isSelected();
		System.out.println(status);		
	}
	
	
	@Test
	public void testRadio() {
		WebDriverManager.chromedriver().setup();	
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/radio-button");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		boolean status = driver.findElement(By.cssSelector("[id=\"yesRadio\"]")).isSelected();
		System.out.println(status);
		driver.findElement(By.cssSelector("[for='yesRadio']")).click();
		status = driver.findElement(By.cssSelector("[id=\"yesRadio\"]")).isSelected();
		System.out.println(status);		
	}

}
