package JavaPrograms;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;

public class Encapsulation {

	 String accholdname;
	 
	public Encapsulation(String accholdname) {  //THIS IS THE CONSTRUCTOR
		
		this.accholdname=accholdname;
	}

	public String getA() {
		return accholdname;
	}
	public void setA(String a1) {
		this.accholdname=a1;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Fetch acc hold name");
		Encapsulation i = new Encapsulation("harish");
		System.out.println(i.getA());
		i.setA("rahul");
		System.out.println(i.getA());
	
		
	}
}
