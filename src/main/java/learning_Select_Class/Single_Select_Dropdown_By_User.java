package learning_Select_Class;

import java.util.Random;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Select_Dropdown_By_User {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		
		
        WebElement element = driver.findElement(By.name("country"));
        
        Select sel = new Select(element);
        
        sel.selectByVisibleText(s1);
        Thread.sleep(2000);
        
        String s2 = sc.next();
        sel.selectByValue(s2);
        Thread.sleep(2000);
        
        int s3 = sc.nextInt();
        sel.selectByIndex(s3);
        Thread.sleep(2000);
        
       
        
		
	}

}
