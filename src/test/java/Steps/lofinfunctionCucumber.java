package Steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class lofinfunctionCucumber {
	WebDriver driver;
	
	@Given("user navigate to the login page")
	public void usernavigatetotheloginpage() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		
		
	}
	
	@When("user click on that login button")
	public void user_click_on_that_login_button() {
	   
		
		driver.findElement(By.xpath("//a[@id='login_Layer']")).click();;
		
	}
	@When("user enter the username and password")
	public void user_enter_the_username_and_password() {
	  
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("bharishbabu.1999@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Harish@1999");
		
	}
	@When("user click on the login button")
	public void user_click_on_the_login_button() {
	    
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
	}
	@Then("login is successfull")
	public void login_is_successfull() {
	   
		System.out.println("Login is Succesfull");
	}

}
