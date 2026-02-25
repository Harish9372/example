package learningLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IphoneDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://13.218.150.129/jobs");
		driver.findElement(By.xpath("//button[text()=' Sign In']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("bharishkumar.1999@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Abc@1234");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}