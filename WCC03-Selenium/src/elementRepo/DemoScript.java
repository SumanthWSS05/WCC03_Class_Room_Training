package elementRepo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoScript {

	@Test
	public void testingThefunctionalityOfLoginButton() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/");
		Welcome_Page welcomePage = new Welcome_Page(driver);
		welcomePage.getLogIn().click();
		Login_Page loginPage = new Login_Page(driver);
		loginPage.login("sumanth.l@testyantra.com", "Testing@123");
		driver.findElement(By.xpath(""));	
	}
}
