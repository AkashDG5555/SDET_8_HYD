import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class practice {

	@Test
	public void readDataFromEcel() throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream("./PAVANSIR.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet("sheet1");
		int lastrow = s.getLastRowNum();
		for(int i=0;i<=lastrow;i++) {
			String cellvalue = s.getRow(i).getCell(2).getStringCellValue();
			if(cellvalue.equals("IT")) {
				
			
			System.out.println(s.getRow(i).getCell(0).getStringCellValue());
		}
		}
	
		
	}

}
