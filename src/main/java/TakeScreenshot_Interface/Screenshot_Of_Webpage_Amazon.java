package TakeScreenshot_Interface;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Of_Webpage_Amazon {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		TakesScreenshot ts =(TakesScreenshot)driver;	
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("./screenshots/amazonSS.png");
		
		FileHandler.copy(source, destination);

	}

}
