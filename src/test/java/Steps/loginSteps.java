//package Steps;
//
//import java.util.Scanner;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class loginSteps {
//    WebDriver driver;
//   // Scanner sc = new Scanner(System.in);
//	@Given("user navigate to the application")
//	public void userNavigateToTheApplication() {
//		driver = new ChromeDriver();
//	   driver.manage().window().maximize();
//	   driver.get("https://www.goibibo.com/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only%20Goibibo&utm_term=!SEM!DF!G!Brand!RSA!108599293!6504095653!602838584772!e!goibibo!c!&gad_source=1&gclid=CjwKCAiAp4O8BhAkEiwAqv2UqCMOGmPxtDrlmLvGT20GuzpCan0jTEpXZkSIm8DH0HIDAtl8COOy-xoCLMEQAvD_BwE");
//	   
//	}
////	@Given("user click on login button")
////	public void userClickOnLoginButton() throws InterruptedException {
////		driver.findElement(By.xpath("//li[text()='LOGIN / SIGNUP'][1]")).click();
////		Thread.sleep(1000);
////	}
//	@Given("user click on cancel popup")
//	public void userClickOnCancelPopup() throws InterruptedException {
//		driver.switchTo().alert().dismiss();
//		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
//		Thread.sleep(1000);
//	}
//	@Given("user enter the destination from {string} to {string}")
//	public void userEnterTheDestinationFromTo(String string, String string2) {
//	   driver.findElement(By.xpath("//span[text()='From'][1]")).sendKeys(string,Keys.ENTER);
//	   driver.findElement(By.xpath("//span[text()='To'][1]")).sendKeys(string2,Keys.ENTER);
//	}
//	@When("user click on search flights")
//	public void userClickOnSearchFlights() {
//	    driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']")).click();
//	}
//	@Then("flights status will be displayed")
//	public void flightsStatusWillBeDisplayed() {
//	   System.out.println("Flights Status Displayed");
//	   
//	}
//
//	 
//}
