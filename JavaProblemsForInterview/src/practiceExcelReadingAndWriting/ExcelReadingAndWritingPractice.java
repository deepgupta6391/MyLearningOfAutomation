package practiceExcelReadingAndWriting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadingAndWritingPractice {

	public static void main(String[] args) {

		String readFromSheet = "C:\\Users\\Deepshikha\\Desktop\\Test1.xlsx";
		String readFile = "ReadFile";
		FileInputStream fisRead;
		Workbook bookRead;
		Sheet sheetRead;

		FileInputStream fisWrite;
		String writeToSheet = "C:\\Users\\Deepshikha\\Desktop\\Test2.xlsx";
		String writeFile = "WriteFile";
		Workbook bookWrite;
		Sheet sheetWrite;
		String dataValue;

		try {
			// Reading
			fisRead = new FileInputStream(readFromSheet);
			bookRead = WorkbookFactory.create(fisRead);
			sheetRead = bookRead.getSheet(readFile);

			// Writing****************
			fisWrite = new FileInputStream(writeToSheet);
			bookWrite = new XSSFWorkbook(fisWrite);
			sheetWrite = bookWrite.createSheet(writeFile);

			Object[][] data = new Object[sheetRead.getLastRowNum() + 1][sheetRead.getRow(0).getLastCellNum()];

			for (int i = 0; i < sheetRead.getLastRowNum() + 1; i++) {

				Row row = sheetWrite.createRow(i);

				for (int j = 0; j < sheetRead.getRow(0).getLastCellNum(); j++) {

					Cell cell = row.createCell(j);

					if (sheetRead.getRow(i).getCell(j) == null) {
						cell.setCellValue("NA");
					} else {
						dataValue = sheetRead.getRow(i).getCell(j).toString();
						data[i][j] = dataValue;
						cell.setCellValue(dataValue);
						System.out.println(data[i][j]);
					}
				}
			}

			FileOutputStream fos = new FileOutputStream(writeToSheet);
			bookWrite.write(fos);
			fos.close();

		} catch (

		FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
