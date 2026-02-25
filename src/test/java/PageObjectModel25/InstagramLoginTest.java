package PageObjectModel25;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InstagramLoginTest {

	private WebDriver driver;
	InstagramLogin insta;
	@BeforeClass
	
	public void setup() {
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		insta = new InstagramLogin(driver);
		
	}
	@Test
	
	public void validdata() {
		
		insta.enterusername("harish");
		insta.enterpassword("8098551129");
		insta.clickloginbutton();
	}
	@AfterClass
	public void teardown() {
		driver.close();
	}
	
	
	
}
