import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("Email")).sendKeys("ramya@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("1234@ramya");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();

	}

}
