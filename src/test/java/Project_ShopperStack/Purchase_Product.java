package Project_ShopperStack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Purchase_Product {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(2000);
		if (driver.getTitle().equals("ShoppersStack")) {
			Thread.sleep(2000);
			driver.findElement(By.name("loginBtn")).click();
			
			if (driver.getTitle().contains("Login")) {
				driver.findElement(By.id("Email")).sendKeys("bharishkumar.1999@gmail.com");
				driver.findElement(By.id("Password")).sendKeys("Harish@1999");
				driver.findElement(By.id("Login")).click();
				String text = driver.findElement(By.xpath("//h3")).getText();
				if (text.contains("Harish")) {
					
					System.out.println("USER HAS LOGGED IN SUCCESSFULLY");
					
					driver.findElement(By.id("mensProd")).click();
					driver.findElement(By.xpath("(//button[text()='add to cart'])[1]")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[name()='svg' and @id='cartIcon']")).click();
					driver.findElement(By.id("buynow_fl")).click();
//					driver.findElement(By.xpath("//span[text()='Add New Address']")).click();
//					Thread.sleep(1000);
//					driver.findElement(By.id("Name")).sendKeys("Harish");
//					driver.findElement(By.id("House/Office Info")).sendKeys("No.838");
//					driver.findElement(By.id("Street Info")).sendKeys("Aranvoyal Kuppam");
//					driver.findElement(By.id("Landmark")).sendKeys("Stanadyne Ind Pvt Ltd");
//					WebElement element = driver.findElement(By.id("Country"));
//					Select s1 = new Select(element);
//					s1.selectByVisibleText("India");
//					Thread.sleep(1000);
//					
//					WebElement element2 = driver.findElement(By.id("State"));
//					Select s2 = new Select(element2);
//					s2.selectByVisibleText("Tamil Nadu");
//					Thread.sleep(1000);
//					
//					WebElement element3 = driver.findElement(By.id("City"));
//					Select s3 = new Select(element3);
//					s3.selectByVisibleText("Chennai");
//					Thread.sleep(1000);
//					
//					driver.findElement(By.id("Pincode")).sendKeys("560010");
//					driver.findElement(By.id("Phone Number")).sendKeys("6369948578");
//					driver.findElement(By.xpath("//button[text()='Add Address']")).click();
//					Thread.sleep(1000);
//					driver.switchTo().alert().dismiss();
//					Thread.sleep(2000);
					WebElement element4 = driver.findElement(By.xpath("//input[@name='address']"));
					element4.click();
					driver.findElement(By.xpath("//button[text()='Proceed']")).click();
					WebElement element5 = driver.findElement(By.xpath("//input[@value='COD']"));	
					element5.click();
					driver.findElement(By.xpath("//button[text()='Proceed']")).click();
					Thread.sleep(2000);
					
					TakesScreenshot ts = (TakesScreenshot) driver;
					File source = ts.getScreenshotAs(OutputType.FILE);
					File destination = new File("./path of file/ShoppersStackPurchaseProductSS.png");
					FileHandler.copy(source, destination);
					
				}	
	}
			}
}
}