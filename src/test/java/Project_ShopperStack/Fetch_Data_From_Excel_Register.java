package Project_ShopperStack;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Fetch_Data_From_Excel_Register {
@Test

public void register() throws EncryptedDocumentException, IOException, InterruptedException {
	
	//Java Representation Object Of External File(Properties File)
	FileInputStream fis = new FileInputStream("C:\\Users\\ELCOT\\eclipse-workspace\\learningSelenium\\src\\test\\resources\\testData\\ShoppersStack Register.xlsx");
	
	 //Open Workbook In The Read Mode
	Workbook book = WorkbookFactory.create(fis);
	
	
	//Navigate to the sheet by sheet name
	Sheet sheet = book.getSheet("ShopperRegister");
	
	//Navigate to the row by using index
	Row row = sheet.getRow(1);
	
	//Navigate to the cell by using index
	Cell cell = row.getCell(0);
	
	
	//Fetch Data From Excel File
	
	 String FIRSTNAME =cell.toString();
	 String LASTNAME = row.getCell(1).toString();
	 String GENDER = row.getCell(2).toString();
	 String PHONENUMBER = row.getCell(3).toString();
	 String EMAIL = row.getCell(4).toString();
	 String PASSWORD = row.getCell(5).toString();
	 String CONFIRMPASSWORD = row.getCell(6).toString();
	 
	 
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://www.shoppersstack.com/");
	 
	 driver.findElement(By.id("loginBtn")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.id("Create Account")).click();
	 driver.findElement(By.id("First Name")).sendKeys(FIRSTNAME);
	 driver.findElement(By.id("Last Name")).sendKeys(LASTNAME);
	 if (GENDER.equals("male")) {
		 
		 driver.findElement(By.id("Male")).click();
		
	}
	 else {
		driver.findElement(By.id("Female")).click();
	}
	 driver.findElement(By.id("Phone Number")).sendKeys(PHONENUMBER);
	 driver.findElement(By.id("Email Address")).sendKeys(EMAIL);
	 driver.findElement(By.id("Password")).sendKeys(PASSWORD);
	 driver.findElement(By.id("Confirm Password")).sendKeys(CONFIRMPASSWORD);
	 driver.findElement(By.id("Register")).click();
	 
	
}
	
	
}
