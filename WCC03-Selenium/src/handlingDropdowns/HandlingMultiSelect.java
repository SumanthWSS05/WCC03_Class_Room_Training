package handlingDropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/user/Desktop/dropDown.html");
		WebElement multiListbox = driver.findElement(By.id("m1"));
		Select multiSelect = new Select(multiListbox);
		
		if(multiSelect.isMultiple()) 
			System.out.println("The dropdown is a multi select dropdown");
		else
			System.out.println("The dropdown is a single select dropdown");
		
		multiSelect.selectByIndex(3);
		Thread.sleep(1000);
		multiSelect.selectByValue("1");
		Thread.sleep(1000);
		multiSelect.selectByVisibleText("Grapes");
		
		List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions();
		System.out.println("Total number of options selected is : " + selectedOptions.size());
		System.out.println("Selected options are ");
		for(WebElement option : selectedOptions) {
			System.out.println(option.getText());
		}
		
		System.out.println("First selected option is : "+multiSelect.getFirstSelectedOption().getText());
		Thread.sleep(1000);
		multiSelect.deselectByIndex(2);
		Thread.sleep(1000);
		multiSelect.deselectByVisibleText("Apple");
		Thread.sleep(1000);
		multiSelect.deselectByValue("4");
	}
}
