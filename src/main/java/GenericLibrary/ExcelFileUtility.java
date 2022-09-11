package GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {

	public String readDataFromExcel(String sheetName, int rownum, int cellnum) throws Throwable {
		FileInputStream fis = new FileInputStream(IpathConstant.EXCELFILEPATH);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet(sheetName);
		Row r = s.getRow(rownum);
		Cell c = r.getCell(cellnum);
	String	value=c.getStringCellValue();
	return value;
		
	}

}
