package SeleniumTutorialExcelReadingAndWriting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Calendar;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Rough {

	public static void main(String[] args) {
		FileInputStream fis;
		Workbook workbook = null;
		try {
			fis = new FileInputStream("F:\\Selenium Learning from Naveen\\TestData.xlsx");
			workbook = new XSSFWorkbook(fis);
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Sheet sheet = workbook.getSheet("Employees");
		int rows = sheet.getLastRowNum() + 1;
		System.out.println("Last row num " + rows);

		Row row0 = sheet.getRow(0);
		short cells = row0.getLastCellNum();
		System.out.println("Last colum num " + cells);
		int col_Num = -1;

		for (int i = 0; i < row0.getLastCellNum(); i++) {
			if (row0.getCell(i).getStringCellValue().trim().equals("DOB"))
				col_Num = i;
		}
		System.out.println(sheet.getRow(1).getCell(col_Num).getStringCellValue());
		System.out.println(col_Num);

		System.out.println(sheet.getRow(1).getCell(col_Num+1).getBooleanCellValue());
		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
		
	}

}
