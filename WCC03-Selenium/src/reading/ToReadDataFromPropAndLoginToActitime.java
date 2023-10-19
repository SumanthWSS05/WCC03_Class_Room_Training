package reading;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromPropAndLoginToActitime {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./testData/data.properties");
		Properties data = new Properties();
		data.load(fis);
		
		System.setProperty(data.getProperty("chromeKey"), data.getProperty("chromePath"));
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get(data.getProperty("testUrl"));
		driver.findElement(By.id("username")).sendKeys(data.getProperty("username"));
		driver.findElement(By.name("pwd")).sendKeys(data.getProperty("password"),Keys.ENTER);
	}

}
