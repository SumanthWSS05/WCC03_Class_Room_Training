package elementsActionMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureTheText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(2000);
		String errorMessage = driver.findElement(By.className("validation-summary-errors")).getText();
		System.out.println("Error Message is ");
		System.out.println(errorMessage);
		System.out.println("===========================");
		String navElements = driver.findElement(By.className("top-menu")).getText();
		System.out.println(navElements);
	}

}
