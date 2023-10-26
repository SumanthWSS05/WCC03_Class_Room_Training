package unitTesting;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Account {

	@Test
	public void createAccount() {
		Reporter.log("from create account",true);
	}
	
	@Test(dependsOnMethods = {"createAccount","modifyAccount","transferAccount"})
	public void deleteAccount() {
		Reporter.log("from delete account",true);
	}
	
	@Test(dependsOnMethods = "createAccount")
	public void modifyAccount() {
		Reporter.log("from modify account",true);
	}
	
	@Test(dependsOnMethods = "createAccount")
	public void transferAccount() {
		Reporter.log("from transfer account",true);
	}
}
