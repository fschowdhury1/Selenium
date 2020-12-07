package utils2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

   public class PrintAllValueFromExcel {

	//public static void main(String[] args) throws IOException {
	
	 public String[][] readExcel() throws IOException {

		
   //open workbook		
    XSSFWorkbook wb = new XSSFWorkbook("./data/ReadData.xlsx"); 
			
   //Get sheet		
	//XSSFSheet sheet = wb.getSheet("CCC");
      XSSFSheet sheet = wb.getSheetAt(0);
			
	//Get row count	
	int rowCount = sheet.getLastRowNum();	
	System.out.println(rowCount);	
	
	//Get column count
	int columnCount = sheet.getRow(0).getLastCellNum();
	System.out.println(columnCount);
	
	 // String[][] data = new String[2][3];
	    String[][] data = new String[rowCount][columnCount];
	
	
	
    //open for loop for Rows
 	for (int i = 1; i <= rowCount; i++) {		
	XSSFRow row = sheet.getRow(i);
    
 	//open for loop for columns	
	for (int j = 0; j < columnCount; j++) {		
	XSSFCell cell = row.getCell(j);
		
	String Value = cell.getStringCellValue();
	System.out.println(Value);
	
	 data[0][0]= "TCS";
     data[i-1][j]=Value;
	
	
	
	  }//end of columns for loop
	
	}//end of rows for loop

	 return data;
	
}	
}


