package JavaPrograms;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle1To2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//span[text()='Placements']")).click();
		
		
		String ParentWindow = driver.getWindowHandle();
		Set<String> AllwindowHandles = driver.getWindowHandles();
		//CONVERT THE SET OF WINDOWHANDLES INTO AN ARRAY LIST FOR EASIER INDEXING CONCEPT
       List<String> AllwindoHandlesList = new ArrayList<String>(AllwindowHandles);
    
       
       for (String handle : AllwindoHandlesList) {
    	  if(!handle.equals(ParentWindow)) {
    	   driver.switchTo().window(handle);
    	   Thread.sleep(1000);
    	   
    	   driver.findElement(By.linkText("QSpiders")).click();
    	  
    	   Thread.sleep(1000);
    	   String first = AllwindoHandlesList.get(0);
    	   driver.switchTo().window(first);
    	   Thread.sleep(1000);
    	   String second = AllwindoHandlesList.get(1);
    	   driver.switchTo().window(second);
    	   Thread.sleep(1000);
    	   String third = AllwindoHandlesList.get(2);
    	   driver.switchTo().window(third);
    	  // driver.findElement(By.xpath("//a[text()='PLACEMENT STATISTICS']")).click();
		
	}
       
		
		
	}

}
}