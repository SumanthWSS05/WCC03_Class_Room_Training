package browserActions;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureWindowId {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		String windowID = driver.getWindowHandle();
		System.out.println(windowID);
		
		driver.get("https://www.rbi.org.in/");
		String windowId = driver.getWindowHandle();
		System.out.println(windowId);
	}

}
