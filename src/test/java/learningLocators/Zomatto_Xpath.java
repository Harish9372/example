package learningLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zomatto_Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.zomato.com/");
		driver.findElement(By.linkText("Log in")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='auth-login-ui']")));
		driver.findElement(By.xpath("//input[@class='sc-60vv3c-0 gmdLhr sc-fPXMVe iHUNmi']")).sendKeys("6369948578");
		
	    driver.findElement(By.xpath("//*[name()='svg' and @xmlns='http://www.w3.org/2000/svg' and @class='sc-rbbb40-0 fJjczH' ]")).click();
	    driver.switchTo().defaultContent();
		 
	    driver.findElement(By.xpath("//input[contains(@placeholder,'Search for restaurant,')]")).sendKeys("Vettaiyas");
		
	    
	}

}
