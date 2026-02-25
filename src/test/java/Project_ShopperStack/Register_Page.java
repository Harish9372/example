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
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Register_Page {

	@Test
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.shoppersstack.com/");
		Assert.assertEquals(driver.getTitle(),"ShoppersStack","Validating Welcome Page");
		Reporter.log("Welcome Page Displayed Successfully", true);
		
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		Thread.sleep(2000);
        Assert.assertEquals(driver.getTitle().contains("Login"),true,"Validating ");
		driver.findElement(By.id("Create Account")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("First Name")).sendKeys("Harish");
		driver.findElement(By.name("Last Name")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@id='Male']")).click();
		driver.findElement(By.name("Phone Number")).sendKeys("6369948578");
		driver.findElement(By.name("Email Address")).sendKeys("bharishkumar.1999@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Harish@1999");
		driver.findElement(By.name("Confirm Password")).sendKeys("Harish@1999");
		driver.findElement(By.id("Terms and Conditions")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		Thread.sleep(3000);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./path of file/ShoppersStackRegisterSS.png");
		FileHandler.copy(source, destination);
	}

}
