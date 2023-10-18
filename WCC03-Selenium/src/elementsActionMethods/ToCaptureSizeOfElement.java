package elementsActionMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureSizeOfElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		Dimension loginButton = driver.findElement(By.linkText("Log in")).getSize();
		System.out.println("Login button Height is "+loginButton.getHeight());
		System.out.println("Login button Width is "+loginButton.getWidth());
		System.out.println("=======================");
		Dimension emailBox = driver.findElement(By.id("Email")).getSize();
		System.out.println("Email text field Height is "+emailBox.getHeight());
		System.out.println("Email text field Width is "+emailBox.getWidth());
		System.out.println("=======================");
		Dimension passwordBox = driver.findElement(By.id("Password")).getSize();
		System.out.println("Password text field Height is "+passwordBox.getHeight());
		System.out.println("Password text field Width is "+passwordBox.getWidth());
		driver.quit();
	}
}
