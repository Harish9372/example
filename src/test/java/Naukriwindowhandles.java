import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Naukriwindowhandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.naukri.com/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				boolean logbtn = driver.findElement(By.id("login_Layer")).isDisplayed();
				System.out.println(logbtn);
				boolean loginbutton = driver.findElement(By.id("login_Layer")).isEnabled();
				System.out.println(loginbutton);
				driver.findElement(By.id("login_Layer")).click();
				driver.findElement(By.xpath("//input[contains(@placeholder,'Enter your active Email ID')]")).click();
				driver.findElement(By.xpath("//input[contains(@placeholder,'Enter your active Email ID')]")).sendKeys("");
				driver.findElement(By.xpath("//input[@type='password']")).click();
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("");
				driver.findElement(By.xpath("//button[text()='Login']")).click();
				driver.findElement(By.xpath("//span[text()='Search jobs here']")).click();
				driver.findElement(By.xpath("//input[contains(@placeholder,'Enter keyword')]")).sendKeys("testing",Keys.ENTER);
				//driver.findElement(By.xpath("//span[text()='Search']")).click();
				
				
				driver.findElement(By.xpath("(//div[contains(@class,'cust-job-tuple layout-wrapper lay-2 sjw__tuple ')])[1]")).click();
				
				String parentwindow = driver.getWindowHandle();
				Set<String> allwindowHandles = driver.getWindowHandles();
				//IF WE WANT TO ITERATE WITH MULTIPLE WINDOWS WE NEED INDEXING CONCEPT 
				List<String> Allwindowhandleslist = new ArrayList<String>(allwindowHandles);
				
				for (String handle : driver.getWindowHandles()) {
					
					if (!handle.equals(parentwindow)) {
						driver.switchTo().window(handle);
						System.out.println("Switched To : "+ driver.getTitle());
						Thread.sleep(1000);
						driver.findElement(By.xpath("/h3[contains(text(),'Software Developer  - Fresher')]")).click();
						Thread.sleep(1000);
						//GET UPDATED WINDOW HANDLES AFTER THE NEW CLICK
//						Set<String> newhandles = driver.getWindowHandles();
//						for (String handle1 : newhandles) {
//							if (!handle1.equals(parentwindow)&&(!handle1.equals(handle))) {
//								driver.switchTo().window(handle1);
//								//System.out.println("Now Switched To New Tab :"+ driver.getTitle());
//								
//								driver.findElement(By.xpath("//h3[contains(text(),'Qa Engineer')]")).click();
//								System.out.println(Allwindowhandleslist.size());
//								String Secondtab = Allwindowhandleslist.get(2);
//								driver.switchTo().window(Secondtab);
//								
							}
							
//							
						}
//						WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//						wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[contains(text(),'Qa Engineer')]")));
//						
						
					}
					
					
				//}
				
				//driver.findElement(By.xpath("//h3[text()='Lead Software Test Engineer']")).click();
				//driver.findElement(By.xpath("//h3[text()='Regular Python Software Test Engineer']")).click();
				
				
				
				
				

			}

	//	}

			//driver.findElement(By.xpath("//h3[text()='Regular Python Software Test Engineer']")).click();
			
				


	


