package unitTesting_dataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OpenAppExcel {
	
	@DataProvider(parallel = true)
	public String[] urlData() throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./testData/testData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet urlSheet = workbook.getSheet("URL");
		int rowNum = urlSheet.getPhysicalNumberOfRows();
		String[] url = new String[rowNum]; 
		
		for(int i=0; i<rowNum; i++) {
			url[i] = urlSheet.getRow(i).getCell(0).toString();
		}
		return url;
	}

	@Test(dataProvider = "urlData")
	public void launch(String url) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get(url);
		driver.quit();
	}
}
