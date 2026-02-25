package learning_Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverService;
import org.openqa.selenium.support.ui.Select;

public class Implicit_Wait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		//Thread.sleep(2000);
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("kamal");
		driver.findElement(By.name("lastname")).sendKeys("r");
		driver.findElement(By.name("reg_email__")).sendKeys("Thalapathy@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Thalapathy@68");
		WebElement element = driver.findElement(By.name("birthday_day"));
		Select s1 = new Select(element);
		s1.selectByIndex(26);
		Thread.sleep(2000);
		WebElement element2 = driver.findElement(By.name("birthday_month"));
		Select s2 = new Select(element2);
		s2.selectByVisibleText("Nov");
	    WebElement element3 = driver.findElement(By.name("birthday_year"));
	    Select s3 = new Select(element3);
	    s3.selectByValue("1999");
	    driver.findElement(By.xpath("(//input[@id='sex'])[2]")).click();
	    driver.findElement(By.name("websubmit")).click();
	    
		
	}

}
