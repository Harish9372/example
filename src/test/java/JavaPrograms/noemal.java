package JavaPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class noemal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://shino.de/parkcalc/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement element = driver.findElement(By.id("ParkingLot"));
		Select sc = new Select(element);
		sc.selectByIndex(1);

	}

}
