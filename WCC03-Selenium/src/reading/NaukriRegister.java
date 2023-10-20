package reading;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NaukriRegister {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 25);
		
		driver.get("https://www.naukri.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("name")).sendKeys(ExcelUtility.readStringData("Register", 0, 0));
		driver.findElement(By.id("email")).sendKeys(ExcelUtility.readStringData("Register", 1, 0));
		driver.findElement(By.id("password")).sendKeys(ExcelUtility.readStringData("Register", 2, 0));
		driver.findElement(By.id("mobile")).sendKeys(ExcelUtility.readStringData("Register", 3, 0));
		driver.findElement(By.xpath("//h2[contains(text(),'"+ExcelUtility.readStringData("Register", 4, 0)+"')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'"+ExcelUtility.readStringData("Register", 4, 1)+"')]")).click();
		driver.findElement(By.id("resumeUpload")).sendKeys(ExcelUtility.readStringData("Register", 5, 0));
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Register now']")));
		driver.findElement(By.xpath("//button[text()='Register now']")).click();
	}
}
