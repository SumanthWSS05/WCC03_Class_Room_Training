package pop_ups;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToAvoidNotificationPopup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		ChromeOptions settings = new ChromeOptions();
//		settings.addArguments("--disable-notifications");
//		settings.addArguments("--incognito");
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(settings);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//		driver.get("https://www.easemytrip.com/");
//		driver.get("https://www.mygov.in/");
		driver.get("https://www.hdfcbank.com/");
		
	}

}
