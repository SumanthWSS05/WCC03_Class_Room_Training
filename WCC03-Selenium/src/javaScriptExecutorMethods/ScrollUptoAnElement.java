package javaScriptExecutorMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUptoAnElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		driver.get("https://www.rolex.com/");
		driver.findElement(By.xpath("//button[.='AGREE']")).click();
		Thread.sleep(2000);
		
		WebElement facebookLogo = driver.findElement(By.xpath("//a[contains(@title,'Facebook')]"));
		driver.executeScript("arguments[0].scrollIntoView(false)", facebookLogo);
		
		
	}

}
