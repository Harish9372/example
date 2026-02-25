import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class fun {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'First')]")).sendKeys("harish");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Last')]")).sendKeys("B");
		driver.findElement(By.xpath("//textarea[contains(@class,'form-control ng-pristi')]")).sendKeys("No 838 , Perumal Steet ,Chennai");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("bharishkumar.1999@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("6369948578");
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		List<WebElement> elements = driver.findElements(By.xpath("//ul[contains(@class,'ui-autocomplete')]//li/a"));
		
		for (WebElement webElement : elements) {
			
			if (webElement.getText().equalsIgnoreCase("English")) {
				
				webElement.click();
                 break;
				
			}
			
		}
		
		WebElement element = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select sc = new Select(element);
		sc.selectByIndex(5);
		WebElement element2 = driver.findElement(By.xpath("//option[text()='Select Country']"));
	    Select sc1 = new Select(element2);
	    sc1.selectByIndex(4);
	    WebElement element3 = driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select sc2 = new Select(element3);
		sc2.selectByVisibleText("1999");
		WebElement element4 = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select sc3 = new Select(element4);
		sc3.selectByVisibleText("November");
		WebElement element5 = driver.findElement(By.xpath("//select[@id='daybox']"));
		Select sc4 = new Select(element5);
		sc4.selectByVisibleText("27");
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Harish@1999");
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Harish@1999");
		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
		
		
		
	}

}
