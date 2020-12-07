package readExcelFile;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

public static void main(String[] args) throws IOException {
		
   //open workbook		
    XSSFWorkbook wb = new XSSFWorkbook("./data/ReadData.xlsx"); 
	
		
   //Get sheet		
    XSSFSheet sheet = wb.getSheet("CCC");
    
 	//Get Row	
	XSSFRow row = sheet.getRow(2);
	
	//Get column		
	XSSFCell cell = row.getCell(1);
	
	
	//Action Read Value
	String Value = cell.getStringCellValue();
	System.out.println(Value);

		
	

	}

}
