package identifyElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kalki {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get("https://www.kalkifashion.com/in/");
		driver.findElement(By.xpath("//button[text()='No thanks']")).click();
		driver.findElement(By.id("user_close_popup")).click();
		driver.findElement(By.linkText("KIDS")).click();
		try {
			driver.findElement(By.xpath("//a[contains(text(),'Kalki Beige Cream Printed Lehenga')]/../..//span[contains(@class,'wishlist-icon')]")).click();
		}catch (ElementClickInterceptedException e) {
			driver.findElement(By.xpath("//a[contains(text(),'Kalki Beige Cream Printed Lehenga')]/../..//span[contains(@class,'wishlist-icon')]")).click();
		}
		try {
			driver.findElement(By.xpath("//a[contains(text(),'KALKI Canary Yellow Kurta Set')]/../..//span[contains(@class,'wishlist-icon')]")).click();
		}catch (ElementClickInterceptedException e) {
			driver.findElement(By.xpath("//a[contains(text(),'KALKI Canary Yellow Kurta Set')]/../..//span[contains(@class,'wishlist-icon')]")).click();
		}
		driver.findElement(By.id("wishlist-item")).click();
		List<WebElement> wishlistElements = driver.findElements(By.xpath("//span[text()='Buy Now']"));
		System.out.println("Number of products inside wishlist is :"+wishlistElements.size());
	}
}
