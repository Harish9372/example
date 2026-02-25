package Learning_testNG;

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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleDataFetching {

	@DataProvider
	
	
	public String[][] MultipleAccountsLogin() throws EncryptedDocumentException, IOException{
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\B Harish\\eclipse-workspace\\LearningSelenium\\src\\test\\resources\\testData\\MultipleAccounts.xlsx");
		Workbook book =WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("MultipleAccounts");
		int rowscount = sheet.getPhysicalNumberOfRows();
		Row row = sheet.getRow(0);
		int cellscount = row.getPhysicalNumberOfCells();
		Cell cell = row.getCell(0);
		
		String data[][] = new String[rowscount-1][cellscount];
		
		for (int i = 1; i <= rowscount-1 ; i++) {
			
			for (int j = 0; j <= cellscount-1; j++) {
				
				data[i-1][j] = sheet.getRow(i).getCell(j).toString();
				
			}
			
		}
		return data;
		
	}
	
	@Test(dataProvider = "MultipleAccountsLogin") 
	public void RunMUltipleAcccounts(String username, String password) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		driver.quit();
		
		
		
	}
	
	
	
}
