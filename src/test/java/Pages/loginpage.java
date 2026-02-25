package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	WebDriver driver;
	
	@FindBy(linkText  ="Log in")
	WebElement loginlink;
	
	@FindBy(id = "Email")
	WebElement usernamefield;
	
	@FindBy(id = "Password")
	WebElement passwordfield;
	
	@FindBy(xpath = "//input[contains(@class,'button-1 login-button')]")
	WebElement loginbutton;
	
	
	
	public loginpage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginlinkfield() {
		
		loginlink.click();
	}
	
	public void logincredentials(String username, String password) {
		
		
		usernamefield.sendKeys(username);
		passwordfield.sendKeys(password);
	}
	
	public void loginbutton() {
		
		loginbutton.click();
	}
	
	
		
	

}
