package com.hybridframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class App {

	@Test
	public void abc()
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driversexe/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

}
