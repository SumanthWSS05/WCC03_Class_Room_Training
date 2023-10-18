package browserActions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToMaximizeSpecificBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/user/Desktop/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(2000);
		
		Set<String> allWindowIds = driver.getWindowHandles();
		System.out.println("The no of window id is : " +allWindowIds.size());
		
		for(String windoId : allWindowIds) {
			driver.switchTo().window(windoId);
			if(driver.getTitle().toLowerCase().contains("kfc")) {
				driver.manage().window().maximize();
				break;
			}
		}
	}

}
