package browserActions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureMultipleWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		Thread.sleep(1000);
		Set<String> allWindowIds = driver.getWindowHandles();
		System.out.println("The no of window id is " +allWindowIds.size());
		for(String windowId : allWindowIds) {
			System.out.println(windowId);
		}
		System.out.println("==============================");
		driver.findElement(By.linkText("Watch the Videos")).click();	
		Thread.sleep(1000);
		
		Set<String> all = driver.getWindowHandles();
		System.out.println("The no of window id is " +all.size());
		for(String windowId : all) {
			System.out.println(windowId);
		}	
	}

}
