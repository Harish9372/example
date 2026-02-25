package learning_Select_Class;

import java.lang.StackWalker.Option;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Select_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		
        WebElement element = driver.findElement(By.name("country"));
        
        Select sel = new Select(element);
        
        sel.selectByIndex(8);
        Thread.sleep(2000);
        sel.selectByValue("AF");
        Thread.sleep(2000);
        sel.selectByVisibleText("Hong Kong");
        Thread.sleep(2000);
       // sel.deselectByVisibleText("Hong Kong");
        
        List<WebElement> options = sel.getOptions();
       // for (int i = 0; i < options.size(); i++) {
        //	WebElement option = options.get(i);
			//System.out.println(option.getText());
         for (WebElement option : options) {
        	 System.out.println(option.getText());
			
		}
			
		
        
        
		}
        
        //driver.quit();
        
		
		
	}


