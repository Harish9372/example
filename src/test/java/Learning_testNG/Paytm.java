package Learning_testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Paytm {

	@Test
	
	public void paytmTest() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://paytm.com/");
		Thread.sleep(2000);
	
		Actions a1 = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//span[@id='srcCode']"));
		a1.moveToElement(element).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		driver.findElement(By.xpath("//input[@class='_2D0RF']")).sendKeys("Rajasthan");
		driver.findElement(By.xpath("//input[@class='_2D0RF']")).sendKeys("Raj");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@class='_2D0RF']")).sendKeys("Guwahati");
//		Thread.sleep(2000);
	}
	
	
}
