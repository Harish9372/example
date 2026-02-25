package com.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	private static WebDriver driver;
	
	public static WebDriver initializeDriver(String browser, String link) {
		if(browser.equals("chrome")) {
			
			driver= new ChromeDriver();
			
		}
		else if (browser.equals("firefox")) {
			
			driver = new FirefoxDriver();
			
		}
		else if (browser.equals("edge")) {
			
			driver = new EdgeDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.get(link);
		return driver;
	}
	
	public static WebDriver getdriver() {
		
		return driver;
		
		
	}

	public static void quitdriver() {
		
		driver.quit();
		
	}
}
