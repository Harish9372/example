package testScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.genericUtilities.BaseTest;
import com.genericUtilities.Webdriver_Utility;

public class CartTest extends BaseTest {

	@Test  (groups =  "smokegroup")
	public void AddToCartTest() throws IOException, InterruptedException {
		
		driver.findElement(By.name("q")).sendKeys("laptop",Keys.ENTER);
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		driver.findElement(By.partialLinkText("Shopping cart")).click();
		Webdriver_Utility.takeScreenshot(driver);
		Thread.sleep(2000);
//		
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File destination = new File("./screenshots/addToCartSS.png");
//		FileHandler.copy(source, destination);
//		Thread.sleep(2000);
	}
	@Test  (groups =  "regressiongroup")
	
	public void removeFromCartTest() throws IOException, InterruptedException {
		
		driver.findElement(By.partialLinkText("Shopping cart")).click();
		driver.findElement(By.name("removefromcart")).click();
		driver.findElement(By.name("updatecart")).click();
		Webdriver_Utility.takeScreenshot(driver);
		Thread.sleep(2000);
		
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File destination = new File("./screenshots/removefromCartSS.png");
//		FileHandler.copy(source, destination);
//		Thread.sleep(2000);
	}
}
