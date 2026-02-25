package TakeScreenshot_Interface;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Of_Webelement_Zudio {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zudio.com/");
		
		WebElement dotbuttons = driver.findElement(By.xpath("(//ul[@class='slick-dots'])[1]"));
		
		File source = dotbuttons.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("./screenshots/dotbuttonSS.png");
		
		FileHandler.copy(source, destination);

	}

}
