package script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * 
 * @author Sumanth 19th Oct 2023
 *
 */
public class TC_DS_Login_Assertion { // Test case id

	@Test
	public void main() { // test case name

		// Expected Data
		String expectedWelcomePageTitle = "Shoperstak";
		String expectedLoginPageTitle = "Shoperstack | Login";
		String expectedHomePageTitle = "Shoperstack | Home";

		// Test Data
		String usernameData = "sumanth.l@testyantra.com";
		String passwordData = "Testing@123";
		
		SoftAssert softAssert = new SoftAssert();

		// Step 1 : Open "Chrome" browser and enter test URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		System.out.println("Browser launched successfully");
		driver.manage().window().maximize();
		System.out.println("Browser window maximized successfully");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.shoppersstack.com/");
		String actualWelcomePageTitle = driver.getTitle();
		Assert.assertEquals(actualWelcomePageTitle, expectedWelcomePageTitle, "Welcome page is not displayed");
		System.out.println("Welcome page is displayed");

		// Step 2 : Click on "Login" button
		driver.findElement(By.id("loginBtn")).click();
		String actualLoginPageTitle = driver.getTitle();
		Assert.assertEquals(actualLoginPageTitle, expectedLoginPageTitle, "Login page is not displayed");
		System.out.println("Login page is displayed");

		// Step 3 : Click on "Email ID" text field and enter valid Email ID
		driver.findElement(By.id("Email")).sendKeys(usernameData);
		String usernameEntered = driver.findElement(By.id("Email")).getAttribute("value");
		Assert.assertEquals(usernameData, usernameEntered, "Email id text field did not accept valid email id");
		System.out.println("Email id text field accepted valid email id");

		// Step 4 : click on "password" text field and enter valid password
		driver.findElement(By.id("Password")).sendKeys(passwordData);
		String passwordEntered = driver.findElement(By.id("Password")).getAttribute("value");
		Assert.assertEquals(passwordData, passwordEntered, "Password text field did not accept valid password");
		System.out.println("Password text field accepted valid password");

		// Step 5 : Click on "Login" button
		driver.findElement(By.id("Login")).click();
		String actualHomePageTitle = driver.getTitle();
		Assert.assertEquals(actualHomePageTitle, expectedHomePageTitle, "Home page is not displayed");
		System.out.println("Home page is displayed");

		// Step 6 : Click on "Logout" button
		driver.findElement(By.xpath("//button[@aria-label='Account settings']")).click();
		driver.findElement(By.xpath("//li[text()='Logout']")).click();
		actualWelcomePageTitle = driver.getTitle();
		Assert.assertEquals(actualWelcomePageTitle, expectedWelcomePageTitle, "Welcome page is not displayed");
		System.out.println("Welcome page is displayed");
	}

}
