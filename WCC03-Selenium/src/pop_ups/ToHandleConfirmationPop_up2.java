package pop_ups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleConfirmationPop_up2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 5);
		
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		try {
			driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		} catch (NoSuchElementException e) {

		}
		String currentTab = driver.getWindowHandle();
		driver.findElement(By.partialLinkText("New User ? Register here/Activate")).click();
		explicitWait.until(ExpectedConditions.alertIsPresent());
		Alert confirmation = driver.switchTo().alert();
		System.out.println(confirmation.getText());
		confirmation.accept();
		explicitWait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> allTabs = driver.getWindowHandles();
		allTabs.remove(currentTab);
		for (String windowId : allTabs) {
			driver.switchTo().window(windowId);
		}
		driver.findElement(By.id("nextStep")).click();

	}

}
