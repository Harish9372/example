package LaunchBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoIbiBo_Tickets {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/?utm_source=admitad&utm_medium=affiliate&utm_campaign=2050797_e994bf037cec63493bc65cfe7aa81d57&admitad_uid=&tagtag_uid=&gclid=Cj0KCQjwhYS_BhD2ARIsAJTMMQYrtqI27-0O-8hcZcq79F1nJKHxXaqORk7O2axSuYlGU5L2Rf1z5w4aAhlDEALw_wcB&gclsrc=aw.ds");
//		Thread.sleep(4000);
//		driver.findElement(By.className("Pke_EE")).sendKeys("iphone",Keys.ENTER);
//		driver.findElement(By.className("KzDlHZ")).click();
//		
	}
}
