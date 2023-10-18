package pop_ups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleConfirmationPop_up {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 5);
		
		driver.get("https://licindia.in/policy-loan-options");
		String currentWindowId = driver.getWindowHandle();
		WebElement payDirectButton = driver.findElement(By.linkText("Pay Direct (Without login)"));
		driver.executeScript("arguments[0].scrollIntoView(false)", payDirectButton);
		explicitWait.until(ExpectedConditions.elementToBeClickable(payDirectButton));
		payDirectButton.click();
		Alert confirmation = driver.switchTo().alert();
		System.out.println(confirmation.getText());
		confirmation.accept();
		explicitWait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(currentWindowId);
		for(String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
		}
		driver.findElement(By.xpath("//span[text()='Back to Home']")).click();
		
	}

}
