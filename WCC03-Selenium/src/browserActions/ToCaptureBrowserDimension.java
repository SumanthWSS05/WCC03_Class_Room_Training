package browserActions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureBrowserDimension {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.cornerhouseicecreams.com/");
		
		Window window = driver.manage().window();
		Dimension sizeOfTheWindow = window.getSize();
		System.out.println("==========Before Maximize==========");
		System.out.println("Height is : " + sizeOfTheWindow.getHeight());
		System.out.println("Width is : " + sizeOfTheWindow.getWidth());
		
		window.maximize();
		System.out.println("==========After Maximize==========");
		Dimension size = window.getSize();
		System.out.println("Height is : " + size.getHeight());
		System.out.println("Width is : " + size.getWidth());
		
	}
}
