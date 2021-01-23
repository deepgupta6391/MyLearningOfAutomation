package practiceExcelReadingAndWriting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUsingHashTable {

	public static void main(String[] args) {
		String readFromSheet = "C:\\Users\\Deepshikha\\Desktop\\Test1.xlsx";

		FileInputStream ip;
		Workbook book;
		try {
			ip = new FileInputStream(readFromSheet);
			book = WorkbookFactory.create(ip);
			Sheet sheet = book.getSheet("ReadFile");

			Object data[][] = new Object[sheet.getLastRowNum()][1];

			Hashtable<String, String> table = null;

			for (int i = 0; i < sheet.getLastRowNum(); i++) {
				table = new Hashtable<String, String>();
				for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
					table.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i + 1).getCell(j).toString());
					data[i][0]=table;

				}
				System.out.println(table);
			}
			


		} catch (FileNotFoundException e) {
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
