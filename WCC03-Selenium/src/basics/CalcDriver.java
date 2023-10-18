package basics;

public class CalcDriver {

	public static void main(String[] args) {
		Calculator c = new Calculator();

		c.add(10, 20);
		c.add(10, 20, 30, 40);
		c.add(12, 23, 34, 45, 56, 67, 78.5);

		c.sub(10, 20);
		// c.sub(12,23,30);
	}

	/*
	 * public static void main(String[] args) throws InterruptedException {
	 * System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 * ChromeDriver driver = new ChromeDriver();
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 * JavascriptExecutor js = driver;
	 * driver.get("https://www.kalkifashion.com/in/ethnic/georgette-lehenga.html");
	 * Thread.sleep(2000); js.executeScript("window.scrollBy(0,240);");
	 * Thread.sleep(2000); WebElement addToBag =
	 * driver.findElement(By.linkText("SHOP NOW"));
	 * 
	 * js.executeScript("arguments[0].click()", addToBag); // Thread.sleep(3000); //
	 * driver.quit();
	 * 
	 * }
	 */

}
