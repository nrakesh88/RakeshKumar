package wrappers;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataInputProvider {
	
	
	public static String[][] readExcel() throws InvalidFormatException, IOException{
		
		
		
		File src = new File("./data/login.xlsx");
		
		//Open the WorkBook
		XSSFWorkbook workbook = new XSSFWorkbook(src);
		
		//Go to Sheet
		XSSFSheet sheet = workbook.getSheet("Login");
		
		// Get the Row Count
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		// Get the Column Count
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(columnCount);
		
		String[][] data =  new String[rowCount][columnCount];		
		
		for (int i = 1; i <= rowCount; i++) {
			//Go to row
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				//go to Cell
				XSSFCell cell = row.getCell(j);
				//Get the Content
				String value = cell.getStringCellValue();
		//		System.out.println(value);
				data[i-1][j] = value;
				
			} 
		}
		System.out.println(data);
		return data;
	}

}


























