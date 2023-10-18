package mouseGestures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToResizeTheContent {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get("https://www.woodenstreet.com/");	
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		driver.findElement(By.id("search-user1")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ADD));
		actions.keyUp(Keys.CONTROL).perform();
//		actions.keyDown(Keys.CONTROL).sendKeys(Keys.ADD).perform();
	}

}
