package pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriFileUpload {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("register_Layer")).click();
		WebElement elementToScroll = driver.findElement(By.xpath("//span[text()='WhatsApp']"));
		driver.executeScript("arguments[0].scrollIntoView(false);", elementToScroll);
		driver.findElement(By.id("resumeUpload")).sendKeys("D:/Sumanth ELF/CourseContentSelenium.pdf");
	}

}
