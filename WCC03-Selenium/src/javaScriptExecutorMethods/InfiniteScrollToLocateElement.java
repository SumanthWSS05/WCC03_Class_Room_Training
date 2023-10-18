package javaScriptExecutorMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class InfiniteScrollToLocateElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.get("https://www.google.com/doodles");
		
		for(;;) {
			try {
				driver.findElement(By.linkText("2023 Women's World Cup Semi Finals (Aug 15-16)")).click();
				break;
			} catch (NoSuchElementException e) {
				driver.executeScript("window.scrollBy(0,500);");
			}
		}
	}

}
