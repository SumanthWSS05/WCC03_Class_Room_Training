package unitTesting;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript {  

	final int a = 100;
	
	@Test(priority = a)
	public void createAccount() {
		Reporter.log("from create account",true);
	}
	
	@Test(priority = -1000)
	public void modifyAccount() {
		Reporter.log("from modify account",true);
	}
	
	@Test(priority = -999)
	public void transferAccount() {
		Reporter.log("from transfer account",true);
	}
	
	@Test
	public void deleteAccount() {
		Reporter.log("from delete account",true);
	}
	
}
