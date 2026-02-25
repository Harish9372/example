package Action_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/context_menu");
        Thread.sleep(2000);
        
	}

}
