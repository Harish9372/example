package learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Axes1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=14384640957647549929&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061929&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("tv");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		String name = driver.findElement(By.xpath("//span[text()='Xiaomi 125 cm (50 inches) X Pro 4K Dolby Vision IQ Series Smart Google TV L50M8-5XIN (Black)']")).getText();
    	System.out.println(name);
    	String price = driver.findElement(By.xpath("/descendant::span[@class='a-price']")).getText();
    	System.out.println(price);

	}

}
