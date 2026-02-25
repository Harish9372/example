package StepDefinitions;

import org.openqa.selenium.WebDriver;

import com.Utilities.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	WebDriver driver;
	
	@Before
	public void setup() {
		
	//	driver = DriverFactory.initializeDriver("chrome");
		
		
	}
	
	@After
	public void tearDown() {
		
		DriverFactory.quitdriver();
	}
	
	

}
