package learning_Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleContains("Facebook"));
		if (driver.getTitle().equals("Facebook – log in or sign up")) {
			
			wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create new account")));
			driver.findElement(By.linkText("Create new account")).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
			driver.findElement(By.name("firstname")).sendKeys("kamal");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("lastname")));
			driver.findElement(By.name("lastname")).sendKeys("r");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("reg_email__")));
			driver.findElement(By.name("reg_email__")).sendKeys("Thalapathy@gmail.com");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password_step_input")));
			driver.findElement(By.id("password_step_input")).sendKeys("Thalapathy@68");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("birthday_day")));
			WebElement element = driver.findElement(By.name("birthday_day"));
			Select s1 = new Select(element);
			s1.selectByIndex(26);
			Thread.sleep(2000);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("birthday_month")));
			WebElement element2 = driver.findElement(By.name("birthday_month"));
			Select s2 = new Select(element2);
			s2.selectByVisibleText("Nov");
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("birthday_year")));
		    WebElement element3 = driver.findElement(By.name("birthday_year"));
		    Select s3 = new Select(element3);
		    s3.selectByValue("1999");
		    
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@id='sex'])[2]")));
		    driver.findElement(By.xpath("(//input[@id='sex'])[2]")).click();
		    
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("websubmit")));
		    driver.findElement(By.name("websubmit")).click();
			
			
			
			
			
			
			
		}
		
		
		
	}
}

