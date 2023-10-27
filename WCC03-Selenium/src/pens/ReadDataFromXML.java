package pens;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ReadDataFromXML {

	@Parameters({"para1","para2","para3"})
	@Test
	public void read(String data1, String data2, String data3) {
		Reporter.log(data1,true);
		Reporter.log(data2,true);
		Reporter.log(data3,true);
	}
}
