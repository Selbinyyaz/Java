package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FromExcelToMap {

	public static void main(String[] args) throws IOException {
		String filePath = System.getProperty("user.dir") + "/testdata/AnotherTest.xlsx";

		FileInputStream fis = new FileInputStream(filePath);

		Workbook book = new XSSFWorkbook(fis);

		Sheet sheet = book.getSheet("Sheet1");

		int rows = sheet.getPhysicalNumberOfRows();// gives rows number
		int cols = sheet.getRow(0).getLastCellNum();// gives columns number

		List<Map<String, String>> listMap = new ArrayList<>();

		for (int r = 0; r < rows; r++) {
			Map<String, String> map = new LinkedHashMap<>();
			for (int c = 0; c < cols; c++) {
				String key=sheet.getRow(0).getCell(c).toString();
				String value=sheet.getRow(r).getCell(c).toString();
				map.put(key, value);

			}
			listMap.add(map);
			
		}
		System.out.println(listMap);
	}

}
