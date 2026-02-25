package learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		
	}

}
