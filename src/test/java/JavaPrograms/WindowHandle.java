package JavaPrograms;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//span[text()='Placements']")).click();
		
		
		String ParentWindow = driver.getWindowHandle();
		Set<String> AllwindowHandles = driver.getWindowHandles();
		//list
		
		System.out.println(ParentWindow);
		System.out.println(AllwindowHandles);
		
		
     	AllwindowHandles.remove(ParentWindow);
		
		for (String nextwindow: AllwindowHandles) {
			
			driver.switchTo().window(nextwindow);
			driver.findElement(By.linkText("QSpiders")).click();
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//button[@class='button is-persian m-1 has-text-weight-semibold'])[2]")).click();
			
			
		}
		
	}

}
