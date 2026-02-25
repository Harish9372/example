package LaunchBrowsers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class makemyTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-notifications");
			WebDriver driver = new ChromeDriver(options);
			
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    driver.get("https://www.makemytrip.com/");
		   driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		   driver.findElement(By.xpath("//a[@class='headerIcons makeFlex hrtlCenter column active']")).click();
		   driver.findElement(By.id("fromCity")).click();
		   driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys("hyderabad");
		   driver.findElement(By.xpath("(//span[text()='Hyderabad'])")).click();
		   driver.findElement(By.xpath("//span[text()='To']")).click();
		   driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("chennai");
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("(//span[text()='Chennai'])[1]")).click();
		   driver.findElement(By.xpath("(//p[text()='26'])[1]")).click();
		   driver.findElement(By.xpath("//p[text()='Economy/Premium Economy']")).click();
		   driver.findElement(By.xpath("//li[@data-cy=\"adults-4\"]")).click();
		   driver.findElement(By.xpath("//button[text()='APPLY']")).click();
		   driver.findElement(By.xpath("//a[text()='Search']")).click();
		   
		   
		   
		   
		   

	}

}
