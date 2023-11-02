package unitTesting;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 extends Explore {

	@Test
	public void demo() {
		Reporter.log("From demo3",true);
	}
}
