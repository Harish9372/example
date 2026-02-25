package JPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.genericUtilities.Webdriver_Utility;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://shino.de/parkcalc/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement element = driver.findElement(By.id("ParkingLot"));
		Select sc = new Select(element);
		sc.selectByIndex(1);
		WebElement element2 = driver.findElement(By.id("StartingDate"));
		a.moveToElement(element2).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		driver.findElement(By.id("StartingDate")).sendKeys("04/05/2025");
//		
//		driver.findElement(By.id("LeavingDate")).sendKeys("04/05/2025");
//		driver.findElement(By.xpath("//input[@name='Submit']")).click();
//		
//		Assert.assertEquals(true,"estimated parking cost 12","parking rates 18" );
//		
		
		
	}

}
