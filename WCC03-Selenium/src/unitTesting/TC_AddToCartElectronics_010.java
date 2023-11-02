package unitTesting;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_AddToCartElectronics_010 extends BaseClass {

	@Test
	public void addElectronicsProductIntoCart() {
		driver.findElement(By.partialLinkText("ELECTRONICS")).click();
	}
}
