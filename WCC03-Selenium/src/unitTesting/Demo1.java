package unitTesting;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 extends Explore {

	@Test
	public void demo() {
		Reporter.log("From demo1",true);
	}
}
