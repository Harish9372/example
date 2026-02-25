package WindowHandlezConcepts;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Switch2To4ThWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        
        
    	driver.findElement(By.className("Pke_EE")).sendKeys("iphone",Keys.ENTER);
       
		
		driver.findElement(By.xpath("//div[text()='Apple iPhone 16 Plus (Teal, 512 GB)']")).click();
		
		 String ParentWindow = driver.getWindowHandle();
		 System.out.println(ParentWindow);
      	Set<String> AllwindowHandles = driver.getWindowHandles();
      	
      	//CONVERT THE SET OF WINDOW HANDLES INTO AN ARRAYLIST FOR EASIER INDEXNG
        List<String> AllwindowHandleList = new ArrayList<>(AllwindowHandles);
      	
//		
	    for (String handle : AllwindowHandles) {
	    	
	    	if (!handle.equals(ParentWindow)) {
				driver.switchTo().window(handle);
				Thread.sleep(1000);
				
				 driver.findElement(By.xpath("//a[contains(text(),'Apple iPhone 16 Plus (Teal, 512 GB))']")).click();
				 
				driver.findElement(By.xpath("//a[text()='Apple 20W ,USB-C Power Charging Adapter for iPhone, iPad & AirPod...']")).click();
//				String SecondWindow = AllwindowHandleList.get(1);
//				driver.switchTo().window(SecondWindow);
//				driver.findElement(By.xpath("//a[text()='SAMSUNG Galaxy S24+ 5G (Onyx Black, 256 GB)']")).click();
//				String FirstWindow = AllwindowHandleList.get(0);
//				driver.switchTo().window(FirstWindow);
//				System.out.println(FirstWindow);
//				
        

		
	    	}	
	    }	
	}

}
