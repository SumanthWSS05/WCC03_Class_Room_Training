package pop_ups;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoIbibo_Calendar_pop_up {

	public static void main(String[] args) {

		LocalDateTime departureDate = LocalDateTime.now().plusYears(1).plusDays(16);
		int depatureYear = departureDate.getYear();
		int depatureDay = departureDate.getDayOfMonth();
		String departureMonth = departureDate.getMonth().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//div[@data-id='auth-flow-section']/span")).click();
		driver.findElement(By.xpath("//p[text()='Scan to Download App']/../../p[not(text())]")).click();

		driver.findElement(By.xpath("//span[text()='Departure']/..")).click();

		String day = (depatureDay <= 9) ? ("0" + depatureDay) : ("" + depatureDay);

		for (;;) {
			try {
				driver.findElement(By.xpath("//div[contains(@aria-label,'" + departureMonth + " " + day + " " + depatureYear + "')]")).click();
				break;
			} catch (NoSuchElementException e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
		driver.findElement(By.xpath("//span[text()='Done']")).click();

//		for(int i=0; i<12; i++) {
//			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
//		}
//		
//		if(depatureDay<9) {
//			driver.findElement(By.xpath("//div[contains(@aria-label,'"+departureMonth+" 0"+depatureDay+" "+depatureYear+"')]")).click();
//		}else{
//			driver.findElement(By.xpath("//div[contains(@aria-label,'"+departureMonth+" "+depatureDay+" "+depatureYear+"')]")).click();
//		}
//		driver.findElement(By.xpath("//span[text()='Done']")).click();

	}

}
