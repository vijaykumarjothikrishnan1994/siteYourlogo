package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Master_Data {
	
	public Master_Data(String string) throws IOException {
		// TODO Auto-generated constructor stub
		
		System.out.println("data");
		String filepath="C:\\Users\\Vijay Krishnan\\Desktop\\Software\\New Location\\YourLogo\\ConfigureData\\MasterDeatailSheet.xlsx";
		FileInputStream fileinput=new FileInputStream(filepath);
		XSSFWorkbook xwb=new XSSFWorkbook(filepath);
		XSSFSheet	sheet=xwb.getSheetAt(0);
		
		int last_row=sheet.getLastRowNum();
		
		for (int i = 0; i < last_row; i++) {
			
			XSSFRow rows= sheet.getRow(i);
			int last_cell=rows.getLastCellNum();
			
			for (int j = 0; j < last_cell; j++) {
				
				
				Cell cell=rows.getCell(j);
				
				System.out.println(cell.getStringCellValue());
			}
			
			System.out.println();
		}
		
	
		
		
		
	}
	
	
	
	
	
	
	
	
	public static void ExcelConfiguration() throws IOException {
		
	}
	
	
	
	
	
	

	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub

			
	}

}
