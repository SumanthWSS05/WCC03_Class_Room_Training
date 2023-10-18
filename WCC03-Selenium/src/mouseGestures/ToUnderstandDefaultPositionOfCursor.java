package mouseGestures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUnderstandDefaultPositionOfCursor {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get("https://www.bmsce.ac.in/");
		Thread.sleep(2000);   //use explicit wait
		Actions actions = new Actions(driver);
//		actions.click().perform();  -> clicks on (0,0) but no reaction
		
		actions.contextClick().perform(); // -> right click on (0,0)  
	}

}
