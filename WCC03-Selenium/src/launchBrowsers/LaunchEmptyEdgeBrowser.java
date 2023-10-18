package launchBrowsers;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEmptyEdgeBrowser {

	public static void main(String[] args) {
		//Step 1 : provide the key and location of driver
		System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
		
		//Step 2 : create object for browser class
		EdgeDriver driver = new EdgeDriver();
	}

}
