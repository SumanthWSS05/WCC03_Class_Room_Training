package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Elements {

	WebDriver driver = null ;
	public Elements(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(linkText = "") 
	private WebElement register;

	@FindBy(partialLinkText  = "Log in") 
	public WebElement login;
	
	@FindBy(linkText = "ShoppingCart")
	public WebElement cart;
	
	@FindBy(className  =  "")
	public WebElement whishlist;
	
	@FindBys({
		@FindBy(id ="hjds"),
		@FindBy(name = "asfklj")
	})
	public WebElement emailTextfield ;
	
	@FindAll({
		@FindBy(id =""),
		@FindBy(name = "")
	})
	public List<WebElement> passwordTextfield;
	
	String run = "";
	
	@FindBy(xpath = "//table[@td='er']/../..//")
	public WebElement loginButton;
	
	public WebElement getGenderRadioButton(String value) {
		return driver.findElement(By.xpath("//input[@type='"+run+"']"));
	}
}
