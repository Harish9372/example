//package Steps;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import dev.failsafe.internal.util.Assert;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class StepDefinitionFile {
//	
//	
//WebDriver driver;
//@Given("user should navigate to the application")
//public void userShouldNavigateToTheApplication() {
//   driver = new ChromeDriver();
//   driver.manage().window().maximize();
//   driver.get("https://demowebshop.tricentis.com/");
//	
//}
//@Given("user click on the login text")
//public void userClickOnLoginText() {
//    driver.findElement(By.linkText("Log in")).click();
//    
//	
//	
//}
//@Given("user login as {string} and {string}")
//public void userLoginAsAnd(String string, String string2) {
//   driver.findElement(By.id("Email")).sendKeys(string);
//   driver.findElement(By.id("Password")).sendKeys(string2);
//   
//	
//}
//@When("user click on login button")
//public void userClickOnLoginButton() {
//    driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
//	
//	
//}
//@Then("login should successfull")
//public void loginShouldSuccessfull() throws InterruptedException {
//	org.testng.Assert.assertEquals(driver.getTitle().contains("kumar"), true,"Logging Successfull");
//   Thread.sleep(1000);
////	System.out.println("logging successfull");
//   driver.quit();
//}
//
//
//}
