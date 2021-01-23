package SeleniumTutorialExcelReadingAndWriting;

public class ExcelTest {

	public static void main(String[] args) {
		ExcelUtil excel=new ExcelUtil("F:\\Selenium Learning from Naveen\\TestData.xlsx");
		System.out.println(excel.getRowCount("Employees"));
		System.out.println(excel.getCellData("Employees", "DOB", 2));
		System.out.println(excel.getCellData("Employees", 3, 3));
		excel.setCellData("Employees", "Salary", 4, "20000");
	}

}
