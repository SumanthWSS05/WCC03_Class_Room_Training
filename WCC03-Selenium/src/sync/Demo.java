package sync;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		WebDriverWait explicitWait = new WebDriverWait(driver, 25);
		
		driver.get("https://demo.actitime.com/login.do");
		
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("usernamee")));
		driver.findElement(By.id("username")).sendKeys("sumanth");
		driver.findElement(By.name("pwd")).sendKeys("");
	}
}
