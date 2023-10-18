package javaScriptExecutorMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToEnterDataIntoHiddenElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get("https://www.oracle.com/in/java/technologies/javase/jdk11-archive-downloads.html");
		driver.findElement(By.linkText("jdk-11.0.19_windows-x64_bin.zip")).click();
		
		WebElement disabledButton = driver.findElement(By.linkText("Download jdk-11.0.19_windows-x64_bin.zip"));
		driver.executeScript("arguments[0].click()", disabledButton);	
		
	}

}
