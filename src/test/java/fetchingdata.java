


	
	

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.time.Duration;
	import java.util.Properties;

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

	import com.genericUtilities.File_Utility;

	
	public class fetchingdata {
		@Test
		
		public void register() throws EncryptedDocumentException, IOException {
			
			//Java Representation Object Of External File(Properties File)
					FileInputStream fis = new FileInputStream("C:\\Users\\B Harish\\eclipse-workspace\\LearningSelenium\\src\\test\\resources\\testData\\Book1.xlsx");
					
	       //Open Workbook In The Read Mode
					Workbook book = WorkbookFactory.create(fis);
					
					//Navigate to the sheet by sheet name
					Sheet sheet = book.getSheet("Sheet1");
					
					//Navigate to the row by using index
					Row row = sheet.getRow(1);
					System.out.println(row);
					
					//Navigate to the cell by using index
					Cell cell = row.getCell(1);
					System.out.println(cell);
					
					String USERNAME = row.getCell(0).toString();
					String PASSWORD = row.getCell(1).toString();
					
					WebDriver driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("https://demowebshop.tricentis.com/login");
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
					
					driver.findElement(By.id("Email")).sendKeys(USERNAME);
      				driver.findElement(By.id("Password")).sendKeys(PASSWORD);
      				driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
				
					
					
					
		
//					//Fetch data from the cell
//					String GENDER = cell.toString();
//					String FIRSTNAME = row.getCell(1).toString();
//					String LASTNAME = row.getCell(2).toString();
//					String EMAIL = row.getCell(3).toString();
//					String PASSWORD = row.getCell(4).toString();
//					String CONFIRMPASSWORD = File_Utility.getCellDataFromExcel("Sheet1", 1, 5);
//					
//					WebDriver driver = new ChromeDriver();
//					driver.manage().window().maximize();
//					driver.get("https://demowebshop.tricentis.com/login");
//					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//					
//					driver.findElement(By.id("Email")).sendKeys(EMAIL);
//					driver.findElement(By.id("Password")).sendKeys(PASSWORD);
//					
//					driver.get(File_Utility.getPropertyData("url"));
//					driver.findElement(By.linkText("Register")).click();
//					
//					if (GENDER.equals("male")) {
//						driver.findElement(By.id("gender-male")).click();
//						
//						
//					}
//					else {
//						driver.findElement(By.id("gender-female")).click();
//					}
//					driver.findElement(By.id("FirstName")).sendKeys(FIRSTNAME);
//					driver.findElement(By.id("LastName")).sendKeys(LASTNAME);
//					driver.findElement(By.id("Email")).sendKeys(EMAIL);
//					driver.findElement(By.id("Password")).sendKeys(PASSWORD);
//					driver.findElement(By.id("ConfirmPassword")).sendKeys(CONFIRMPASSWORD);
//					driver.findElement(By.id("register-button")).click();
//					
					
					
		
	}

}
