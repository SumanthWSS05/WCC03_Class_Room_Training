package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToTakeElementScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://thebelgianwaffle.co/");
		Thread.sleep(2000);
		File temp = driver.findElement(By.xpath("//img[@alt='The Belgian Waffle Co']")).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(temp, new File("./errorshots/ele2.png"));
		driver.quit();		
	}

}
