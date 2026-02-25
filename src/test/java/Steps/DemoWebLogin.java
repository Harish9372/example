//package Steps;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class DemoWebLogin {
//	WebDriver driver;
//	@Given("User Should Navigate To The Application")
//	public void UserShouldNavigateToTheApplication() {
//		
//	    driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://demowebshop.tricentis.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		
//		
//	}
//	
//	@Given("User Click On The Login Text Link")
//	public void userClickOnTheLoginTextLink() {
//	   
//		driver.findElement(By.linkText("Log in")).click();
//		
//	}
//	@Given("User Enter The Username and Password")
//	public void userEnterTheUsernameAndPassword() {
//	    
//		driver.findElement(By.id("Email")).sendKeys("bharishkumar.1999@gmail.com");
//		driver.findElement(By.id("Password")).sendKeys("Harish@1999");
//		
//	}
//	@When("User Click On The Login Button")
//	public void userClickOnTheLoginButton() {
//	   
//		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
//		
//	}
//	@Then("Login Is Successful")
//	public void loginIsSuccessful() {
//	    
//		System.out.println("Login Successful");
//		
//	}
//	
//	
//
//}
