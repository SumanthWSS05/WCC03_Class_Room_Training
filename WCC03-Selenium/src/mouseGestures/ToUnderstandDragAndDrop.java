package mouseGestures;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToUnderstandDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 25);
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		WebElement frameEle = driver.findElement(By.xpath("//iframe[contains(@data-src,'photo-manager')]"));
		driver.switchTo().frame(frameEle);
		
		List<WebElement> elementsToBeDragged = driver.findElements(By.xpath("//ul[@id='gallery']/li/h5"));
		WebElement dropLocation = driver.findElement(By.id("trash"));
		Actions actions = new Actions(driver);
		
		for(WebElement element : elementsToBeDragged) {
			String imageName = element.getText();
			explicitWait.until(ExpectedConditions.visibilityOf(element));
			actions.dragAndDrop(element, dropLocation).perform();
			explicitWait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//ul[@id='gallery']/li/h5"), imageName));
		}
		
	}

}
