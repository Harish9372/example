package Action_Class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class flipkartAction {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(2000);
		
//		Actions ac = new Actions(driver);
//		
//		driver.findElement(By.className("Pke_EE")).sendKeys("iphone",Keys.ENTER);
//		WebElement element = driver.findElement(By.xpath("//div[text()='Apple iPhone 16 (Ultramarine, 128 GB)']"));
//		ac.scrollToElement(element).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		
		
		
	}

}
