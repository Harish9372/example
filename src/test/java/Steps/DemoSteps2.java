package Steps;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Utilities.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoSteps2 {
	
	WebDriver driver;
	
	
	
	@Given("User Should Navigate To The Application")
	public void userShouldNavigateToTheApplication() {
		
		driver = DriverFactory.initializeDriver("chrome", "https://demowebshop.tricentis.com/");
		
		
	}
	
	@When("User Click on The Login button")
	public void user_click_on_the_login_button() {
		
	     driver.findElement(By.linkText("Log in")).click();
		
		
		
	}
	@When("User Enter The Username and Password")
	public void user_enter_the_username_and_password() {
	   
		driver.findElement(By.id("Email")).sendKeys("bharishkumar.1999@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Harish@1999");
		
	}
	@When("User Click On The Login button Again")
	public void user_click_on_the_login_button_again() {
	   
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		
		
	}
	@Then("Login is Successful")
	public void login_is_successful() {
	  
		String title = driver.getTitle();
		
		if (title.equals("Demo Web Shop")) {
			
			System.out.println("Login Is Success");
		}
		
		else {
			System.out.println("Log Is Fail");
		}
	
	driver.quit();

}
}