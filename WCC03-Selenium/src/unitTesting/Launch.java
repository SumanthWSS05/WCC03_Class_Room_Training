package unitTesting;

import org.testng.annotations.Test;

public class Launch {   	//testNG class
	
	@Test
	public void run() {  	//test case
		int a = 10;
		int b = 23;			//test steps
		System.out.println(a);
		System.out.println(b);
	}
}
