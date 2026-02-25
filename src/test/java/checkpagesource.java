import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkpagesource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/mnjuser/inbox");
		
		 String pageSource = driver.getCurrentUrl();
		System.out.println(pageSource);

	}

}
