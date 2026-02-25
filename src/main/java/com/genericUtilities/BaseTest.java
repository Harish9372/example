package com.genericUtilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.objectRepository.HomePage;
import com.objectRepository.LoginPage;
import com.objectRepository.WelcomePage;

public class BaseTest {

	public WebDriver driver;
	public static WebDriver sDriver;
	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void launchBrowser(@Optional("chrome") String browser) {
		if (browser.equals("chrome")) {
			driver= new ChromeDriver();
		}
		else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}		
		else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/");
		sDriver=driver;
	}
	@BeforeMethod
	public void loginToDws() {
		
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();
		LoginPage lp = new LoginPage(driver);
		lp.getEmailTextField().sendKeys(File_Utility.getPropertyData("username"));
		lp.getPasswordTextField().sendKeys(File_Utility.getPropertyData("password"));
		lp.getLoginButton().click();
		
	}
	@AfterMethod
	public void logoutToDws() {
		
		HomePage hp =  new HomePage(driver);
		hp.getLogoutButton().click();
		
		
	}
	@AfterClass
	public void closeBrowser() {
		
		driver.quit();
	}
}
