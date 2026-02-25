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

public class Edit_Profile {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(2000);
		
			Assert.assertEquals(driver.getTitle().equals("ShoppersStack"),true,"Welcome Page Open Successfully");
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
				    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
				    Thread.sleep(2000);
					
				    Actions a1 = new Actions(driver);
				    WebElement element = driver.findElement(By.id("First Name"));
				    a1.moveToElement(element).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
					driver.findElement(By.id("First Name")).sendKeys("Dhoni");
					Thread.sleep(1000);
					
					WebElement element2 = driver.findElement(By.id("Last Name"));
					a1.moveToElement(element2).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
					driver.findElement(By.id("Last Name")).sendKeys("Msd");
					Thread.sleep(1000);
					
					WebElement element3 = driver.findElement(By.id("Phone Number"));
					a1.moveToElement(element3).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
					driver.findElement(By.id("Phone Number")).sendKeys("89407559884");
					Thread.sleep(1000);
					
					WebElement element4 = driver.findElement(By.id("Country"));
					Select s1 = new Select(element4);
					s1.selectByVisibleText("India");
					Thread.sleep(1000);
					
					WebElement element5 = driver.findElement(By.id("State"));
					Select s2 = new Select(element5);
					s2.selectByVisibleText("Tamil Nadu");
					Thread.sleep(1000);
					
					WebElement element6 = driver.findElement(By.id("City"));
					Select s3 = new Select(element6);
					s3.selectByVisibleText("Chennai");
					Thread.sleep(1000);
					
					driver.findElement(By.xpath("//button[text()='Submit']")).click();
					driver.switchTo().alert().accept();
					Thread.sleep(2000);
					
					TakesScreenshot ts = (TakesScreenshot) driver;
					File source = ts.getScreenshotAs(OutputType.FILE);
					File destination = new File("./path of file/ShoppersStackEditProfileSS.png");
					FileHandler.copy(source, destination);
	}
}

	