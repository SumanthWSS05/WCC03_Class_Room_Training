package browserActions;

import org.openqa.selenium.chrome.ChromeDriver;

public class ExploringMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		String windowID = driver.getWindowHandle();
		System.out.println(windowID);
		
		driver.get("https://www.hdfcbank.com/");
		String windowId = driver.getWindowHandle();
		System.out.println(windowId);
		
		String titleOfThePage = driver.getTitle();
		String urlOfThePage = driver.getCurrentUrl();
		String sorceCode = driver.getPageSource();
		
		System.out.println(titleOfThePage);
		System.out.println(urlOfThePage);
		System.out.println(sorceCode);
		
		driver.get("https://www.icicibank.com/");
		windowId = driver.getWindowHandle();
		System.out.println(windowId);
		
		titleOfThePage = driver.getTitle();
		urlOfThePage = driver.getCurrentUrl();
		System.out.println(titleOfThePage);
		System.out.println(urlOfThePage);
	}

}
