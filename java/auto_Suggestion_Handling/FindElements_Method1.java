package auto_Suggestion_Handling;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_Method1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone 15");
		Thread.sleep(2000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@id='toast-ctn']"));
		
		for (int i = 0; i < suggestions.size(); i++) {
			WebElement suggestion = suggestions.get(i);
			System.out.println(suggestion.getText());
			if (suggestion.getText().equals(data)) {
				
				suggestion.click();
			}
			
			
		}
		

	}

}
