package Window_Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.zomato.com/");
		driver.findElement(By.linkText("Log in")).click();
		
	    //	IF WILL SWITCH THE DRIVER CONTROL TOWORDS THE  FRAME 
		
		//  HERE INDEX WILL START FROM ZERO
		//driver.switchTo().frame(2);
		
		//HERE WE HAVE TO PASS STRING TYPE ID OR NAME ATTRIBUTE VALUE
		driver.switchTo().frame("auth-login-ui");
		
		//FIND THE IFRAME TAG AS A WEBELEMENT AND PASS INTO THE METHOD
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='auth-login-ui']")));
		driver.findElement(By.xpath("//input[@class='sc-60vv3c-0 gmdLhr sc-fPXMVe iHUNmi']")).sendKeys("6369948578");
		
	    driver.findElement(By.xpath("//*[name()='svg' and @xmlns='http://www.w3.org/2000/svg' and @class='sc-rbbb40-0 fJjczH' ]")).click();
	    driver.switchTo().defaultContent();
		 
	    driver.findElement(By.xpath("//input[contains(@placeholder,'Search for restaurant,')]")).sendKeys("Vettaiyas");
		
	    
	}



		
		
	}


