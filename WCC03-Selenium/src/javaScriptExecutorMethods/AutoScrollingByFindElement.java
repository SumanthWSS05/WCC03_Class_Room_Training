package javaScriptExecutorMethods;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoScrollingByFindElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
//		driver.get("https://wildcraft.com/");
//		driver.findElement(By.xpath("//button[.='Explore the Range']")).click();
		
//		driver.get("https://www.naukri.com/");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//span[text()='Got it']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.linkText("Privacy policy")).click();
//		driver.findElement(By.xpath("//input[@title='Get link']")).click();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("Iphone",Keys.ENTER);
		String parentPage = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[contains(@href,'apple')]")).click();
		Set<String> allIds = driver.getWindowHandles();
		allIds.remove(parentPage);
		for(String windowId : allIds) {
			driver.switchTo().window(windowId);
		}
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		driver.findElement(By.xpath("//div[text()='Remove']")).click();
		
		
	}

}
