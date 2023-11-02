package unitTesting;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExploreConfig {

	@Test
	public void createAccount() {
		Reporter.log("from create account",true);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("login to app",true);
	}
	
//	@BeforeSuite
//	public void beforeSuite() {
//		Reporter.log("from before suite",true);
//	}
	
	@BeforeClass
	public void beforeClass() {
		Reporter.log("browser setup",true);
	}
	
//	@BeforeTest
//	public void beforeTest() {
//		Reporter.log("from before test",true);
//	}
	
//	@AfterSuite
//	public void afterSuite() {
//		Reporter.log("from After suite",true);
//	}
	
//	@AfterTest
//	public void AfterTest() {
//		Reporter.log("from After test",true);
//	}
	
	@AfterClass
	public void afterClass() {
		Reporter.log("browser tear down",true);
	}
	
	@AfterMethod
	public void afterMethod() {
		Reporter.log("logout of app",true);
	}
	

	
	/*
	 * @Test public void modifyAccount() { Reporter.log("from modify account",true);
	 * }
	 */
}
