package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Learning_Soft_Assert {

	public void loginTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/");
		
		
		 SoftAssert s1 = new SoftAssert();
		 s1.assertEquals(driver.getTitle(),"Demo Web","Validating Welcome Page");
		 Reporter.log("Welcome page Displayed Successfully");
		 driver.findElement(By.linkText("Log in")).click();
		 
		 s1.assertEquals(driver.getTitle().contains("Login"),true, "Validating Login Page");
		 Reporter.log("Login Page Displayed Successfully",true);
		 driver.findElement(By.id("Email")).sendKeys("bharishkumar.1999@gmail.com");
		 driver.findElement(By.id("Password")).sendKeys("Harish@1999");
		 //Thread.sleep(1000);
	     driver.findElement(By.xpath("//input[@value='Log in']")).click();
	     Reporter.log("User Logged In Successfully",true);
	     WebElement element = driver.findElement(By.linkText("Log out"));
	     
	     
	     s1.assertEquals(element.isDisplayed(), true);
	     element.click();
	     driver.quit();
	}
}



	