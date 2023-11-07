package elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Base_Page {

	public WebDriver driver ;
	
	public Base_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(partialLinkText = "BOOKS")
	private WebElement books;
	
	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement computers;
	
	@FindBy(partialLinkText = "ELECTRONICS")
	private WebElement electronics;
	
	@FindBy(partialLinkText = "DIGITAL DOWNLOADS")
	private WebElement digtalDownloads;
	
	@FindBy(partialLinkText = "JEWELRY")
	private WebElement jewelry;	
	
	@FindBy(partialLinkText = "Log in")
	private WebElement logIn;
	
	@FindBy(partialLinkText = "Register")
	private WebElement register;	
	
	@FindBy(partialLinkText = "Shopping Cart")
	private WebElement shoppingCart;	
	
	@FindBy(partialLinkText = "Wishlist")
	private WebElement wishlist;

	public WebElement getBooks() {
		return books;
	}

	public WebElement getComputers() {
		return computers;
	}

	public WebElement getElectronics() {
		return electronics;
	}

	public WebElement getDigtalDownloads() {
		return digtalDownloads;
	}

	public WebElement getJewelry() {
		return jewelry;
	}

	public WebElement getLogIn() {
		return logIn;
	}

	public WebElement getRegister() {
		return register;
	}

	public WebElement getShoppingCart() {
		return shoppingCart;
	}

	public WebElement getWishlist() {
		return wishlist;
	}	
}
