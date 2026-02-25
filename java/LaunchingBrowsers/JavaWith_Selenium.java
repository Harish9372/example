package LaunchingBrowsers;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaWith_Selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1 to Launch Chrome Browser ");
		System.out.println("Enter 2 to Launch Edge Browser ");
		System.out.println("Enter 3 to Launch Firefox Browser ");
		int num  = sc.nextInt();
		WebDriver driver = null;
		
		if (num==1) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			System.out.println("chrome browser is opened");
			driver.close();
			} else if (num==2) {
				driver = new EdgeDriver();
				driver.manage().window().maximize();
				driver.get("https://demowebshop.tricentis.com/");
				System.out.println("edge browser is opened");
				driver.close();
				
			}else if (num==3) {
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("https://demowebshop.tricentis.com/");
				System.out.println("firefox browser is opened");
				driver.close();
			}
				
				else {
					driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("https://demowebshop.tricentis.com/");
					System.out.println("chrome browser is opened");
					driver.close();
					
				}
				
			}
			
		}
	
	


