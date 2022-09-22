package MavenBatch42;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class sheetExcel {
	
	
	@Test
	public void excel() throws IOException
	{
		String path="F:\\javafirstbit\\MavenProject\\src\\main\\resources\\User.xlsx";
		
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		
		//XSSFRow row=sheet.getRow(1);
    	//XSSFCell cell=row.getCell(1);
		//System.out.println(cell);
		
    	for (Row row : sheet) {
    		for (Cell cell : row) {
    			
				System.out.print(cell+" ");
			}
			System.out.println(" ");
		}
		
		
	}

}

