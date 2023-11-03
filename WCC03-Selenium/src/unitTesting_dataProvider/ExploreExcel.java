package unitTesting_dataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExploreExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./testData/testData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet urlSheet = workbook.getSheet("URL");
		
		int countOfRowsWithData = urlSheet.getPhysicalNumberOfRows();
		
		int countOfCellsWithData = urlSheet.getRow(4).getPhysicalNumberOfCells();
		
		System.out.println(countOfRowsWithData);
		System.out.println(countOfCellsWithData);
	}
}
