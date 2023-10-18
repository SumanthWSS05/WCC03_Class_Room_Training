package javaScriptExecutorMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandArguments {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement username = driver.findElement(By.id("Email"));
		WebElement password = driver.findElement(By.id("Password"));
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
		driver.executeScript("arguments[1].value='Sumanth',arguments[0].value='Sumanth',arguments[2].click()", username,password,loginButton);
		
//		WebElement[] list = new WebElement[3];
//		list[0] = username;
//		list[1] = password;
//		list[2] = loginButton;		
//		driver.executeScript("arguments[0].value='sumanthkeshav.scl@gmail.com',arguments[2].click(),arguments[1].value='nopassword'", list);
		
//		List ref = new ArrayList<>();
//		ref.add(username);
//		ref.add(password);
//		ref.add(loginButton);		
//		driver.executeScript("arguments[0].value='afsd'", ref.get(0));
	}

}
