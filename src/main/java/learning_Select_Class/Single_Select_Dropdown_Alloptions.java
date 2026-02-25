package learning_Select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Select_Dropdown_Alloptions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		
		
        WebElement element = driver.findElement(By.name("country"));
        
        Select sel = new Select(element);
		
        List<WebElement> Alloptions = sel.getOptions();
  //  for (WebElement option : Alloptions) {
		
   // 	option.click();
    //	Thread.sleep(2000);
    	for (int i = 0; i < Alloptions.size(); i++) {
			
    		WebElement option = Alloptions.get(i);
    		option.click();
    		
		}
	}
		
	}


