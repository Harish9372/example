package PageObjectModel25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InstagramLogin {
	WebDriver driver;
	
	private By usernamefield = By.xpath("//input[@aria-label=\"Phone number, username, or email\"]");
	private By passfield = By.xpath("//input[@aria-label=\"Password\"]");
	private By loginbutton = By.xpath("//div[text()='Log in']");
	
	public InstagramLogin(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void enterusername(String username) {
		driver.findElement(usernamefield).sendKeys(username);
		
		}
	public void enterpassword(String password) {
		driver.findElement(passfield).sendKeys(password);
	}
	public void clickloginbutton() {
		driver.findElement(loginbutton).click();
	}
	

}
