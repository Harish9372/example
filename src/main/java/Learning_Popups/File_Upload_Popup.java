package Learning_Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload_Popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      driver.get("https://the-internet.herokuapp.com/upload");
      Thread.sleep(2000);

      WebElement element = driver.findElement(By.id("file-upload"));
      element.sendKeys("C:\\Users\\Default\\Pictures\\OIP.jpg");
      
      driver.findElement(By.id("file-submit")).click();
	}

}
