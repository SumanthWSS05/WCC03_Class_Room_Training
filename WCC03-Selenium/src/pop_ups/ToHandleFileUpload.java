package pop_ups;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleFileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.totaljobs.com/Account/Register");
		driver.findElement(By.xpath("//div[text()='Accept All']")).click();
		driver.findElement(By.id("btnCVUpload")).click();
		driver.findElement(By.id("cvUploadOptions")).click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec("./AutoIt/enterText.exe");
	}
	//Try using autoIt script un Auth pop-up and Notification pop-up
}
