package mouseGestures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUnderstandDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		
//		actions.doubleClick(driver.findElement(By.id("add"))).perform();
		
//		actions.moveToElement(driver.findElement(By.id("add"))).perform();
//		actions.doubleClick().perform();
		
		actions.moveToElement(driver.findElement(By.id("add"))).click().click().perform();
	}

}
