package pop_ups;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trivago_Calendar_pop_up {

	public static void main(String[] args) {
		
		LocalDateTime from =  LocalDateTime.now();
		int from_day = from.getDayOfMonth();
		int from_year = from.getYear();
		String from_month = from.getMonth().name();
		from_month = from_month.substring(0, 3);
		from_month = from_month.substring(0,1).toUpperCase() + from_month.substring(1).toLowerCase();
		
		LocalDateTime to = from.plusDays(1);
		int to_day = to.getDayOfMonth();
		int to_year = to.getYear();
		String to_month = to.getMonth().name();
		to_month = to_month.substring(0, 3);
		to_month = to_month.substring(0,1).toUpperCase() + to_month.substring(1).toLowerCase();		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get("https://www.agoda.com/");
		driver.findElement(By.id("check-in-box")).click();
		
		String from_Date;
		String to_Date;
		
		if(from_day<9) {
			from_Date = "//div[contains(@aria-label,'"+from_month+" "+0+from_day+" "+from_year+"')]";
		}else {
			from_Date = "//div[contains(@aria-label,'"+from_month+" "+from_day+" "+from_year+"')]";
		}
		if(to_day<9) {
			to_Date = "//div[contains(@aria-label,'"+to_month+" "+0+to_day+" "+to_year+"')]";
		}else {
			to_Date = "//div[contains(@aria-label,'"+to_month+" "+to_day+" "+to_year+"')]";
		}
		
		driver.findElement(By.xpath(from_Date)).click();	////div[text()='October 2023']/..//span[text()='16']
		driver.findElement(By.xpath(to_Date)).click();
	}

}
