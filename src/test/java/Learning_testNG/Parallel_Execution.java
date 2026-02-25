package Learning_testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_Execution {

	@Test(invocationCount = 4, threadPoolSize = 4)
	
	public void logintest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("bharishkumar.1999@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Harish@1999");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log out")).click();
		driver.quit();
	}
	
	
}
