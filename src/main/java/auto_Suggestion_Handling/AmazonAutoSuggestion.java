package auto_Suggestion_Handling;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mobile name here ");
		String data = sc.nextLine();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=728858856234&hvpos=&hvnetw=g&hvrand=291744109908521596&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9299786&hvtargid=kwd-64107830&hydadcr=14452_2409549&gad_source=1");
		Thread.sleep(2000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe");
		Thread.sleep(4000);		
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@id=\"sac-suggestion-row-1\"]"));
		
		for (int i = 0; i < suggestions.size(); i++) {
			
			WebElement suggestion = suggestions.get(i);
			System.out.println(suggestion.getText());
			Thread.sleep(1000);
			if(suggestion.getText().equals(data)) {
				suggestion.click();
				
			}
			
		}
		
	}

}
