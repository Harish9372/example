package Learning_Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Notification_Popup_Handle_By_Robot_Class {

	public static void main(String[] args) throws InterruptedException, AWTException  {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.easymytrip.com/");
		Thread.sleep(2000);
		
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		r1.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		r1.keyPress(KeyEvent.VK_TAB);
		r1.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		
		

	}

}
