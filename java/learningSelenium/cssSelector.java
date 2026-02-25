package learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("[type='text']")).sendKeys("harish@gmail.com");
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("harish@123");
		driver.findElement(By.cssSelector("[type='submit']")).click();

	}

}
