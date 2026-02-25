package Project_ShopperStack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;

public class Upload_Profile_Photo {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle().equals("ShoppersStack"),true,"Validating Welcome Page " );
	    Thread.sleep(2000);
			driver.findElement(By.name("loginBtn")).click();
			
			Assert.assertEquals(driver.getTitle().contains("Login"),true,"Login Page Successfully Open");
			
				driver.findElement(By.id("Email")).sendKeys("bharishkumar.1999@gmail.com");
				driver.findElement(By.id("Password")).sendKeys("Harish@1999");
				driver.findElement(By.id("Login")).click();
				String text = driver.findElement(By.xpath("//h3")).getText();
				Assert.assertEquals(text.contains("Harish"),true);
					
					System.out.println("USER HAS LOGGED IN SUCCESSFULLY");
					
					driver.findElement(By.xpath("//div[text()='H']")).click();			
					driver.findElement(By.xpath("//li[text()='My Profile']")).click();
					driver.findElement(By.xpath("//*[name()='svg' and @data-testid='AddPhotoAlternateOutlinedIcon']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\ELCOT\\Downloads\\logo_11zon.jpg");
					driver.findElement(By.xpath("//button[text()='upload']")).click();
					Thread.sleep(2000);
					
					TakesScreenshot ts = (TakesScreenshot) driver;
					File source = ts.getScreenshotAs(OutputType.FILE);
					File destination = new File("./path of file/ShoppersStackUploadPhotoSS.png");
					FileHandler.copy(source, destination);
	}			
	}


