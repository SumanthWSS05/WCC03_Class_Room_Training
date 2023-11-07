package elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page extends Base_Page{

	public Login_Page(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "Email")
	private WebElement emailTextField;
	
	@FindBy(id = "Password")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void login(String username,String password) {
		emailTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
	}
	
}
