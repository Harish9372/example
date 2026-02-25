//package Steps;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

//
//public class Demo2 {
//	WebDriver driver;
//	@Given("User Should Navigate To The Application")
//	public void userShouldNavigateToTheApplication() {
//	    
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://demowebshop.tricentis.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		
//	}
//	@Given("User Click On The Login Link Text")
//	public void userClickOnTheLoginLinkText() {
//	   
//		driver.findElement(By.linkText("Log in")).click();
//		
//	}
//	@Given("User Login As {string} and {string}")
//	public void userLoginAsAnd(String username, String password) throws InterruptedException {
//	   
//		driver.findElement(By.id("Email")).sendKeys(username);
//		Thread.sleep(1000);
//		driver.findElement(By.id("Password")).sendKeys(password);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
//		Thread.sleep(3000);
//		
//	}
//	@When("User Search The {string}")
//	public void userSearchThe(String product) throws InterruptedException {
//	    
//		driver.findElement(By.id("small-searchterms")).sendKeys(product,Keys.ENTER);
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
//		Thread.sleep(5000);
//		
//	}
//	@Then("The Card Badge Should Be Updated")
//	public void theCardBadgeShouldBeUpdated() {
//	   
//		String text = driver.findElement(By.xpath("//span[@class='cart-qty']")).getText();
//		if(text.equals("(1)")) {
//			
//			System.out.println("Updated");
//		}
//		else
//		{
//			System.out.println("Not Updated");
//		}
//		Assert.assertEquals(Integer.parseInt(text)>(0),true);
////		System.out.println("Updated");
//		driver.quit();
//	}
//}
