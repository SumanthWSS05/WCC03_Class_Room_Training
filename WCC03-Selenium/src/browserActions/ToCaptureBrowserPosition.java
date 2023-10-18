package browserActions;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureBrowserPosition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://polarbear.co.in/");
		
		Window window = driver.manage().window();	
		Point position = window.getPosition();
		System.out.println("===========Before Maximize===========");
		System.out.println("X position : " + position.getX());
		System.out.println("Y position : "+ position.getY());
		
		window.maximize();
		position = window.getPosition();
		System.out.println("===========After Maximize===========");
		System.out.println("X position : " + position.getX());
		System.out.println("Y position : "+ position.getY());
	}
}
