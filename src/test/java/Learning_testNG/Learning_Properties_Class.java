package Learning_testNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Learning_Properties_Class {

	@Test
public void loginTest() throws InterruptedException, IOException {
		
		//Java Representation Object Of External File(Properties File)
		FileInputStream fis = new FileInputStream("C:\\Users\\B Harish\\eclipse-workspace\\LearningSelenium\\src\\main\\resources\\testData\\commonDataFile.properties");
		
		//Create An Object Of Properties Class
		Properties prop = new Properties();
		
		//Load The File From FileInputStream Object To Properties Object
		prop.load(fis);
		
		//Fetch The Data From File
		String URL = prop.getProperty("url");
		String USERNAME = prop.getProperty("username");
		String PASSWORD = prop.getProperty("password");
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(URL);
		driver.findElement(By.linkText("Log in")).click();
		
		
		driver.findElement(By.id("Email")).sendKeys(USERNAME);
		driver.findElement(By.id("Password")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
	}
	
     

}
