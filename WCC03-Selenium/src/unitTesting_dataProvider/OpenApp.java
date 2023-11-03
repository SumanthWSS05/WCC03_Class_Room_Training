package unitTesting_dataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OpenApp {
	
	@DataProvider
	public String[] urlData() {
		String[] url = {
						"https://www.lakmeindia.com/",
						"https://www.maybelline.com/",
						"https://www.clinique.co.uk/",
						"https://www.esteelauder.in/",
						"https://www.dailylifeforever52.in/",
						"https://www.maccosmetics.in/"
						};
		return url;
	}

	@Test(enabled = false, dataProvider = "urlData")
	public void launch(String url) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get(url);
		driver.quit();
	}
	
//	@DataProvider
//	public Integer[] data() {
//		Integer[] arr =  {12,234,45,78,98,45,32,2,12,12,45};
//		return arr;
//	}
//	
//	@Test(dataProvider = "data")
//	public void print(int a) {
//		Reporter.log(""+a,true);
//	}
}
