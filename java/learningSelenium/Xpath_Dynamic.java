package learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Xpath_Dynamic {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("iphone 15");
		driver.findElement(By.xpath("//button[contains(@class,'_2iLD__')]")).click();
		WebElement element1= driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']/../..//div[contains(@class,'_2iLD__')]"));
		String name = element1.getText();
		System.out.println(name);
		
	}

}
