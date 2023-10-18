package elementsActionMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureLocationOfElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		Point loginButton = driver.findElement(By.linkText("Log in")).getLocation();
		System.out.println("Login button X is "+loginButton.getX());
		System.out.println("Login button Y is "+loginButton.getY());
		System.out.println("=======================");
		Point emailBox = driver.findElement(By.id("Email")).getLocation();
		System.out.println("Email text field X is "+emailBox.getX());
		System.out.println("Email text field Y is "+emailBox.getY());
		System.out.println("=======================");
		Point passwordBox = driver.findElement(By.id("Password")).getLocation();
		System.out.println("Password text field X is "+passwordBox.getX());
		System.out.println("Password text field Y is "+passwordBox.getY());
		driver.quit();
		
		/*
		 * Rectangle rect = driver.findElement(By.linkText("Log in")).getRect();
		 * System.out.println(rect.getHeight()); System.out.println(rect.getWidth());
		 * System.out.println(rect.getX()); System.out.println(rect.getY());
		 * rect.setHeight(100); rect.setWidth(200); rect.setX(20); rect.setY(20);
		 * System.out.println(rect.getHeight()); System.out.println(rect.getWidth());
		 * System.out.println(rect.getX()); System.out.println(rect.getY());
		 * 
		 * Rectangle rect1 = driver.findElement(By.linkText("Log in")).getRect();
		 * System.out.println(rect1.getHeight()); System.out.println(rect1.getWidth());
		 * System.out.println(rect1.getX()); System.out.println(rect1.getY());
		 */
	}
}
