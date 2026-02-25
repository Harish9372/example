package Learning_Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Division_Popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("mobile");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]")).click();
		String parentwindowHandle = driver.getWindowHandle();
		Set<String> allwindowHandles = driver.getWindowHandles();
		
		allwindowHandles.remove(parentwindowHandle);
		driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
		driver.findElement(By.linkText("Remove")).click();
		
		
		
		
		
	}

}
