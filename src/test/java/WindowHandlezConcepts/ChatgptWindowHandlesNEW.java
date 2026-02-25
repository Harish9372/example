package WindowHandlezConcepts;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChatgptWindowHandlesNEW {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.className("Pke_EE")).sendKeys("tv",Keys.ENTER);
		
		driver.findElement(By.xpath("//div[text()='Thomson Alpha QLED 80 cm (32 inch) QLED HD Ready Smart Linux TV 2025 Edition with 36W Sound Output | W...']")).click();
		
		//IT WILL USED FOR FETCHING SINGLE WINDOW PRESENT IN THE BROWSER
		String parenttab = driver.getWindowHandle();
		System.out.println(parenttab);
		
		//IT IS USED FOR HANDLE MULTIPLE WINDOWS PRESENT IN THE BROWSER
	    Set<String> windowHandles = driver.getWindowHandles();
	    System.out.println(windowHandles);
	    						
	   // windowHandles.remove(parenttab);
	   //IT IS USED TO HANDLE 2ND TAB 
	    //HERE WE SWITCH TO THE 2ND TAB
	    for (String handle : windowHandles) {
	    	if (!handle.equals(parenttab)) {
				
	    		driver.switchTo().window(handle);
		    	Thread.sleep(1000);
	    	}
	    }
	   
	    Actions ac = new Actions(driver);
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Thomson Alpha QLED 80 cm (32 inch) QLED HD Ready Smart Linux TV 2...']")));
		WebElement element = driver.findElement(By.xpath("//a[text()='Thomson Alpha QLED 80 cm (32 inch) QLED HD Ready Smart Linux TV 2...']"));
		ac.scrollToElement(element).perform();
		element.click();
		
		//AFTER ACTIONS DONE ON THE 2ND TAB WE NEED TO PERFORME ANY ACTIONS ON 3RD TAB MEANS WE WANT TO UPDATE THE ALLWINDOWS AGAIN
		//HERE WE UPDATE THE WINDOWS TAB AGAIN
		//HERE WE SWITCH TO THE 3RD TAB
		 Set<String> windowHandles2 = driver.getWindowHandles();
         System.out.println(windowHandles2);
         for (String handle : windowHandles2) {
        	 if (!handle.equals(parenttab)&& !handle.equals(windowHandles)) {
				
        		 driver.switchTo().window(handle);
        		 
        		 
        		
        		 
			}

		}
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Lantech MicrotekEMT 0790 Automatic Voltage Stabilizer For LED/LCD...']")));
    	WebElement element2 = driver.findElement(By.xpath("//a[text()='Lantech MicrotekEMT 0790 Automatic Voltage Stabilizer For LED/LCD...']"));
        ac.scrollToElement(element2).perform();
        element2.click();
        
        //IF WE WANT TO PERFORM ANY ACTION ON THE 4TH TAB MEANS AGAIN WE WANT TO UPDATE THE ALL WINDOWS TABS AGAIN 
        //HERE WE SWITCH TO THE 4RTH TAB
        
	}

}
