package fileutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {
	
	public String readExcelData(String name , int row, int column) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./data/shopperstack.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String value = wb.getSheet(name).getRow(row).getCell(column).getStringCellValue();
	return value;
	}
	
	
	public double readExcelDatanumeric(String name , int row, int column) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/shopperstack.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		double value = wb.getSheet(name).getRow(row).getCell(column).getNumericCellValue();
		return value;
		}
}
