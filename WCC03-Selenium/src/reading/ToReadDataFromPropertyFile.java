package reading;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ToReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		
		//Step 1 : create IS
		FileInputStream fis = new FileInputStream("./testData/testData.properties");
		
		//Step 2 : create file type object
		Properties prop = new Properties();
		
		//Step 3 : read methods
		prop.load(fis);
		
		String pw = prop.getProperty("password");
		System.out.println(prop.getProperty("subject"));
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("Exp"));
		String us = prop.getProperty("username");
		
		System.out.println(us);
		System.out.println(pw);
		
//		FileOutputStream fos = new FileOutputStream("./testData/testData.properties");
//		prop.setProperty("WCC03Batch", "Kalpana");
//		prop.store(fos, "new Student");
		
	}

}
