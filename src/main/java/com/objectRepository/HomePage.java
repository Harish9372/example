package com.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}


	@FindBy(name ="q")
	private WebElement searchTextField;
	
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchButton;
	
	@FindBy(partialLinkText = "Shopping cart")
	private WebElement shoppingCartLink;
	
	@FindBy(linkText = "Log out")
	private WebElement logoutButton;
	

	@FindBy(partialLinkText = "APPAREAL&SHOES")
	private WebElement ApparealAndShoesLink;
	
	


	public WebElement getSearchTextField() {
		return searchTextField;
	}
	
	public WebElement getSearchButton() {
		return searchButton;
	}
	

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}
	
	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public WebElement getApparealAndShoesLink() {
		return ApparealAndShoesLink;
	}
	
	
	
	
}
