package LaunchBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class laumchingChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
//        driver.findElement(By.className("Pke_EE")).sendKeys("iphone",Keys.ENTER);
//     	driver.findElement(By.xpath("//div[text()='Apple iPhone 15 Plus (Green, 128 GB)']")).click();
		
	}

}
