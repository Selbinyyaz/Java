package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelDemo {

	public static void main(String[] args) throws IOException {
		//specify/load path to file
		String filePath = System.getProperty("user.dir") + "/extra/Excel.xlsx ";
        //create object of FileInputStream
		FileInputStream fileIS = new FileInputStream(filePath);
		
		//get whole file
		Workbook book=new XSSFWorkbook(fileIS);
		
		//get the sheet from the file(by name or index)
		Sheet sheet=book.getSheet("Excel");
		
		//get the number of rows in the current sheet the last 


	}

}
