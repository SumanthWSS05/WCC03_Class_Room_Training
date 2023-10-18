package handlingDropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/signup");
		WebElement dayDropDown = driver.findElement(By.id("day"));
		WebElement monthDropDown = driver.findElement(By.id("month"));
		WebElement yearDropDown = driver.findElement(By.id("year"));
		
		Select daySelect = new Select(dayDropDown);
		Select monthSelect = new Select(monthDropDown);
		Select yearSelct = new Select(yearDropDown);
		
		daySelect.selectByIndex(25);
		monthSelect.selectByValue("9");
		yearSelct.selectByVisibleText("1905");
		
		
		
		
		
		
		
//		WebElement dayDropDown = driver.findElement(By.id("day"));
//		
//		Select daySelect = new Select(dayDropDown);
//		if(daySelect.isMultiple())
//			System.out.println("Day drop down is a multi select dropdown");
//		else
//			System.out.println("Day drop down is a single select dropdown");
//		
//		for(int i=0; i<30 ; i++) {
//			daySelect.selectByIndex(i);
//		}
		
//		WebElement monthDropDown = driver.findElement(By.id("month"));
//		Select monthSelect = new Select(monthDropDown);
//		if(monthSelect.isMultiple())
//			System.out.println("Month drop down is a multi select dropdown");
//		else
//			System.out.println("Month drop down is a single select dropdown");
//		
//		for(int i=0; i<12 ; i++) {
//			monthSelect.selectByIndex(i);
//		}
		
		
		
	}
}
