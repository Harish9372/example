package PageObjectModel25;


	
	

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class facebooklogintest {

	private WebDriver driver;
	 FacebookLogin FacebookLogin;

	@BeforeMethod
	public void setUp() {
		
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		driver.manage().window().maximize();
		FacebookLogin=new FacebookLogin(driver);
	}

	@Test
		public void ValidLogin() {
			FacebookLogin.enterUserName("7619114543");
			FacebookLogin.enterPassword("Roopa@123");
			FacebookLogin.clickLoginButton();
		}
//	@AfterMethod
//		public void tearDown() {
//			driver.quit();
//		}
		
	}


