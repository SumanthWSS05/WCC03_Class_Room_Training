package reading;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Writing {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("E:\\WSS05-Selenium\\Full.txt",true);
		
		fw.write("How are you");
		fw.flush();
		
		FileReader fr = new FileReader("E:\\\\WSS05-Selenium\\\\Full.txt");
		
		
		
	}

}
