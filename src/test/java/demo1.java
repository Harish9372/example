import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/radio-buttons");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Actions ac = new Actions(driver);
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("football")));
		
		ac.scrollToElement(element).perform();
//		Thread.sleep(2000);
//		element.click();
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		//Thread.sleep(500);
		//element.click();
		
		
	}

}
