package reading;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	/***
	 * This method is used to read data form Excel (testData.xlsx)
	 * @param sheetName pass the sheet info where you have your test data
	 * @param rowNum provide the row num where you have store your test data
	 * @param cellNum 
	 * @return
	 */
	public static String readStringData(String sheetName, int rowNum, int cellNum) {
		Workbook workbook = null ;
		try {
			workbook = WorkbookFactory.create(new FileInputStream(""));
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).toString();
	}
	
	public static void readData(String sheetName, int rowNum, int cellNum) throws  IOException {
		FileInputStream fis = new FileInputStream("");
		Workbook workbook = WorkbookFactory.create(fis);
	}
}
