package SeleniumTutorialExcelReadingAndWriting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRough {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("F:\\Selenium Learning from Naveen\\TestData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		XSSFRow row=sheet.getRow(1);
		XSSFCell cell=row.getCell(1);
		int index=workbook.getSheetIndex("Employees");
		int colNum=-1;
		
		sheet=workbook.getSheetAt(index);
		System.out.println("Last Row number : "+sheet.getLastRowNum());
		System.out.println("Cell Number  :"+row.getLastCellNum());
//		for(int i=0;i<row.getLastCellNum();i++) {
//			//System.out.println(row.getCell(i).getStringCellValue().trim());
//			if(row.getCell(i).getStringCellValue().trim().equals("Salary"))
//				colNum=i;
//			System.out.println(colNum);
//		}
		
		System.out.println(cell.getCellType());
		
	}

}
