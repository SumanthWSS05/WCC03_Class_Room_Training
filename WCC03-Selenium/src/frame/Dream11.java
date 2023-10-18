package frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get("https://www.dream11.com/");
		Thread.sleep(2000);
		//switch to the frame with index
		driver.switchTo().frame(0);
		driver.findElement(By.id("regEmail")).sendKeys("1234567890");
		Thread.sleep(1000);
		System.out.println("------------------Before Click------------------");
		System.out.println(driver.findElement(By.id("regUser")).getText());
		driver.findElement(By.id("regUser")).click();
		System.out.println("------------------After Click------------------");
		System.out.println(driver.findElement(By.id("regUser")).getText());
	}
}
