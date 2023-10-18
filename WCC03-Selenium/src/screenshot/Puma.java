//package screenshot;
//
//import java.io.File;
//import java.io.IOException;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.io.FileHandler;
//
//public class Puma {
//
//	public static void main(String[] args) throws InterruptedException, IOException {
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//
//		driver.get("https://in.puma.com/");
//		Thread.sleep(2000);
//		File temp = driver.getScreenshotAs(OutputType.FILE);
//
//		System.out.println(temp);
//		File dest = new File("./errorshots/puma.jpeg");
//		FileHandler.copy(temp, dest);
//	}
//
//}
