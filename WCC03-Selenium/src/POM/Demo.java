package POM;

import org.openqa.selenium.WebDriver;

public class Demo {

	public static void main(String[] args) {
		
		WebDriver driver=null;
		
		Elements ref = new Elements(driver);
		ref.login.click();
		driver.navigate().refresh();
		
		ref.login.click();
		
		ref.login.click();
	}
}
