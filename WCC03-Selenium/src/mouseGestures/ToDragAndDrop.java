package mouseGestures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 25);
		
		driver.get("https://trello.com/en/login");	
		driver.findElement(By.id("user")).sendKeys("sumanthqsp@gmail.com");
		driver.findElement(By.id("login")).click();
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("login-submit")));
		
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.xpath("//div[@title='WSS03']")).click();
		WebElement card1 = driver.findElement(By.linkText("Completed"));
		WebElement card2 = driver.findElement(By.linkText("In Progress"));
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(card1, 270, 0).perform();
		Thread.sleep(2000);
		actions.dragAndDropBy(card2, 850, -35).perform();
	}

}
