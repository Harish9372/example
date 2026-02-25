


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestioneasywayhandle {

	public static void main(String[] args) throws InterruptedException {
		
//		Scanner sc = new Scanner(System.in);
//		String data = sc.nextLine();
//		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=728858856234&hvpos=&hvnetw=g&hvrand=291744109908521596&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9299786&hvtargid=kwd-64107830&hydadcr=14452_2409549&gad_source=1");
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe");
		Thread.sleep(2000);
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
        
		for (int i = 0; i < elements.size(); i++) {
			WebElement suggestion = elements.get(i);
			if(i==3) {
				suggestion.click();
				break;
			}
			
		//	System.out.println(suggestion.getText());
		//	Thread.sleep(1000);
//			if(suggestion.getText().equals(data)) {
//				suggestion.click();
//				break;
				
			}
			
		}
		
	}


