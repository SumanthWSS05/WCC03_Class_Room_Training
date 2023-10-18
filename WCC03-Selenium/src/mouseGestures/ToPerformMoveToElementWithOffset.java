package mouseGestures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformMoveToElementWithOffset {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get("https://www.skillrary.com/user/login");
//		driver.findElement(By.name("password")).sendKeys("WSS03@123");
//		Thread.sleep(2000);
		Actions actions = new Actions(driver);
//		actions.moveToElement(driver.findElement(By.name("password")),140,0).click().perform();
//		Thread.sleep(1000);
//		actions.click().perform();
		actions.moveByOffset(900, 235).click().perform();
		
		
	}

}
