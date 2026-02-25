package WindowHandlezConcepts;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchTheWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		
		
		
		driver.findElement(By.className("Pke_EE")).sendKeys("iphone",Keys.ENTER);
		
		String ParentWindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//div[text()='Apple iPhone 16 Plus (Teal, 512 GB)']")).click();
		
		
      	Set<String> AllwindowHandles = driver.getWindowHandles();
      	
//		
	    for (String handle : AllwindowHandles) {
			
			if (!handle.equals(ParentWindow)) {
				driver.switchTo().window(handle);
				Thread.sleep(1000);
				
				// driver.findElement(By.xpath("//span[@class=\"OGrnIL\"]")).click();
				
				
				
				WebElement element = driver.findElement(By.xpath("(//span[@class=\"UQVUbC\"])[2]"));
				action.scrollToElement(element).perform();
				element.click();
			}
//}
		
		
		
		
		
		
		
		
//		//ITS USED TO GET ALL WINDOWS PRESENT IN BROWSER
//		Set<String> AllwindowHandles = driver.getWindowHandles();
//		
//		//CHANGE SET TO LIST THEN ONLY WE USING INDEX CONCEPT 
//		List<String> WindowhandleList = new ArrayList<>(AllwindowHandles);
//		
//		//ASSUME YOU HAVE ATLEAST 4 WINDOWS OPEN
//		if (WindowhandleList.size()>= 4) {
//			
//			//GET THE 2ND WINDOW
//			String SecondWindow = WindowhandleList.get(1);
//			
//			driver.switchTo().window(SecondWindow);
//			
//			//GET THE 4TH WINDOW
//			String FourthWindow = WindowhandleList.get(3);
//			
//			driver.switchTo().window(FourthWindow);
//			
//			driver.findElement(By.xpath("(//*[name()='svg' and @viewBox=\"0 0 48 48\"])[4]")).click();
//			
//			//GET THE MAIN WINDOW
//			String mainwindow = WindowhandleList.get(0);
//			
//			driver.switchTo().window(mainwindow);
//			
//			
//			
//			
		}

	}

}
