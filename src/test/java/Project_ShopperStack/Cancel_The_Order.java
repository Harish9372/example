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
import org.testng.Assert;

public class Cancel_The_Order {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.shoppersstack.com/");
		//Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle().equals("ShoppersStack"),true,"Welcome Page Open Successfully");

			Thread.sleep(2000);
			driver.findElement(By.name("loginBtn")).click();
			
			Assert.assertEquals(driver.getTitle().contains("Login"),true,"Login Page Open Successfully");

				Thread.sleep(1000);
				driver.findElement(By.id("Email")).sendKeys("bharishkumar.1999@gmail.com");
				driver.findElement(By.id("Password")).sendKeys("Harish@1999");
				driver.findElement(By.id("Login")).click();
				String text = driver.findElement(By.xpath("//h3")).getText();
				Assert.assertEquals(text.contains("Harish"),true);

					
					System.out.println("USER HAS LOGGED IN SUCCESSFULLY");
					Thread.sleep(1000);
					driver.findElement(By.id("mensProd")).click();
					driver.findElement(By.xpath("(//button[text()='add to cart'])[1]")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[name()='svg' and @id='cartIcon']")).click();
					driver.findElement(By.id("buynow_fl")).click();
					
					WebElement element4 = driver.findElement(By.xpath("//input[@name='address']"));
					element4.click();
					driver.findElement(By.xpath("//button[text()='Proceed']")).click();
					WebElement element = driver.findElement(By.xpath("//input[@value='COD']"));	
					element.click();
					driver.findElement(By.xpath("//button[text()='Proceed']")).click();
					Thread.sleep(9000);
					driver.findElement(By.xpath("//div[text()='H']")).click();
					driver.findElement(By.xpath("//li[text()='My Orders']")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//button[text()='Cancel Order']")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//button[text()='Yes']")).click();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
					Thread.sleep(2000);
					
					TakesScreenshot ts = (TakesScreenshot) driver;
					File source = ts.getScreenshotAs(OutputType.FILE);
					File destination = new File("./path of file/ShoppersStackCancelTheOrderSS.png");
					FileHandler.copy(source, destination);
					
				}	
}


