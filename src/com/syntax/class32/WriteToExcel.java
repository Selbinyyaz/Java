package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {

	public static void main(String[] args) throws IOException {
		
		String filePath=System.getProperty("user.dir")+"/testdata/AnotherTest.xlsx";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Workbook book=new XSSFWorkbook(fis);
		
		Sheet sheet=book.getSheet("Sheet1");
		
		sheet.getRow(0).createCell(10).setCellValue("Country");
		
		sheet.createRow(3).createCell(0).setCellValue("Hichem");
		
		book.createSheet("TestSheet");
		
		FileOutputStream fos=new FileOutputStream(filePath);
		
		book.write(fos);
		

	}

}
