package javaScriptExecutorMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingUptoElementsCoordinates {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.naukri.com/");
		int locy = driver.findElement(By.xpath("//span[text()='Healthcare & Life Sciences']")).getLocation().getY();
		driver.executeScript("window.scrollTo(0,"+locy+")");
		Thread.sleep(2000);
		driver.executeScript("window.scrollBy(0,100");
	}

}
