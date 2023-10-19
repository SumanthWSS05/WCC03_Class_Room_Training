package script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 * @author Sumanth
 * 19th Oct 2023
 *
 */
public class TC_Login_001 {    //Test case id  

	public static void main(String[] args) {   //test case name
		
		//Expected Data
		String expectedWelcomePageTitle = "Shoperstack";
		String expectedLoginPageTitle = "Shoperstack | Login";
		String expectedHomePageTitle = "Shoperstack | Home";
		
		//Test Data
		String usernameData = "shubhra@gmail.com";
		String passwordData = "Password@123";
		
		//Step 1 : Open "Chrome" browser and enter test URL
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		System.out.println("Browser launched successfully");
		driver.manage().window().maximize();
		System.out.println("Browser window maximized successfully");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.shoppersstack.com/");
		String actualWelcomePageTitle = driver.getTitle();
		if(actualWelcomePageTitle.equals(expectedWelcomePageTitle)) 
			System.out.println("Welcome page is displayed");
		else
			System.out.println("Welcome page is not displayed");
		
		//Step 2 : Click on "Login" button
		driver.findElement(By.id("loginBtn")).click();
		String actualLoginPageTitle = driver.getTitle();
		if(actualLoginPageTitle.equals(expectedLoginPageTitle)) 
			System.out.println("Login page is displayed");
		else
			System.out.println("Login page is not displayed");
		
		//Step 3 : Click on "Email ID" text field and enter valid Email ID
		driver.findElement(By.id("Email")).sendKeys(usernameData);
		String usernameEntered = driver.findElement(By.id("Email")).getAttribute("value");
		if(usernameData.equals(usernameEntered))
			System.out.println("Email id text field accepted valid email id");
		else
			System.out.println("Email id text field did not accept valid email id");
		
		//Step 4 : click on "password" text field and enter valid password
		driver.findElement(By.id("Password")).sendKeys(passwordData);
		String passwordEntered = driver.findElement(By.id("Password")).getAttribute("value");
		if(passwordData.equals(passwordEntered))
			System.out.println("Password text field accepted valid password");
		else
			System.out.println("Password text field did not accept valid password");
		
		//Step 5 : Click on "Login" button
		driver.findElement(By.id("Login")).click();
		String actualHomePageTitle = driver.getTitle();
		if(actualHomePageTitle.equals(expectedHomePageTitle)) 
			System.out.println("Home page is displayed");
		else
			System.out.println("Home page is not displayed");
		
		//Step 6 : Click on "Logout" button
		driver.findElement(By.xpath("//button[@aria-label='Account settings']")).click();
		driver.findElement(By.xpath("//li[text()='Logout']")).click();
		actualWelcomePageTitle = driver.getTitle();
		if(actualWelcomePageTitle.equals(expectedWelcomePageTitle)) 
			System.out.println("Welcome page is displayed");
		else
			System.out.println("Welcome page is not displayed");		
	}

}
