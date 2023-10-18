package handlingDropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Shopperstack {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get("https://www.shoppersstack.com/user-signin");
		driver.findElement(By.id("Email")).sendKeys("sumanth.l@testyantra.com");
		driver.findElement(By.id("Password")).sendKeys("Testing@123",Keys.ENTER);
		
		WebElement categoryDropDown = driver.findElement(By.id("category"));
		Select categorySelect = new Select(categoryDropDown);
		List<WebElement> allOptions = categorySelect.getOptions();
		
		for(WebElement option : allOptions) {
			System.out.println(option.getText());
		}		
		
//		driver.findElement(By.xpath("//button[@aria-label='Account settings']")).click();
//		driver.findElement(By.xpath("//li[text()='My Profile']")).click();
		
		
	}
}
