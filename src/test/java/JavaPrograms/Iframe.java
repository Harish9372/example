package JavaPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframe {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.selenium.dev/selenium/web/iframes.html");
		//SWITCH TO IFRAME USING WEB ELEMENT
		WebElement iframe = driver.findElement(By.id("iframe1"));
		
		//SWITCH TO MAIN FRAME TO CHILD FRAME THAT MEANS SWITCH TO THE FRAME 
		driver.switchTo().frame(iframe);
		
		driver.findElement(By.id("email")).sendKeys("harish");
		driver.findElement(By.id("age")).sendKeys("25");
		driver.findElement(By.id("imageButton")).click();
		driver.switchTo().defaultContent();
		action.contextClick().perform();
		
		
		
	}
	
}
