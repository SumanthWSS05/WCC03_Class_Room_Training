package identifyElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToIdentifyUsingName {
	
	public static void main(String[] args) throws InterruptedException {
				
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("Name is name");
		Thread.sleep(500);
		driver.findElement(By.name("pwd")).sendKeys("Password is passs");
		Thread.sleep(500);
		driver.findElement(By.id("keepLoggedInLabel")).click();
		Thread.sleep(500);
		driver.findElement(By.id("toPasswordRecoveryPageLink")).click();
		Thread.sleep(1500);
		driver.findElement(By.id("toLoginPageLink")).click();
		Thread.sleep(1500);
		driver.findElement(By.id("loginButton")).click();
	}

}
