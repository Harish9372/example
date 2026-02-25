package Learning_testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Learning_Data_Provider {
	@DataProvider
	public String[][] loginDataProvider() {
		
		String [][] data = new String[3][2];
		data [0][0] = "bharishkumar.1999@gmail.com";
		data [0][1] = "Harish@1999";
		data [1][0] = "swamisurya20@gmail.com";
		data [1][1] = "Sk@20101996";
		data [2][0] = "dineshpavi@gmail.com";
		data [2][1] = "dineshpavi123";
		
		return data;
		
	}

	@Test(dataProvider = "loginDataProvider")
	public void loginTest(String username,String password) throws InterruptedException {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.linkText("Log in")).click();
			
			driver.findElement(By.id("Email")).sendKeys(username);
			driver.findElement(By.id("Password")).sendKeys(password);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Log out"));
			driver.quit();
			
			
			
			
		}
		
	}

	
	

