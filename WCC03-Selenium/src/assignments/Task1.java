package assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(500);
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Thread.sleep(2000);
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String windowID : allWindowIds) {
			driver.switchTo().window(windowID);
			Thread.sleep(2000);
			String title = driver.getTitle().toLowerCase();
			if(title.contains("time tracking")) {
				System.out.println("You are on the right window");
				break;
			}
		}
		Thread.sleep(4000);
		driver.findElement(By.linkText("Try Free")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("FirstName")).sendKeys("abcd");
		driver.findElement(By.id("LastName")).sendKeys("efg");
		driver.findElement(By.id("Email")).sendKeys("abcd@gamil.com");
		driver.findElement(By.id("Company")).sendKeys("abcd");
		Thread.sleep(500);
		driver.findElement(By.id("confirm-button")).click();
	}

}
