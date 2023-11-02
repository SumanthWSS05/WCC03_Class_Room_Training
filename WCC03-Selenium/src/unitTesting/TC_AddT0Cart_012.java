package unitTesting;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_AddT0Cart_012 extends BaseClass {

	@Test
	public void addComputersToCart() {
		driver.findElement(By.partialLinkText("COMPUTERS")).click();
		driver.findElement(By.xpath("//a[contains(@title,'Desktops')]")).click();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	}
}
