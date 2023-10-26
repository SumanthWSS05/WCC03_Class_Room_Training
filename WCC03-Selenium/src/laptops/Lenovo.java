package laptops;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lenovo {

	@Test(invocationCount = 30, threadPoolSize = 30)
	public void launchLenovo() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.lenovo.com/in/en/");
		driver.quit();
	}
	
	@Test(priority = -1)
	public void launchStoreLenovo() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://store.lenovo.com/");
		driver.quit();
	}	
}
