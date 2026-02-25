package Learning_Popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Popup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qspiders.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Placements']")).click();
		Thread.sleep(2000);
		String parentwindowHandle = driver.getWindowHandle();
		Set<String> allwindowHandles = driver.getWindowHandles();
		
		allwindowHandles.remove(parentwindowHandle);
		
		System.out.println(parentwindowHandle);
		System.out.println(allwindowHandles);
		
		for (String windowHandle : allwindowHandles) {
			
			driver.switchTo().window(windowHandle);
			Thread.sleep(2000);
			driver.findElement(By.linkText("CSE")).click();
			
			
		}
		
		
		
	}



		
	}

}
