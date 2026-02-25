package learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  ChromeDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://demowebshop.tricentis.com/");
  Thread.sleep(2000);
  
  driver.findElement(By.xpath("//a[text()='$25 Virtual Gift Card']/../..//input[@value='Add to cart']")).click();
  Thread.sleep(2000);
  
  driver.findElement(By.name("giftcard_2.RecipientName")).sendKeys("007 HARISH");
  driver.findElement(By.name("giftcard_2.RecipientEmail")).sendKeys("bharishkumar.1999@gmail.com");
  driver.findElement(By.id("giftcard_2_SenderName")).sendKeys("THALAPATHY");
  driver.findElement(By.name("giftcard_2.SenderEmail")).sendKeys("thalapathy@gmail.com");
  driver.findElement(By.id("giftcard_2_Message")).sendKeys("CONGRATULATION HARISH U GOT GOAT MOVIE FREE TICKET");
  driver.findElement(By.xpath("//input[@id='add-to-cart-button-2']")).click();
  
  
	}

}
