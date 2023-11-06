package unitTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class BaseClass {

	public WebDriver driver;
	public SoftAssert softAssert;
	
	@BeforeClass(alwaysRun = true)
	public void browserSetup() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		softAssert = new SoftAssert();
	}
	
	@BeforeMethod(alwaysRun = true)
	public void login() {
		driver.get("https://demowebshp.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("admin987@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("admin@123",Keys.ENTER);
	}
	
	@AfterMethod(alwaysRun = true)
	public void logout() throws InterruptedException {
		Reporter.log("Even though there is a failure in @Test im working",true);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log out")).click();
	}
	
	@AfterClass(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}
		
}
