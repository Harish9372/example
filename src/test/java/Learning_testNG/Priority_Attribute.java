package Learning_testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority_Attribute {

	
	@Test(priority = -50)
	public void loginTest() {
		Reporter.log("User login successfully",true);
	}
	@Test(priority = -100)
	public void registerTest() {
		Reporter.log("User Registered Successfully",true);
	}
	@Test
	public void cardTest() {
		Reporter.log("added card is Successfully",true);
	}
}
