package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.Utilities.DriverFactory;

import Pages.loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {
	
	WebDriver driver;
	loginpage lg;
	
	
	@Given("User Should Navigate To The Application")
	public void userShouldNavigateToTheApplication() {
	   
		driver = DriverFactory.getdriver();
		driver.get("https://demowebshop.tricentis.com/");
		lg = new loginpage(driver);
		
		
	}
	@Given("User Click On The Login Text Link")
	public void userClickOnTheLoginTextLink() {
		
		lg.loginlinkfield();
	   
		
	}
	@Given("User Enter The Username and Password")
	public void userEnterTheUsernameAndPassword() {
	 
		lg.logincredentials("bharishkumar.1999@gmail.com", "Harish@1999");
		
	}
	@When("User Click On The Login button")
	public void userClickOnTheLoginButton() {
	   
		lg.loginbutton();
		
		
	}
	@Then("Login Is Successful")
	public void loginIsSuccessful() {
	 
       WebElement element = driver.findElement(By.xpath("//a[text()='bharishkumar.1999@gmail.com']"));
       Assert.assertTrue(element.isDisplayed());
		System.out.println("LOGIN IS SUCCESSFULL");
		
	}
	
	
	

}
