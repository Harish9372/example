package Learning_Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Alert_Popup1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(2000);
		
		
		
		//IT WILL CLICK ON OK
				driver.switchTo().alert().accept();
				
				//IT WILL CLICK ON CANCEL
				//driver.switchTo().alert().dismiss();
				
				//IT WILL CLICK ON ENTER THE DATA IN TEXTFIELD PRESENT IN POPUP
			//	driver.switchTo().alert().sendKeys("ADDHAMULEA VARGEESU");
				
				//IT WILL FETCH THE TEXT PRESENT IN POPUP
//				String text = driver.switchTo().alert().getText();
//				System.out.println(text);
//				driver.switchTo().alert().accept();
//				
	}

}
