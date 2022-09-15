package GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
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
	
	public int readDataFromExcel(String path ,String sheetName) throws Throwable
	{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet(sheetName);
		return s.getLastRowNum();
	}

}
