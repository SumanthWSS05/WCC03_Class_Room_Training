package trolleys;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Simple {

	@Test(dependsOnGroups = "smoke")
	public void launch() {
		Reporter.log("from simple launch");
	}
}
