package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Elements {

	public Elements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Register") 
	private WebElement register;

	@FindBy(linkText = "Log in") 
	public WebElement login;
	
	@FindBy(linkText = "ShoppingCart")
	public WebElement cart;
	
	@SuppressWarnings("unused")
	public WebElement whishlist;
	
	public WebElement emailTextfield ;
	
	public WebElement passwordTextfield;
	
	public WebElement loginButton;
}
