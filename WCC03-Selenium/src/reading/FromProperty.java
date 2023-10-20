package reading;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FromProperty {

	public static void main(String[] args) throws IOException {
		//Step 1 : create IS
		FileInputStream fis = new FileInputStream("./testData/sample.properties");
		
		//Step 2 : create respective file object
		Properties pro = new Properties();
		
		//Step 3 : read methods
		pro.load(fis);
		System.out.println(pro.getProperty("mobile"));
		System.out.println(pro.getProperty("laptop"));
		System.out.println(pro.getProperty("os"));
	}

}
