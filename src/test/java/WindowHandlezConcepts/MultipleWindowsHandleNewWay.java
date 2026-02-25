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

public class MultipleWindowsHandleNewWay {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		Actions ac = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
		// Search for TV
				driver.findElement(By.className("Pke_EE")).sendKeys("tv", Keys.ENTER);
				
				driver.findElement(By.xpath("//div[text()='Samsung 80 cm (32 inch) HD Ready LED Smart Tizen TV 2025 Edition with Voice Assistance Remote Control ...']")).click();
				
				
				String parenttab = driver.getWindowHandle();
				System.out.println(parenttab);
				
				Set<String> AllwindowHandles = driver.getWindowHandles();
				String firstchild =null;
				//System.out.println(AllwindowHandles);
				
				//1ST CHILD FUNCTIONS
				for (String h : AllwindowHandles) {
					
					if (!h.equals(parenttab)) {
						firstchild= h;
						
						driver.switchTo().window(h);
                        break;
				     
					}
					
				}
				
				
				   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='NIPRAM NATIONAL Mi A series 80cm 32 inch HD Ready LED Smart Googl...']")));
					WebElement element = driver.findElement(By.xpath("//a[text()='NIPRAM NATIONAL Mi A series 80cm 32 inch HD Ready LED Smart Googl...']"));
			         ac.scrollToElement(element).perform();
					element.click();
					
				
				Set<String> AllwindowHandles1 = driver.getWindowHandles();
				System.out.println(AllwindowHandles1);
				String secondchild = null;
				
				// 2nd CHILD FUNCTIONS
				
				for (String second : AllwindowHandles1) {
					
					if (!second.equals(parenttab) && (!second.equals(firstchild))) {
				     secondchild = second;
						driver.switchTo().window(second);
						break;
					}
				}		
				Thread.sleep(1000);
					//driver.findElement(By.xpath("//span[text()='Cart']")).click();
					WebElement element1 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='SINAL Steel Set Top Box Stand (Metal Body) with Universal 32 to 4...']")));
				    ac.scrollToElement(element1).perform();
					element1.click();
					Set<String> Allwindowhandles2 = driver.getWindowHandles();
					System.out.println(Allwindowhandles2);
					
					
					
					//3RD CHILD FUNCTIONS
			         String thirdChild = null;
					for (String third : Allwindowhandles2) {
						
					if (!third.equals(parenttab) && !third.equals(firstchild) && !third.equals(secondchild)) {
						
                         thirdChild = third;
						 driver.switchTo().window(thirdChild);
						 break;
						
						
					}	
						
					}
				System.out.println(driver.getTitle());
					
					

	}

}
