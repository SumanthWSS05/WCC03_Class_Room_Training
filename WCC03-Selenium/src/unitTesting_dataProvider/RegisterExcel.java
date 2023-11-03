package unitTesting_dataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterExcel {	

	@DataProvider(parallel = true)
	public String[][] details(){
		
		String[][] sarr = { 
					{"female","mohini","kashetwar","mohini@gmail.com","moh123","moh123"},
					{"female","kalpana","hiremath","kalpana@gmail.com","kal123","kal123"},
					{"male","sumanth","cl","sumanth@gmail.com","sum123","sum123"}
				};
		return sarr;
	}
	
	@Test(dataProvider = "details")
	public void registerANewUser(String[] arr) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("gender-"+arr[0]+"")).click();
		driver.findElement(By.id("FirstName")).sendKeys(arr[1]);
		driver.findElement(By.id("LastName")).sendKeys(arr[2]);
		driver.findElement(By.id("Email")).sendKeys(arr[3]);
		driver.findElement(By.id("Password")).sendKeys(arr[4]);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(arr[5]);
		driver.findElement(By.id("register-button")).click();	
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		JavascriptExecutor js = (JavascriptExecutor) driver;
	}
}
