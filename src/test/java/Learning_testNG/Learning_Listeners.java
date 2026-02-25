package Learning_testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.genericUtilities.BaseTest;

@Listeners(com.genericUtilities.Listerner_Implementation.class)
public class Learning_Listeners extends BaseTest{

	@Test
	
	public void loginTest() {
		
		Assert.assertEquals(driver.getTitle(),"Demo Web");
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		
		
	}
	

}
