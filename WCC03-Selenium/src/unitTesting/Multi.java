package unitTesting;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Multi {

	@Test
	public void run() {
		Reporter.log("from run method",true);
	}
	
	@Test
	public void running() {
		Reporter.log("from running method",true);
	}
	
	@Test
	public void finish() {
		Reporter.log("from finish method",true);
	}
	
	@Test  //  -> core annotation
	public void down() {
		Reporter.log("Hi welcome",true);
	}
}
