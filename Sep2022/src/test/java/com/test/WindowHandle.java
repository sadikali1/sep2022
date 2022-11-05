package com.test;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	@Test
	public void testWindowHandle() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.navigate().to("https://demoqa.com/browser-windows");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.findElement(By.id("tabButton")).click();
		
		String parentWinId = driver.getWindowHandle();
		Set<String> winids = driver.getWindowHandles();
		
		for(String win : winids) {
			driver.switchTo().window(win);
		}
		
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
		driver.close();
		
		driver.switchTo().window(parentWinId);
		driver.findElement(By.id("windowButton")).click();
		
	}

}
