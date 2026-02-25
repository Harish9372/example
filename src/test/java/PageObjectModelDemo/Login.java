package PageObjectModelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Login {

	private WebDriver driver;
	
	
	private  By TextField = By.id("email");
	private By PassField = By.id("pass");
	private By LoginButton = By.name("login");
	
	
	public Login(WebDriver driver) {
		
		this.driver= driver;
		
	}
	
	public void UserTextField(String Email) {
		
		driver.findElement(TextField).sendKeys(Email);
		
	}
	public void PassTextField(String Pass) {
		
		driver.findElement(PassField).sendKeys(Pass);
	}
	
	public void LoginButton() {
		driver.findElement(LoginButton).click();
	}
	
	
}
