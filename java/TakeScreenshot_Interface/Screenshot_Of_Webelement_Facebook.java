package TakeScreenshot_Interface;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Of_Webelement_Facebook {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[@name='login']"));
		
		File source = loginbutton.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("./screenshots/fbloginbuttonSS.png");
		FileHandler.copy(source, destination);

	}

}
