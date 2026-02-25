import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class filltheform {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.jotform.com/form/250773183167461");
		Thread.sleep(3000);
		
		driver.findElement(By.id("first_3")).sendKeys("harish");
		driver.findElement(By.id("last_3")).sendKeys("b");
		driver.findElement(By.id("input_4_addr_line1")).sendKeys("838 thiruvallur");
		driver.findElement(By.id("input_4_addr_line2")).sendKeys("perumal street");
		driver.findElement(By.id("input_4_city")).sendKeys("same");
		driver.findElement(By.id("input_4_postal")).sendKeys("chennai");
		driver.findElement(By.id("input_5_full")).sendKeys("6369948578");
		WebElement element = driver.findElement(By.id("input_8"));
		Select sc = new Select(element);
		sc.selectByIndex(3);
		Actions a1 = new Actions(driver);
		
		WebElement element2 = driver.findElement(By.id("label_input_15_0"));
		Thread.sleep(3000);
		a1.scrollToElement(element2).click().perform();
		//Thread.sleep(1000);
		//driver.findElement(By.id("input_25")).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(null)
		
	}

}
