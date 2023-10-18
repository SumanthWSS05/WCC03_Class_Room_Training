package elementsActionMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureCSSValueOfElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		String prop1 = driver.findElement(By.name("login")).getCssValue("background-color");
		String prop2 = driver.findElement(By.name("login")).getCssValue("border-radius");
		String prop3 = driver.findElement(By.name("login")).getCssValue("font-weight");
		
		System.out.println(prop1);
		System.out.println(prop2);
		System.out.println(prop3);
		driver.quit();		
	}
}
