package LaunchingBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class summa {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/?s_kwcid=AL!739!3!582822043580!b!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gad_source=1&gclid=EAIaIQobChMI6uDP-8_FigMVlRmDAx2KxTe2EAAYASAAEgJKx_D_BwE");
		Thread.sleep(2000);
		driver.findElement(By.className("Pke_EE")).sendKeys("iphone");
		driver.findElement(By.className("_2iLD__")).click();
	
		
		
		
	}
	
		
	}
		
	
	
	
	
	
	


