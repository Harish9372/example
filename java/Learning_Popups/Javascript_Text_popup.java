package Learning_Popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Text_popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//IT WILL CLICK ON ENTER THE DATA IN TEXTFIELD PRESENT IN POPUP
		driver.switchTo().alert().sendKeys("ADDHAMULEA VARGEESU");
		
		
	}

}
