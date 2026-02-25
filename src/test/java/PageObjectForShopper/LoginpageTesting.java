package PageObjectForShopper;

import java.time.Duration;

import org.testng.annotations.Test;

public class LoginpageTesting extends Basetest {

	@Test
	public void LoginTesting() throws InterruptedException {
		
		driver.get("https://www.shoppersstack.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Loginpage log = new Loginpage(driver);
		log.logintest("bharishkumar.1999@gmail.com", "Harish@1999");
		
	}
	
	
	
}
