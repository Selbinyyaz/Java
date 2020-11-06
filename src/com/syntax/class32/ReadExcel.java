package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
//		String filePath = "/Users/agamselbi/Desktop/Test.xlsx";
		
		String filePath=System.getProperty("user.dir")+"/testdata/Book3.xlsx";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		//to get an object of workbook type
		Workbook book = new XSSFWorkbook(fis);

		// accessing Sheet
		Sheet sheet = book.getSheet("Sheet1");

		// need to find numbers of rows
		int rows = sheet.getPhysicalNumberOfRows();
		System.out.println(rows);

		// need to find of columns
		int cols = sheet.getRow(0).getLastCellNum();
		System.out.println(cols);

		// get data from all rows and all columns
//		for (int r = 0; r < rows; r++) {
//			for (int c = 0; c < cols; c++) {
//				String cellVal = sheet.getRow(r).getCell(c).toString();
//				System.out.print(cellVal + " ");
//			}
//		}
//
//		System.out.println();

	}

}
