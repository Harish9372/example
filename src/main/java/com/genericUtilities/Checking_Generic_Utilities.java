package com.genericUtilities;

import java.io.IOException;
import java.time.Duration;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.genericUtilities.Webdriver_Utility;
import com.objectRepository.HomePage;

public class Checking_Generic_Utilities extends BaseTest{

	@Test

	public void flipkart() throws InterruptedException, IOException {
		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.get("https://www.flipkart.com/");
//		Thread.sleep(2000);
		
		
//		WebElement element = driver.findElement(By.name("q"));
//		
//		Webdriver_Utility.sendData(driver, element, "mobile");
//		
		WebElement name = driver.findElement(By.id(""));
		Webdriver_Utility.takeScreenshot(name);
		Listerner_Implementation LI = new Listerner_Implementation();
		LI.onTestFailure(null);
		launchBrowser("chrome");
	
		
		
		
		
		
	}
	
	
}
