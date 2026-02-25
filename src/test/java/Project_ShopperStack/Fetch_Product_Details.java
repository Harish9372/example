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

public class Fetch_Product_Details {

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
				
					driver.findElement(By.xpath("//input[@id='search']")).sendKeys("shirts");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[name()='svg' and @id='searchBtn']")).click();
					Thread.sleep(5000);
					
					driver.findElement(By.xpath("//span[text()='Boys  Collar Casual tShirt']")).click();
					String details = driver.findElement(By.xpath("//h2[text()='allen solly']/ancestor::section[@class='ProductDisplay_productDisplayBlock__KBpfM']")).getText();
					System.out.println(details);
					String details1 = driver.findElement(By.xpath("//h2[text()='allen solly']/ancestor::section[@class='ProductDisplay_productDisplayBlock__KBpfM']/descendant::span[text()='440']")).getText();
		            System.out.println(details1);
		            
//		            TakesScreenshot ts = (TakesScreenshot) driver;
//					File source = ts.getScreenshotAs(OutputType.FILE);
//					File destination = new File("./path of file/ShoppersStackProductDetailsSS.png");
//					FileHandler.copy(source, destination);
//					
				}		
	}
			}
}
}