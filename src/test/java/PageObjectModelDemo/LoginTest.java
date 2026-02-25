package PageObjectModelDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class LoginTest {

	private WebDriver driver;
	Login log;
	
	
	@BeforeMethod
	public void set() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		log= new Login(driver);
		
		}
	
	@Test 
	
	public void logintest() {
		log.UserTextField("Harish");
		log.PassTextField("Harish@123");
		log.LoginButton();
	}

	
	@AfterMethod
	
	public void teardown() {
		
	//	driver.close();
	}
	
}
