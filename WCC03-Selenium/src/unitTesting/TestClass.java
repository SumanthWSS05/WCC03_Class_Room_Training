package unitTesting;

import org.testng.annotations.Test;

public class TestClass {    //testNG class

	@Test
	public void launch() {  
		System.out.println("from lauch");
	}
	
	@Test
	public void create() {   //test case
		
		int a = (10>20) ? 10 : 20 ;   // test steps
		System.out.println("from create");
	}
}
