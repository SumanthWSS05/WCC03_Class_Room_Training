package assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchAssign {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///C:/Users/user/Desktop/MultipleWindow.html");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(1000);

//		Assignment 1
//		Set<String> allWindowIds = driver.getWindowHandles();
//		for(String windowId : allWindowIds) {
//			driver.switchTo().window(windowId);
//			Thread.sleep(1000);
//			System.out.println(driver.getTitle());
//		}

//		Assignment 2
//		Set<String> allWindowIds = driver.getWindowHandles();
//		for(String windowId : allWindowIds) {
//			driver.switchTo().window(windowId);
//			if(driver.getTitle().toLowerCase().contains("subway")) {
//				driver.close();
//				break;
//			}
//		}

//		Assignment 3
		Set<String> allWindowIds = driver.getWindowHandles();
		Iterator<String> ids = allWindowIds.iterator();
		while(ids.hasNext()) {
			driver.switchTo().window(ids.next());
			String title = driver.getTitle().toLowerCase();
			if(title.contains("subway") | title.contains("kfc"))
				driver.close();
		}

//		Assignment 4
//		Set<String> allWindowIds = driver.getWindowHandles();
//		String parentWindowId = driver.getWindowHandle();
//		allWindowIds.remove(parentWindowId);
//		for (String windowId : allWindowIds) {
//			driver.switchTo().window(windowId);
//			driver.close();
//		}
		
//		Assignment 5
//		driver.close();  //NoSuchWindowException
						 //NoSuchSessionExcpeiton
	}

}
