package Learning_testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enable_Attribute {

	@Test
	public void loginTest() {
		Reporter.log("User login successfully",true);
	}
	@Test(enabled = false)
	public void registerTest() {
		Reporter.log("User Registered Successfully",true);
	}
	@Test(dependsOnMethods = "loginTest")
	public void cardTest() {
		Reporter.log("added card is Successfully",true);
	}
	
}
