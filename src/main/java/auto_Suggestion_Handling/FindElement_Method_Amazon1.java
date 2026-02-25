package auto_Suggestion_Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement_Method_Amazon1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=3465207147041571629&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007809&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 15");
		Thread.sleep(2000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='lnnVSe']"));
		for (int i = 0; i < suggestions.size(); i++) {
			WebElement suggestion = suggestions.get(i);
			System.out.println(suggestion.getText());
			
		}

	}

}
