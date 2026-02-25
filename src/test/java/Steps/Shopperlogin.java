//package Steps;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class Shopperlogin {
//WebDriver driver;
//	@Given("user should be navigate to the application")
//	public void userNavigateApplication() {
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.shoppersstack.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		
//		}
//	
//	@Given("user click on the login link")
//	public void userClickOnTheLoginLink() {
//	   driver.findElement(By.id("loginBtn")).click();
//	   
//		
//	}
//	@Given("user enter the username and password")
//	public void userEnterTheUsernameAndPassword() {
//		
//		driver.findElement(By.id("Email")).sendKeys("bharishkumar.1999@gmail.com");
//		driver.findElement(By.id("Password")).sendKeys("Harish@1999");
//	  
//	}
//	@When("user click on the login button")
//	public void userClickOnTheLoginButton() {
//	   
//		driver.findElement(By.id("Login")).click();
//	}
//	@Then("login should successful")
//	public void loginShouldSuccessful() {
//	  
//		WebElement element = driver.findElement(By.tagName("h3"));
//		
//		if(element.getText().equals("Hello, Harish")) {
//		System.out.println("Login Should Be Successful");
//		}
//		else
//		{
//			System.out.println("Login Should Failed");
//		}
//	}
//}
