package sync;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToUnderstandExplicit {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));  => in Selenium 4 and above
		WebDriverWait explicitWait = new WebDriverWait(driver, 25);
		
//		FluentWait fWait = new FluentWait(driver);
//		fWait.withTimeout(Duration.ofSeconds(25));
//		fWait.pollingEvery(Duration.ofSeconds(1));
//		fWait.until(ExpectedConditions.alertIsPresent());
		
		driver.get("https://www.shoppersstack.com/user-signin");
		driver.findElement(By.id("Email")).sendKeys("sumanth.l@testyantra.com");
		driver.findElement(By.id("Password")).sendKeys("Testing@123",Keys.ENTER);
		driver.findElement(By.xpath("//img[@alt='Levis Mens Regular Fit Tee']")).click();
		System.out.println("Check button enabled : "+driver.findElement(By.id("Check")).isEnabled());
		driver.findElement(By.id("Check Delivery")).sendKeys("432101");
		
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("Check")));
		
		System.out.println("Check button enabled : "+driver.findElement(By.id("Check")).isEnabled());
		driver.findElement(By.id("Check")).click();
//		explicitWait.until(ExpectedConditions.alertIsPresent());
	}
}
