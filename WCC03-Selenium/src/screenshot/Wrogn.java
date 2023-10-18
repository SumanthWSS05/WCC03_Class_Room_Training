package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Wrogn {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.usplworld.com/wrogn/");
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshot);
		File dest = new File("./errorshots/Car.png");

		FileHandler.copy(screenshot, dest);

		FileHandler.copy(
				driver.findElement(By.xpath("//div[@class='carousel-item active']")).getScreenshotAs(OutputType.FILE),
				new File("./errorshots/wrognImage.png"));
	}

}
