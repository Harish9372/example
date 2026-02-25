package Learning_testNG;

import java.awt.print.Book;
import java.io.FileInputStream;
import java.io.IOException;

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

public class FetchDataFromExcel {

	@Test
     	public void fetchdatafromexcel() throws EncryptedDocumentException, IOException {
	
	//WE CREATED JAVA OBJECT FOR FILE 
	FileInputStream fis = new FileInputStream("C:\\Users\\B Harish\\eclipse-workspace\\LearningSelenium\\src\\test\\resources\\testData\\testNG_Learning.xlsx");
	
	//WE OPEN THE WORKBOOK IN READMODE
	
	Workbook book =WorkbookFactory.create(fis);
	
	// NAVIGATE TO THE SHEET BY THE SHEET NAME
	
	Sheet sheet = book.getSheet("Harish");
	
	int rowcount = sheet.getPhysicalNumberOfRows();
	System.out.println(rowcount);
	
	//NAVIGATE TO THE ROW BY USING INDEX
	Row row = sheet.getRow(1);
	int cellcount = row.getPhysicalNumberOfCells();
	System.out.println(cellcount);
	//NAVIGATE TO THE CELL USING INDEX
	
	Cell cell = row.getCell(0);
	
	//FETCH DATA FROM CELL 
	
	String EMAIL = cell.toString();
	String PASSWORD = row.getCell(1).toString();
	String URL = row.getCell(2).toString();
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(URL);
	
	driver.findElement(By.id("Email")).sendKeys(EMAIL);
	driver.findElement(By.id("Password")).sendKeys(PASSWORD);
	driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	
	
	
	
	
	
	
	}
	
	
	
	
	
}
