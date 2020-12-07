package readExcelFile;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PrintAllValueFromExcel {

	public static void main(String[] args) throws IOException {
				
		
   //open workbook		
    XSSFWorkbook wb = new XSSFWorkbook("./data/ReadData.xlsx"); 
			
   //Get sheet		
	XSSFSheet sheet = wb.getSheet("CCC");	
			
	//Get row count	
	int rowCount = sheet.getLastRowNum();	
	System.out.println(rowCount);	
	
	//Get column count
	int columnCount = sheet.getRow(0).getLastCellNum();
	System.out.println(columnCount);
	
	
    //open for loop for Rows
 	for (int i = 1; i <= rowCount; i++) {		
	XSSFRow row = sheet.getRow(i);
    
 	//open for loop for columns	
	for (int j = 0; j < columnCount; j++) {		
	XSSFCell cell = row.getCell(j);
		
	String Value = cell.getStringCellValue();
	System.out.println(Value);
	
	  }//end of columns for loop
	
	}//end of rows for loop
}
	
	
	
}


