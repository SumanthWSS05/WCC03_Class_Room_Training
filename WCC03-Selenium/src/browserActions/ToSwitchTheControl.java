package browserActions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchTheControl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Watch the Videos")).click();	
		Thread.sleep(1000);
		String seleniumWid = driver.getWindowHandle();
		Set<String> allWindowIds = driver.getWindowHandles();
		
		for(String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
			if(driver.getTitle().toLowerCase().contains("youtube")) {
				driver.close();
				break;
			}
		}
		driver.switchTo().window(seleniumWid);
		driver.getPageSource();
	}

}
