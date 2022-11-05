package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionButtonExample {
	
	@Test(description = "Action class method example single click, double click, right click")
	public void testAlert() {
		WebDriverManager.chromedriver().setup();	
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/buttons");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		action.doubleClick(driver.findElement(By.id("doubleClickBtn"))).perform();
		String message = driver.findElement(By.id("doubleClickMessage")).getText();
		Assert.assertEquals(message, "You have done a double click");
		
		action.contextClick(driver.findElement(By.id("rightClickBtn"))).perform();
		String text1 = driver.findElement(By.id("rightClickMessage")).getText();
		Assert.assertEquals(text1, "You have done a right click");
		
		action.click(driver.findElement(By.xpath("//button[text()='Click Me']"))).perform();
		String text2 = driver.findElement(By.id("dynamicClickMessage")).getText();
		Assert.assertEquals(text2, "You have done a dynamic click");
	}
	
	@Test
	public void testDragAndDrop() {
		WebDriverManager.chromedriver().setup();	
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/droppable");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		WebElement sourceElement = driver.findElement(By.id("draggable"));
		WebElement targetElement = driver.findElement(By.id("droppable"));
		action.dragAndDrop(sourceElement, targetElement).perform();
		
		String text = driver.findElement(By.cssSelector("div[id='droppable'] > p")).getText();
		Assert.assertEquals(text, "Dropped!");
	}
	
	
	@Test
	public void testDragAndAtLocation() {
		WebDriverManager.chromedriver().setup();	
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/dragabble");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		WebElement sourceElement = driver.findElement(By.cssSelector("[id=\"dragBox\"]"));
		Point loc = sourceElement.getLocation();
		System.out.println(loc.x + " "+ loc.y);
		
		action.dragAndDropBy(sourceElement, 200, 200).perform();
		
		loc = sourceElement.getLocation();
		System.out.println(loc.x + " "+ loc.y);
		
		Dimension dim = sourceElement.getSize();
		System.out.println(dim.height + " "+ dim.width);
		
	}
	
	@Test
	public void testMouseHover() {
		WebDriverManager.chromedriver().setup();	
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/menu");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Sub Sub Item 2']")).click();
		
		Actions action = new Actions(driver);
		WebElement mainMenu = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		WebElement secondMenu = driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
		WebElement element = driver.findElement(By.xpath("//a[text()='Sub Sub Item 2']"));
		action.moveToElement(mainMenu).pause(1000).moveToElement(secondMenu)
			.click(element).build().perform();
		
	}

}
