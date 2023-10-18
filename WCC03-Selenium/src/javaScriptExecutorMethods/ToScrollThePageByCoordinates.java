package javaScriptExecutorMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollThePageByCoordinates {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		try {
			driver.findElement(By.linkText("Privacy policy")).click();
		}
		catch (ElementClickInterceptedException ex) {
			Thread.sleep(2000);
			driver.executeScript("window.scrollBy(0,500);");
			Thread.sleep(2000);
			driver.findElement(By.linkText("Privacy policy")).click();
		}
	}

}
