import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        
        for (int i = 1 ; i < 5; i++) {
			if(i==4) {
				Thread.sleep(1000);
				driver.findElement(By.xpath("//textarea[@aria-label=\"Search\"]")).sendKeys("https://www.myntra.com/",Keys.ENTER);
			}
		
        Robot rc = new Robot();
        rc.keyPress(KeyEvent.VK_CONTROL);
        rc.keyPress(KeyEvent.VK_T);
        rc.keyRelease(KeyEvent.VK_CONTROL);
        rc.keyRelease(KeyEvent.VK_T);
        
        }
//           String pparentwindow = driver.getWindowHandle();
//            Set<String> windowHandles = driver.getWindowHandles();
//            List<String> Allwindowhandles = new ArrayList<String>(windowHandles);
//            
//            String fourthwindow = Allwindowhandles.get(3);
//            
//            for (int j = 0; j < Allwindowhandles.size(); j++) {
//				
//            	if(j!=3) {
//            		
//            		driver.switchTo().window(Allwindowhandles.get(j));
//            		driver.close();
//            	}
//            	
//            	
//			}
//	
//	driver.switchTo().window(fourthwindow);
}
	
}


