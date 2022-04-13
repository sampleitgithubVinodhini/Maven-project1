package com.hj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bs {
	
		public static WebDriver driver;
		public static void BL()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vinodhini\\eclipse-Workspace1\\Selenium_Testing\\Driver 2\\chromedriver.exe");
			driver =new ChromeDriver();
		
		}
	public static void URL()
	{
		driver.get("https://adactinhotelapp.com/");
	}

	public static void un()
	{
	WebElement newreg = driver.findElement(By.id("username"));
	newreg.sendKeys("vinouma1234");
	}


	public static void psw()
	{
		WebElement pass = driver.findElement(By.name("password"));
	pass.sendKeys("TBAIZA");

	}
	public static void lgn()
	{

	WebElement login = driver.findElement(By.name("login"));
	login.click();

	}
	}


