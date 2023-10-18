package mouseGestures;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToExploreKeyUpAndKeyDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.kalkifashion.com/in/");	
		List<WebElement> navElements = driver.findElements(By.xpath("//div[@id='desktop-nav' and not(contains(@class,'80%'))]/div/a"));
		Actions actions = new Actions(driver);
		
		for(WebElement ele : navElements) {
//			actions.keyDown(Keys.CONTROL).click(ele).perform();
			actions.keyDown(Keys.SHIFT).click(ele).perform();
			actions.keyUp(Keys.SHIFT).perform();
		}
		Thread.sleep(2000);
		driver.quit();		
	}

}
