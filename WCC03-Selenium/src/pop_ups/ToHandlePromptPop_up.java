package pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandlePromptPop_up {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 5);
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame("iframeResult");		
		
		//Case 1 : just click try it capture message and CANCEL
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		explicitWait.until(ExpectedConditions.alertIsPresent());
		Alert promptAlert = driver.switchTo().alert();
		System.out.println(promptAlert.getText());
		promptAlert.dismiss();
		Thread.sleep(2000);
		//Case 2 : click try it click OK
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		explicitWait.until(ExpectedConditions.alertIsPresent());
		promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Romeo");
		promptAlert.accept();
		
		System.out.println(driver.findElement(By.id("demo")).getText());
		
		
	}

}
