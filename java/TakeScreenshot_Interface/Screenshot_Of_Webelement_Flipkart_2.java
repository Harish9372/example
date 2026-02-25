package TakeScreenshot_Interface;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Of_Webelement_Flipkart_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		WebElement flipkartCatagoryIcons1 = driver.findElement(By.xpath("//div[@class='_3sdu8W emupdz']"));
		
		File source = flipkartCatagoryIcons1.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("./screenshots/flipkartCatagoryIcons1SS.png");
		
		FileHandler.copy(source, destination);
		
	}

}
