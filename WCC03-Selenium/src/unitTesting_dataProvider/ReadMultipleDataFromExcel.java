package unitTesting_dataProvider;

import java.io.FileInputStream;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("./testData/testData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet dataSheet = workbook.getSheet("Sheet3");
		int rowNum = dataSheet.getPhysicalNumberOfRows();
		int colNum = dataSheet.getRow(0).getPhysicalNumberOfCells();
		
		String[][] data = new String[6][5];
		
		for(int i=0; i<rowNum; i++) {
			for(int j=0; j<colNum ; j++) {
				data[i][j] = dataSheet.getRow(i).getCell(j).toString();
			}
		}
		
		for(String[] arr : data){
			for(String ar : arr) {
				System.out.print(ar+"     |       ");
			}
			System.out.println();
		}
	}

}
