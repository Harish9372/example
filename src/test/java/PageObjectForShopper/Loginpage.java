package PageObjectForShopper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver driver;
	
	
	@FindBy(id ="loginBtn")
	WebElement previousloginbutton;
	
	@FindBy(id = "Email")
	WebElement usernamefield;
	
	@FindBy(id ="Password")
	WebElement passwordfield;
	
	@FindBy(id ="Login")
	WebElement loginbutton;
	
	//CREATE A CONSTRUCTOR
	
	public Loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//HERE WE PERFORM ACTIONS
	
	public void logintest(String username , String password) {
		
		previousloginbutton.click();
		usernamefield.sendKeys(username);
		passwordfield.sendKeys(password);
		loginbutton.click();
		
		
	}
	
	
}
