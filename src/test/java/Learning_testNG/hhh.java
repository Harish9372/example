package Learning_testNG;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class hhh {
public static void main(String[] args) throws InterruptedException {
	
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=728858856234&hvpos=&hvnetw=g&hvrand=291744109908521596&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9299786&hvtargid=kwd-64107830&hydadcr=14452_2409549&gad_source=1");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung s22",Keys.ENTER);
	driver.findElement(By.xpath("(//span[text()='Samsung Galaxy S23 Ultra 5G AI Smartphone (Phantom Black, 12GB, 256GB Storage)'])[1]")).click();
	
	String parentwindow = driver.getWindowHandle();
	Set<String> windowHandles = driver.getWindowHandles();
	
	
	
	for (String currentwindow : windowHandles) {
		if (!currentwindow.equals(parentwindow)) {
			
		
		driver.switchTo().window(currentwindow);
		Thread.sleep(1000);
	
	driver.findElement(By.xpath("//div[text()='SkyTree Flip Cover for Samsung Galaxy S20 FE 5G (Leather | Black)']")).click();
	
	driver.findElement(By.xpath("//div[text()='PULOKA for Samsung Galaxy s21 fe - Sleek Flip Case - Premium Vegan Leather Phone Co...']")).click();
}
	}
	
	
}	
	
}
