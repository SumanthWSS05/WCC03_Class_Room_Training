package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elements2 {

	public WebDriver driver;
	
	public Elements2(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement register() {
		 return driver.findElement(By.linkText("Register"));
	}

	public WebElement login() {
		return driver.findElement(By.linkText("Log in"));
	}
	
	public WebElement cart() {
		return driver.findElement(By.partialLinkText("Shopping cart"));
	}
	
	public WebElement whishlist() {
		return driver.findElement(By.linkText("Whishlist"));
	}
	
	public WebElement emailTextfield() {
		return driver.findElement(By.id("Email"));
	}
	
	public WebElement passwordTextfield() {
		return driver.findElement(By.id("Password"));
	}
	
	public WebElement loginButton() {
		return driver.findElement(By.xpath("//input[@value='Log in']"));
	}
}
