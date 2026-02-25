import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class naukri {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		 Actions a = new  Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("bharishbabu.1999@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Harish@1999");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//a[text()='View']")).click();
		driver.findElement(By.xpath("//em[text()='editOneTheme']")).click();
		Thread.sleep(1000);
		//String windowHandle = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//input[@class='currency-input ']")).click();
		
		WebElement element = driver.findElement(By.xpath("//input[@class='currency-input ']"));
        a.moveToElement(element).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@class='currency-input ']")).sendKeys("370000");
	}

}
