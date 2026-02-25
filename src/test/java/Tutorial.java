import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class Tutorial {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Thread.sleep(1000);[]
		
		//XPATH BY ATTRIBUTE
	//	driver.findElement(By.xpath("(//div[@class='YBLJE4'])[7]")).click();
		
//		
//		//X PATH  BY CONTAINS 
//		driver.findElement(By.xpath("(//div[contains(@class,'_2puWtW _3')])")).click();
//		
//		//X PATH BY VISIBLE TEXT
//		driver.findElement(By.xpath("//span[text()='Flight Bookings']")).click();
//		
//		//X-PATH BY VISIBLE TEXT CONTAINS
//		driver.findElement(By.xpath(""));
//		
//		//TAG NAME 
//  		List<WebElement> elements = driver.findElements(By.tagName("div"));
//     	System.out.println("total size:" + elements.size());
		
		//PARTIAL LINK TEXT
//		String text = driver.findElement(By.partialLinkText("TVs & ")).getText();
//		System.out.println(text);
//		
//		//CSS SELECTOR
//		driver.findElement(By.cssSelector("[id='email']")).sendKeys("harish");
//		
//		// DEPENDENT/INDEPENDENT/DYNAMIC XPATH 
//		driver.findElement(By.xpath(""));
//		
		
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		Thread.sleep(1000);
		
		String text2 = driver.findElement(By.xpath("//div[contains(text(),'Apple iPhone 16 (Teal, 128 GB)')]/ancestor::div[contains(@class,'_75nlfW')]//div[contains(text(),'₹69,900')]")).getText();
		System.out.println(text2);
		
//		
		
	}

}
