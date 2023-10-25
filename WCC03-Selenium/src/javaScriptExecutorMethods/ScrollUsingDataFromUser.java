package javaScriptExecutorMethods;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

@SuppressWarnings("resource")
public class ScrollUsingDataFromUser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		driver.get("https://tommyhilfiger.nnnow.com/");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter by how many pixels needs to be scrolled ?");
		int scrollDistance = sc.nextInt();
		Thread.sleep(2000);
		driver.executeScript("window.scrollBy(0,arguments[0])", scrollDistance);
		
	}

}
