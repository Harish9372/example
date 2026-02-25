package windowhandleconcept;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handels {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		 Actions a = new  Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.className("Pke_EE")).sendKeys("laptop",Keys.ENTER);
		driver.findElement(By.className("RG5Slk")).click();
		String parenttab = driver.getWindowHandle();
		System.out.println(parenttab);
		Set<String> allwindowHandles = driver.getWindowHandles();
		System.out.println(allwindowHandles);
		
		for (String handle : allwindowHandles) 
			if (!handle.equals(parenttab)) {
				driver.switchTo().window(handle);
			}
			driver.findElement(By.className("dSM5Ub ugg2XR IUmgrZ")).click();
			driver.findElement(By.xpath("//span[text()='Cart']")).click();
		}
		
		
		//driver.findElement(By.className("v_7pKG")).click();
	}


