package unitTesting;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Hi i am from main method");
		Reporter.log("dlafskaklsf",true);
	}
	
	@Test 
	public static void testMethod() {
		Reporter.log("i am from test method",true);
	}
}
