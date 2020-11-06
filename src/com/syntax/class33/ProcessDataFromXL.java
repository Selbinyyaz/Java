package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ProcessDataFromXL {

	public static void main(String[] args) throws IOException {
		
		String filePath=System.getProperty("user.dir")+"/testdata/AnotherTest.xlsx";
		
		FileInputStream fileInput=new FileInputStream(filePath);
		

		Workbook book=new XSSFWorkbook(fileInput);
		
		Sheet sheet=book.getSheet("Sheet1");
		
		int rows=sheet.getPhysicalNumberOfRows();//number of rows -->3
		int cols=sheet.getRow(0).getLastCellNum();//number of column---> 10
		
		
		
	}

}
