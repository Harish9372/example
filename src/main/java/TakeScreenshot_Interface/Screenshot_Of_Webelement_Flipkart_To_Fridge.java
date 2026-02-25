package TakeScreenshot_Interface;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Of_Webelement_Flipkart_To_Fridge {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("fridge");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		
		WebElement flipkartCatagoryIcons2Fridge = driver.findElement(By.xpath("(//div[@class='tUxRFH'])[1]"));
		
		File source = flipkartCatagoryIcons2Fridge.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("./screenshots/flipkartCatagoryIcons2FridgeSS.png");
		
		FileHandler.copy(source, destination);
		
	}

}
