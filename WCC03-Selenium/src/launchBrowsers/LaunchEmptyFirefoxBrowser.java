package launchBrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchEmptyFirefoxBrowser {

	public static void main(String[] args) {
		// Step 1 : provide the key and location of driver
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");

		// Step 2 : create object for browser class
		FirefoxDriver driver = new FirefoxDriver();
	}
}
