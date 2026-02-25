package Learning_testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Depends_On_Method_Attribute {

	@Test(dependsOnMethods = "registerTest")
	public void loginTest() {
		Reporter.log("User login successfully",true);
	}
	@Test
	public void registerTest() {
		Reporter.log("User Registered Successfully",true);
	}
	@Test(dependsOnMethods ={"registerTest","loginTest"})
	public void cardTest() {
		Reporter.log("added card is Successfully",true);
	}
}
