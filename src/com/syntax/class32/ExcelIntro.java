package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntro {

	public static void main(String[] args) throws IOException {
		
		String filePath = "/Users/agamselbi/Desktop/Test.xlsx";

		FileInputStream fis = new FileInputStream(filePath);
		//accesing workbook
		Workbook wbook=new XSSFWorkbook(fis);
		//accesing sheet
		Sheet sheet=wbook.getSheet("Sheet1");
		//accesing row
		Row row1=sheet.getRow(0);
		//accesing cell
		Cell cell=row1.getCell(1);
		//get value from cell
		String r1cell2=cell.toString();
		System.out.println(r1cell2);
		
		//how to get New York
		String r2cell2=sheet.getRow(2).getCell(2).toString();
		System.out.println(r2cell2);
		
		//how to access virginia
		String r1cell3=sheet.getRow(1).getCell(3).toString();
		
		System.out.println(r1cell3);
		
		//how to access zip
		double cellv=sheet.getRow(1).getCell(4).getNumericCellValue();
		System.out.println((int)cellv);
		
		String cell4=sheet.getRow(1).getCell(4).toString();
		System.out.println(cell4);//20151.0
		//to get rid of .0
		String[]arr=cell4.split("\\.");
		System.out.println(arr[0]);//20151
	
		

	}

}
