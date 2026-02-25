package testScripts;

import java.io.File;
import java.io.IOException;
import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;
import org.testng.internal.BaseTestMethod;

import com.genericUtilities.BaseTest;
import com.genericUtilities.Webdriver_Utility;

public class wishListTest extends BaseTest {

	@Test  (groups = "smokegroup")	
	public void addToWishList() throws IOException, InterruptedException {
		
		driver.findElement(By.partialLinkText("APPAREL & SHOES")).click();
		driver.findElement(By.xpath("//a[text()=\"50's Rockabilly Polka Dot Top JR Plus Size\"]")).click();
		driver.findElement(By.id("add-to-wishlist-button-5")).click();
		driver.findElement(By.partialLinkText("Wishlist")).click();
		Webdriver_Utility.takeScreenshot(driver);
		Thread.sleep(2000);
		
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File destination = new File("./TestNG ScreenShot/addToCartSS.png");
//		FileHandler.copy(source, destination);
//		Thread.sleep(2000);
	}
	
	@Test  (groups =  "regressiongroup")
	public void removeFromWishlist() throws IOException, InterruptedException {
		driver.findElement(By.partialLinkText("Wishlist")).click();
		driver.findElement(By.xpath("//a[text()=\"50's Rockabilly Polka Dot Top JR Plus Size\"]/ancestor::tr/descendant::input[@name='removefromcart']")).click();
		driver.findElement(By.name("updatecart")).click();
		Webdriver_Utility.takeScreenshot(driver);
		Thread.sleep(2000);
		
		
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File destination = new File("./TestNG ScreenShot/removefromCartSS.png");
//		FileHandler.copy(source, destination);
//		Thread.sleep(2000);
	}
}
