package WindowHandlezConcepts;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QspidersWindowHand1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.findElement(By.xpath("//span[text()='Placements']")).click();
		
		String parentwindow = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		//List<String> windowhandleList= new ArrayList<>(windowHandles);
		
		System.out.println(parentwindow);
		System.out.println(windowHandles);
		
		
		for (String currentwindow : windowHandles) {
			if (!currentwindow.equals(parentwindow)) {
				
			System.out.println(currentwindow);
     		driver.switchTo().window(currentwindow);
			
			driver.findElement(By.linkText("QSpiders")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[text()='2025']")).click();
		}
	}

}
}