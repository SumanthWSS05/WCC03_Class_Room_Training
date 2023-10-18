package launchBrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchEmptyChromeBrowser {

	public static void main(String[] args) {
		//Step 1 : providing the key and location of driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Step 2 : create object of browser class
		ChromeDriver driver = new ChromeDriver();
	}
}
