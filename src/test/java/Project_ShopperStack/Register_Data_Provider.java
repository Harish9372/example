package Project_ShopperStack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Register_Data_Provider {
@DataProvider
	public String [][] registerDataProvider() {
		
	
	
		String [][] data = new String [10][6];
		data[0][0] = "harish";
		data[0][1] ="kumaran";
		data[0][2] ="75756488908";
		data[0][3] ="baburaj22@gmail.com";
		data[0][4] ="harish@1234";
		data[0][5] ="harish@1234";
		
		data[1][0] = "sabja";
		data[1][1] ="kumari";
		data[1][2] ="7575648879";
		data[1][3] ="sabja22@gmail.com";
		data[1][4] ="sabja@1234";
		data[1][5] ="sabja@1234";
		
		data[2][0] = "surya";
		data[2][1] ="kumar";
		data[2][2] ="7575678908";
		data[2][3] ="surya22@gmail.com";
		data[2][4] ="surya@1234";
		data[2][5] ="surya@1234";
		
		data[3][0] = "ragul";
		data[3][1] ="kumar";
		data[3][2] ="7575088908";
		data[3][3] ="ragul22@gmail.com";
		data[3][4] ="ragul@1234";
		data[3][5] ="ragul@1234";
		
		data[4][0] = "indhu";
		data[4][1] ="kumari";
		data[4][2] ="7575698908";
		data[4][3] ="indhu22@gmail.com";
		data[4][4] ="indhu@1234";
		data[4][5] ="indhu@1234";
		
		data[5][0] = "rajesh";
		data[5][1] ="kumar";
		data[5][2] ="7575618908";
		data[5][3] ="rajesh22@gmail.com";
		data[5][4] ="rajesh@1234";
		data[5][5] ="harish@1234";
		
		data[6][0] = "dinesh";
		data[6][1] ="kumar";
		data[6][2] ="7575388908";
		data[6][3] ="dinesh22@gmail.com";
		data[6][4] ="dinesh@1234";
		data[6][5] ="dinesh@1234";
		
		data[7][0] = "raj";
		data[7][1] ="kumar";
		data[7][2] ="7575889081";
		data[7][3] ="raj@gmail.com";
		data[7][4] ="raj@1234";
		data[7][5] ="raj@1234";
		
		data[8][0] = "dhoni";
		data[8][1] ="mahi";
		data[8][2] ="7575648892";
		data[8][3] ="dhoni@gmail.com";
		data[8][4] ="dhoni@1234";
		data[8][5] ="dhoni@1234";
		
		data[9][0] = "kohli";
		data[9][1] ="rcb";
		data[9][2] ="7575648893";
		data[9][3] ="kohli@gmail.com";
		data[9][4] ="kohli@1234";
		data[9][5] ="kohli@1234";

		
		
	return data;
	}
@Test(dataProvider = "registerDataProvider")
public void registerTest(String firstname,String lastname,String mobile,String email,String password,String confirmpassword ) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.linkText("Log in")).click();
		
		 Assert.assertEquals(driver.getTitle().contains("Login"),true,"Validating ");
			driver.findElement(By.id("Create Account")).click();
			Thread.sleep(2000);

			driver.findElement(By.name("First Name")).sendKeys(firstname);
			driver.findElement(By.name("Last Name")).sendKeys(lastname);
			//driver.findElement(By.xpath("//input[@id='Male']")).click();
			driver.findElement(By.name("Phone Number")).sendKeys(mobile);
			driver.findElement(By.name("Email Address")).sendKeys(email);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.name("Confirm Password")).sendKeys(confirmpassword);
		//	driver.findElement(By.id("Terms and Conditions")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Register']")).click();
			Thread.sleep(3000);

		driver.findElement(By.linkText("Log out"));
		driver.quit();
		
		
		
		
	}
	
}

	

