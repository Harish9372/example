package TakeScreenshot_Interface;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Of_Webelement_Flipkart_Fridge_Click {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("fridge");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		driver.findElement(By.xpath("//div[text()='LG 240 L Frost Free Double Door 3 Star Convertible Refrigerator  with Smart Inverter']")).click();
		
		WebElement flipkartCatagoryIcons2FridgeClick = driver.findElement(By.xpath("(//div[@class='DOjaWF YJG4Cf'])[1]"));
		
		File source = flipkartCatagoryIcons2FridgeClick.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("./screenshots/flipkartCatagoryIcons2FridgeClickSS.png");
		
		FileHandler.copy(source, destination);
		
		
	}

}
