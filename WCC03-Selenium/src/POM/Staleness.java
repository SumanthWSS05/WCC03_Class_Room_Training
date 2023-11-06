package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Staleness {

	@Test
	public void run() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement login = driver.findElement(By.linkText("Log in"));
		WebElement register = driver.findElement(By.linkText("Register"));
		System.out.println(login);
		System.out.println(register);
		
		login.click();
		register.click();
	}
}
