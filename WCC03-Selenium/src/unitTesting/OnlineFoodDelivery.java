package unitTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OnlineFoodDelivery {
	
	@Test(priority = 'a', invocationCount = 2 , threadPoolSize = 2, enabled = false)
	public void zomato() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.zomato.com/bangalore");
		driver.quit();
	}
	
	@Test(priority = 'c')
	public void swiggy() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.swiggy.com/");
		driver.quit();
	}
	
	@Test(priority = 3, timeOut = 2000)
	public void foodPanda() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.foodpanda.com/");
		driver.quit();
	}	
}
