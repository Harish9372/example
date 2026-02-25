package WindowHandlezConcepts;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChatgptWindow {

	
	         public static void main(String[] args) throws InterruptedException {
		        
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://www.flipkart.com/");
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		        
		        // Search for iPhone
		        driver.findElement(By.className("Pke_EE")).sendKeys("iphone", Keys.ENTER);
		        
		        // Click on the first product
		        driver.findElement(By.className("KzDlHZ")).click();
		        
		        // Get parent window handle
		        String ParentWindow = driver.getWindowHandle();
		        Set<String> AllWindowHandles = driver.getWindowHandles();
		        
		        // Convert Set to List for index-based access
		        List<String> AllWindowHandlesList = new ArrayList<>(AllWindowHandles);
		        
		        // Check if there are at least 4 windows
		        if (AllWindowHandlesList.size() >= 0) {
		            // Switch to the second tab
		            driver.switchTo().window(AllWindowHandlesList.get(1));
		            Thread.sleep(2000);
		            
		            // Click on the charger
		            driver.findElement(By.xpath("//a[text()='Apple 20W ,USB-C Power Charging Adapter for iPhone, iPad & AirPod...']")).click();
		            Thread.sleep(2000);
		            
		            // Update window handles after opening new tab
		            AllWindowHandles = driver.getWindowHandles();
		            AllWindowHandlesList = new ArrayList<>(AllWindowHandles);
		            
		            // Switch to the third tab
		            driver.switchTo().window(AllWindowHandlesList.get(2));
		            Thread.sleep(2000);
		            
		            // Switch to the fourth tab
		            driver.switchTo().window(AllWindowHandlesList.get(3));
		            Thread.sleep(2000);
		            
		            System.out.println("Switched to fourth window: " + driver.getTitle());
		        } else {
		            System.out.println("Less than 4 windows are open.");
		        }

		        // Close all windows
		     		    }
		

	}


