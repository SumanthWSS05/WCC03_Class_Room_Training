package reading;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class ToWriteDataToAFile {

	public static void main(String[] args) throws IOException {		
		
		FileOutputStream fos = new FileOutputStream("E:\\WSS05-Selenium\\SS.txt");
		
		fos.write('S');
		fos.write('U');
		fos.write('M');
		fos.write('A');
		fos.write('N');
		fos.write('T');
		fos.write('H');
		
		fos.write('$');
		
		System.out.println("Written successfully");
		
//		FileWriter fw = new FileWriter("E:\\WSS05-Selenium\\SS.txt",true);
//		fw.write(" We are appending the data into the existing file");
//		fw.flush();
		
	}

}
