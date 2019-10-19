package com.abc.www.homepage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.testng.annotations.Test;

public class Excelread {
	@SuppressWarnings("resource")
	@Test
	public void readData() throws IOException {
		// to find the excel
		String filepath="C:\\Users\\Sony\\java\\SeleniumDemo\\src\\test\\resources";
		String fileName="Registerdata.xlsx";
		File file=new File(filepath+"\\"+fileName);
		FileInputStream inp=new FileInputStream(file);
		Workbook wb=null;
		String extsn=fileName.substring(fileName.indexOf("."));
		if(extsn.equals(".xlsx")) {
			wb=new XSSFWorkbook(inp);
		}else if(extsn.equals(".xls")) {
			wb=new HSSFWorkbook(inp);
			
		}else 
		{
			throw new RuntimeException("not a valid file");
		}
// to count the rows of sheet
		Sheet sheet=wb.getSheet("Sheet1");
		int rowcount=sheet.getLastRowNum()-sheet.getFirstRowNum();
		for(int i=0;i<rowcount+1;i++)
		{
			Row row=sheet.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++)
			{
				Cell cell=row.getCell(j);
				int x=cell.getCellType();
				if(x==1) {
			
				System.out.println(cell.getStringCellValue());
			}else {
				System.out.println(cell.getNumericCellValue());
			}
		}
		
	
		}
	}
	
}












