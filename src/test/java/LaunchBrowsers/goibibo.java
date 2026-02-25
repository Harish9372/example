package LaunchBrowsers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.internal.invokers.AbstractParallelWorker.Arguments;

public class goibibo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	    driver.get("https://www.goibibo.com/");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[@class='sc-jlZhew inxprl']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[text()='From']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hyderabad");
	    driver.findElement(By.xpath("//p[text()='Rajiv Gandhi International Airport']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//span[text()='To'])[2]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("chennai");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//p[text()='Chennai International Airport']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//p[text()='Saturday']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//p[text()='25'])[1]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//p[text()='economy']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//*[name()='svg' and @width=\"15\"])[2]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[text()='Done']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']")).click();
	    
			
}
}