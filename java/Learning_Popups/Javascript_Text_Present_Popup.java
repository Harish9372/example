package Learning_Popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Text_Present_Popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//IT WILL FETCH THE TEXT PRESENT IN POPUP
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
		
		
	}

}
