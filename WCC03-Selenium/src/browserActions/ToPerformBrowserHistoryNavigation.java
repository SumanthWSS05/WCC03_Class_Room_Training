package browserActions;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformBrowserHistoryNavigation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.tvsmotor.com/");
		Thread.sleep(2000);
		driver.get("https://olaelectric.com/");
		Thread.sleep(2000);
		driver.get("https://www.atherenergy.com/");
		
		Navigation navigate = driver.navigate();
		navigate.back();
		Thread.sleep(1000);
		navigate.back();
		Thread.sleep(1000);
		navigate.forward();
		Thread.sleep(1000);
		navigate.refresh();
	}
}
