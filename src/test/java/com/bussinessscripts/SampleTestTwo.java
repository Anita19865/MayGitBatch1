package com.bussinessscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTestTwo {
	@Test
	public static void testTwo() throws InterruptedException {
 System.out.println("Person2 modifications");
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();	
	    driver.manage().window().maximize();
	    
	    System.out.println("Launched browser successfully");
	    System.out.println("Browser maximized successfully");
	   driver.get("https://flipkart.com");
	System.out.println("Navigated to "+driver.getCurrentUrl());
	Thread.sleep(3000);
	driver.close();
	}

	}

