package WindowHandlezConcepts;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleByIndex {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		// Actions a = new  Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.className("Pke_EE")).sendKeys("iphone",Keys.ENTER);
	    driver.findElement(By.className("KzDlHZ")).click();
	    
	    //HERE WE R HANDLING MULTIPLE WINDOWS CONCEPT
	    String ParentWindow = driver.getWindowHandle();
	    Set<String> AllWindowHandle = driver.getWindowHandles();
	    
	    //WE CAN ITERATE EACH WINDOW BY USING LIST BECAUSE IT WILL ACCEPT INDEXING CONCEPT 
	    
	    List<String> AllWindowHandlesList = new ArrayList<String>(AllWindowHandle);
	    
	    for (String handle : AllWindowHandle) {
			
	    	if(!handle.equals(ParentWindow)) {
	    		
	    		driver.switchTo().window(handle);
	    		Thread.sleep(1000);
	    		 driver.findElement(By.xpath("//a[text()='Apple 20W ,USB-C Power Charging Adapter for iPhone, iPad & AirPod...']")).click();
	    		 
	              driver.findElement(By.xpath("//a[text()='Apple 20W ,USB-C Power Charging Adapter for iPhone, iPad & AirPod...']")).click();
	              Thread.sleep(2000);
	            String SecondTab = AllWindowHandlesList.get(1);
	            driver.switchTo().window(SecondTab);
	            Thread.sleep(2000);
	            String ThirdTab = AllWindowHandlesList.get(0);
	            driver.switchTo().window(ThirdTab);
	            Thread.sleep(2000);
	            String fourthTab = AllWindowHandlesList.get(1);
	            driver.switchTo().window(fourthTab);
	    	
	    	}
	    	
		}
	    
	   
	}

}
