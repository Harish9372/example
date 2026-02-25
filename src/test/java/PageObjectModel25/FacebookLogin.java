package PageObjectModel25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookLogin {

	WebDriver driver;
	
	//Page Locators
	private By usernameField=By.id("email");
	private By UserPassword=By.id("pass");
	private By LoginButton=By.id("loginbutton");
	private By FaceBookHeader=By.xpath("//*[@alt='Facebook']");
	
    
	public FacebookLogin(WebDriver driver) {
		this.driver=driver;
	}
		public void enterUserName(String email){
			driver.findElement(usernameField).sendKeys(email);		
		}
		
		public void enterPassword(String password) {
			
			driver.findElement(UserPassword).sendKeys(password);
		}
		public void clickLoginButton() {
			driver.findElement(LoginButton).click();
		}
		
	}
	
	
