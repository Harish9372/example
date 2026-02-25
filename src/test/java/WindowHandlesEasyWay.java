import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesEasyWay {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
	        driver.get("https://www.google.com");
	        
	        
	        //// Open 4 more windows (total 5 windows)
	        for (int i = 1; i < 5; i++) {
	            ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("window.open('https://example.com','_blank');");
	            Thread.sleep(3000);
	        } 
	           String pparentwindow = driver.getWindowHandle();
                Set<String> windowHandles = driver.getWindowHandles();
                List<String> Allwindowhandles = new ArrayList<String>(windowHandles);
                
                String fourthwindow = Allwindowhandles.get(3);
                
                for (int j = 0; j < Allwindowhandles.size(); j++) {
					  
                	if(j!=3) {     
                		
                		driver.switchTo().window(Allwindowhandles.get(j));
                		driver.close();
                	}
                	
                	
				}
		
		driver.switchTo().window(fourthwindow);
	}

	}
