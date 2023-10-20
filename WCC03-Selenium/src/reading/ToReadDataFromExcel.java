package reading;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ToReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		//Create IS object
		FileInputStream fis = new FileInputStream("./testData/testData.xlsx");
		
		//Create respective file object
//		XSSFWorkbook ref = new XSSFWorkbook(fis);
//		HSSFWorkbook reff = new HSSFWorkbook(fis);	
		Workbook ref = WorkbookFactory.create(fis);
		
		//read methods
		double number = ref.getSheet("Sheet1").getRow(0).getCell(0).getNumericCellValue();
		String name = ref.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		boolean flag = ref.getSheet("Sheet1").getRow(2).getCell(0).getBooleanCellValue();
		LocalDateTime date = ref.getSheet("Sheet1").getRow(3).getCell(0).getLocalDateTimeCellValue();
		double decimal = ref.getSheet("Sheet1").getRow(4).getCell(0).getNumericCellValue();
		
		System.out.println(number);
		System.out.println(name);
		System.out.println(flag);
		System.out.println(date);
		System.out.println(decimal);
		
//		Sheet sheet = ref.getSheet("Sheet2");
//		Row row = sheet.getRow(0);
//		Cell cell = row.getCell(0);
//		cell.toString();

		System.out.println(ref.getSheet("Sheet4").getRow(123).getCell(9).toString());
		
	}

}
