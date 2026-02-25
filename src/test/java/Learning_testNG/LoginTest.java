package Learning_testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

	@Test
	
	public void loginTest() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		
		
		driver.findElement(By.id("Email")).sendKeys("harish@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("harish@123");
		Thread.sleep(2000);
		driver.findElement(By.id("//input[@class='button-1 login-button']")).click();
		
		
		
		
		
	}
	
}
