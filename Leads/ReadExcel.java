package Leads;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.charts.XSSFScatterChartData;
import org.testng.annotations.Test;

public class ReadExcel {
	// @Test
// static for single memory reference
	public static String[][] readExcel(String sheetName) throws InvalidFormatException, IOException {
		File excel = new File("./data/Leads.xlsx");
		XSSFWorkbook wbook = new XSSFWorkbook(excel);
		XSSFSheet sheet= wbook.getSheet("Create");
		
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[rowCount][colCount];
		for (int i = 1; i <= rowCount ; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				System.out.println(cell.getStringCellValue());
				data[i-1][j] = cell.getStringCellValue();
			}
		}
		wbook.close();
		return data;
		 
		
		
		
	}
}