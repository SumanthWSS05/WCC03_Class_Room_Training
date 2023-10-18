package javaScriptExecutorMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToEnterDataIntoDisabledBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/signup");
		Thread.sleep(3000);
		WebElement hiddenTextBox = driver.findElement(By.name("custom_gender"));
		driver.executeScript("arguments[0].value='WCC03 Java Selenium'", hiddenTextBox);
	}
}
