package TakeScreenshot_Interface;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Of_Webpage_Flipkart {

        public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		
		//type cast the driver into TakesScreenshot interface
	TakesScreenshot ts=(TakesScreenshot) driver;
	
	//by using TakesScreenshot reference variable , call  the method
	File source =ts.getScreenshotAs(OutputType.FILE);
	
	//In main memory , we have we have created one file to save the screenshot
	File destination = new File("./screenshots/flipkartSS.png");
	
	
	//Copy the screenshot from RAM(source)to main memory(destination)
	org.openqa.selenium.io.FileHandler.copy(source, destination);
	
	
	
	
	
	
	

	}

}
