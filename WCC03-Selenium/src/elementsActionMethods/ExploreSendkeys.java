package elementsActionMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExploreSendkeys {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(1000);
		driver.findElement(By.id("FirstName")).sendKeys("sumanth",Keys.CONTROL+"a");
		Thread.sleep(1000);
		driver.findElement(By.id("FirstName")).sendKeys(Keys.CONTROL+"c");
		Thread.sleep(1000);
		driver.findElement(By.id("FirstName")).sendKeys(Keys.TAB);
	}

}
