package elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Welcome_Page extends Base_Page {

	public Welcome_Page(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "newsletter-email")
	private WebElement newsLetterTextBox;
	
	@FindBy(id = "newsletter-subscribe-button")
	private WebElement subscribeButton;

	public WebElement getNewsLetterTextBox() {
		return newsLetterTextBox;
	}

	public WebElement getSubscribeButton() {
		return subscribeButton;
	}
}
