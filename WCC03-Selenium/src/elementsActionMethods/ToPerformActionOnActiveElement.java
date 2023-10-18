package elementsActionMethods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformActionOnActiveElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		Thread.sleep(1000);
		driver.switchTo().activeElement().sendKeys("Password");
	}
}
