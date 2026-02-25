package PageObjectModel25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class frgg {

	private WebDriver driver;
	
	By username = By.id("email");
	
	
	public frgg(WebDriver driver) {
		
		this.driver=driver;
	}
}
