package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edge {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ajio.com/?&utm_source=google&utm_medium=cpc&utm_campaign=GSB_Brand_August2019&gad_source=1&gclid=Cj0KCQjwmOm3BhC8ARIsAOSbapVeXaiCY1OQWoRVU7PAlhMcEAXOoNXdARBoj-LzSg3-Bbl2d0sZjnQaArvIEALw_wcB");
	
}
	
	
}