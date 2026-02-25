import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class tutorial1Select {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//textarea[@class='gLFyf']
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://codepen.io/Krishna-Savaliya/pen/RwzbWaM?utm_source=chatgpt.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//SINGLE SELECT DROPDOWN
		WebElement element = driver.findElement(By.xpath("//input[@value='Select Project Manager...']"));
		
;		Select sc = new Select(element);
		
		sc.selectByIndex(4);
		//sc.selectByVisibleText("");	
		//sc.selectByValue("");
		
		//MULTI SELECT DROPDOWN
		
		
		
		
		
		
		
	}

}
