package browserActions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToResizeBrowserWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ibaco.in/");
		
		Dimension changeSize ;
		
		for(int i=500; i<=2000 ; i+=50) {
			changeSize = new Dimension(i, i);
			Thread.sleep(500);
			driver.manage().window().setSize(changeSize);
		}
		
	}
}
