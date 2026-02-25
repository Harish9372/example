package Project_ShopperStack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Edit_Address_Page {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle().equals("ShoppersStack"),true,"Welcome Page Open Successfully");

			//Thread.sleep(2000);
			driver.findElement(By.name("loginBtn")).click();
			
			
			Assert.assertEquals(driver.getTitle().contains("Login"),true,"Login Page Open Successfully");

				driver.findElement(By.id("Email")).sendKeys("bharishkumar.1999@gmail.com");
				driver.findElement(By.id("Password")).sendKeys("Harish@1999");
				driver.findElement(By.id("Login")).click();
				String text = driver.findElement(By.xpath("//h3")).getText();
				
				Assert.assertEquals(text.contains("Harish"),true);
					System.out.println("USER HAS LOGGED IN SUCCESSFULLY");
					
					driver.findElement(By.xpath("//div[text()='H']")).click();			
					driver.findElement(By.xpath("//li[text()='My Profile']")).click();
					driver.findElement(By.xpath("//div[text()='My Addresses']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("(//*[name()='svg' and @class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv' and @viewBox='0 0 24 24'])[4]")).click();
					//Thread.sleep(1000);
					Actions a1 = new Actions(driver);
					
					WebElement element = driver.findElement(By.id("House/Office Info"));
					a1.moveToElement(element).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
					Thread.sleep(1000);
					driver.findElement(By.id("House/Office Info")).sendKeys("No.777");
				    Thread.sleep(2000);
					WebElement element1 = driver.findElement(By.id("Street Info"));
					a1.moveToElement(element1).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
					Thread.sleep(1000);
					driver.findElement(By.id("Street Info")).sendKeys("Richie Street");
				    Thread.sleep(2000);
				    
				    WebElement element2 = driver.findElement(By.id("Landmark"));
					a1.moveToElement(element2).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
					Thread.sleep(1000);
					driver.findElement(By.id("Landmark")).sendKeys("Prathyusha Engineering College");
				    Thread.sleep(2000);
				
					//WebElement element5 = driver.findElement(By.xpath("(//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiInputBase-input MuiInput-input'])[3]"));
					//Select s3 = new Select(element5);
				//	s3.selectByVisibleText("Vellore");
				//	Thread.sleep(1000);
					
					WebElement element6 = driver.findElement(By.id("Pincode"));
					a1.moveToElement(element6).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
					Thread.sleep(1000);
					driver.findElement(By.id("Pincode")).sendKeys("600021");
				    Thread.sleep(2000);
					
					WebElement element7 = driver.findElement(By.id("Phone Number"));
					a1.moveToElement(element7).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
					Thread.sleep(1000);
					driver.findElement(By.id("Phone Number")).sendKeys("8940755984");
				    Thread.sleep(2000);
					
					driver.findElement(By.xpath("//button[text()='Update Address']")).click();
					Thread.sleep(1000);
					
//					TakesScreenshot ts = (TakesScreenshot) driver;
//					File source = ts.getScreenshotAs(OutputType.FILE);
//					File destination = new File("./path of file/ShoppersStackEditedAddressSS.png");
//					FileHandler.copy(source, destination);
//		
		
					
				}		
	}



