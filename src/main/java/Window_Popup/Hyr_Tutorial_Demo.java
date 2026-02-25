package Window_Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hyr_Tutorial_Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
//		driver.switchTo().frame(driver.findElement(By.xpath("")));
//		WebElement element = driver.findElement(By.id("course"));
//		Select s1 = new Select(element);
//		
//		s1.selectByIndex(1);
//		Thread.sleep(2000);
		
		driver.switchTo().frame(1);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("course")));
		
		WebElement element = driver.findElement(By.id("course"));
		Select s1 = new Select(element);
		s1.selectByIndex(1);
		

	}

}
