package Learning_testNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Fetching_Multiple_Data_From_Flipkart_Byusing_Excel {

	@DataProvider
	
	public String[][] FlipkartMultipleProducts() throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\B Harish\\eclipse-workspace\\LearningSelenium\\src\\test\\resources\\testData\\FLIPKART PRODUCTS SEARCH.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Flipkart");
		int rowCount = sheet.getPhysicalNumberOfRows();
		Row row = sheet.getRow(0);
		int cellCount = row.getPhysicalNumberOfCells();
		
		
		String [][] data = new String[rowCount-1][cellCount];
		for (int i = 1; i <= rowCount-1; i++) {
			for (int j = 0; j <= cellCount-1; j++) {
				
				data[i-1][j] = sheet.getRow(i).getCell(j).toString();
				
			}
			
		}
		return data;
		
	}
	
	@Test(dataProvider = "FlipkartMultipleProducts")
	public void FlipkartSearch(String username) throws InterruptedException {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.flipkart.com/");
			
			driver.findElement(By.className("Pke_EE")).sendKeys(username,Keys.ENTER);
			driver.quit();
	
	
	
}
}