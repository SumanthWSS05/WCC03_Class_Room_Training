package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {

	@Test
	public void loginDWS() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		Elements ele = new Elements(driver);
		Thread.sleep(3000);
//		ele.getLogin().click();
//		ele.getEmailTextfield().sendKeys("admin");
//		ele.getPasswordTextfield().sendKeys("admin");
//		ele.getLoginButton().click();
	}
}
