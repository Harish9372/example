package LaunchBrowsers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class iframe2 {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://theakio.com/");
		
		//FIND THE WEBELEMNT ON THAT IFRAME BY USING ID OR XPATH
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class=\"bv-lazyload-iframe\"]"));
		action.scrollToElement(iframe).perform();
		
		//SWITCH THE DRIVER CONTROL FROM MAINFRAME(NORMAL) TO CHILD FRAME(IFRAME)
		driver.switchTo().frame(iframe);
		
		driver.findElement(By.xpath("//a[text()=\"View larger map\"]")).click();
		
      
	}
	

	
}
