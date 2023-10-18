package frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpeedTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get("https://www.speedtest.net/");
		Thread.sleep(2000);
		WebElement frameElement = driver.
			findElement(By.xpath("//div[@data-ad-placeholder='top-leaderboard']//iframe"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.id("cbb")).click();
	}

}
