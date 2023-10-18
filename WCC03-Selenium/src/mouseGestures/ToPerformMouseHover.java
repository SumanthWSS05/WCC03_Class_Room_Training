package mouseGestures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformMouseHover {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get("https://www.msrit.edu/");
		driver.findElement(By.xpath("//span[text()='×']")).click();
		WebElement examinationNavEle = driver.findElement(By.linkText("EXAMINATION"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(examinationNavEle).perform();
		driver.findElement(By.linkText("RESULTS")).click();
	}

}
