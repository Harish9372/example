package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	
public ShoppingCartPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "(//a[text()='14.1-inch Laptop'])[2]")
	private WebElement laptop;
	
	public WebElement getLaptop() {
		return laptop;
	}
	
	

}
