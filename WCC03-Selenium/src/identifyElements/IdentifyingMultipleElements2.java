package identifyElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyingMultipleElements2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("Iphone",Keys.ENTER);
		List<WebElement> resultList = driver.findElements(By.xpath("//div[contains(@data-tkid,'SEARCH')]"));
		System.out.println("Total number of products displayed is : " +resultList.size());
		for(WebElement result : resultList) {
			System.out.println(result.getText());
		}
	}

}
