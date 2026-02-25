package learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Axes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone 15");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		String price =driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']")).getText();
		System.out.println(price);
		
		

	}

}
