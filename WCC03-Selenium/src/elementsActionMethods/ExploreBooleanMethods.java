package elementsActionMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExploreBooleanMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//to check an element is enabled or not
//		driver.get("https://demoapp.skillrary.com/");
//		Thread.sleep(2000);
//		System.out.println(driver.findElement(By.xpath("//input[@class='form-control']")).isEnabled());
		
//		driver.get("https://www.instagram.com/");
//		Thread.sleep(2000);
//		System.out.println(driver.findElement(By.xpath("//button[.='Log in']")).isEnabled());
		
		//to check an element is displayed or not
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.name("custom_gender")).isDisplayed());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Custom']")).click();
		System.out.println(driver.findElement(By.name("custom_gender")).isDisplayed());

	}

}
