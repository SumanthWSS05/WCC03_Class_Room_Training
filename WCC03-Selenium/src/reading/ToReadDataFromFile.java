package reading;

import java.io.FileInputStream;
import java.io.IOException;

public class ToReadDataFromFile {

	public static void main(String[] args) throws IOException {		
		
		FileInputStream fis = new FileInputStream("E:\\WSS05-Selenium\\Day 29.txt");
		int c = fis.read();
		
		while(c != -1) {
			System.out.print((char)c);		
			c = fis.read();
		}
	}

}
