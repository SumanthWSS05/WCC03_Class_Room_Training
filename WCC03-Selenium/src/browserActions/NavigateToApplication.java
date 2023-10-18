package browserActions;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToApplication {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver ref = new ChromeDriver();
		
		ref.get("https://www.online.citibank.co.in/");
		Thread.sleep(2000);
		ref.get("https://www.onlinesbi.sbi/");
		Thread.sleep(2000);
		ref.get("https://www.icicibank.com/");
	}

}
