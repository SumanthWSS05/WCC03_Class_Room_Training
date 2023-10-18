package mouseGestures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUnderstandSendKeys {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		By password = By.name("pwd");
		
		actions.sendKeys(driver.findElement(password),"Sumanth").perform();	
		
//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(2000);
//		Actions actions = new Actions(driver);
//		actions.sendKeys(driver.findElement(By.id("newsletter-email")),"Sumanth").perform();		
	}

}
