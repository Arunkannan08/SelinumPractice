package com.utilites;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static String particularGetCellData(int rows, int columns) throws InvalidFormatException, IOException {
		File file = new File("C:\\Arunkumar\\SeleniumData\\TestData.xlsx");
		Workbook book = new XSSFWorkbook(file);
		Sheet sheet1 = book.getSheetAt(0);
		Row row = sheet1.getRow(rows);
		Cell cell = row.getCell(columns);

		// To read string value from cell
		/*
		 * String value1 = cell.getStringCellValue(); System.out.println(value1);
		 */

		// To read int value from cell
		/*
		 * double num = cell.getNumericCellValue(); System.out.println(num);
		 */
		
		//To Format the Cell 
		DataFormatter format = new DataFormatter();
		String formatValue = format.formatCellValue(cell);
		
		return formatValue;
		
		
	}
	
	private static void getAllDataFromXl() throws InvalidFormatException, IOException
	{
		File file = new File("C:\\Arunkumar\\SeleniumData\\TestData.xlsx");
		Workbook book = new XSSFWorkbook(file);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		
		//Find last row 
		int noOfRows = sheet.getLastRowNum();
		System.out.println("Number OF Rows :"+noOfRows);
		
		//Find no of columns 
		short noOfColums = sheet.getRow(0).getLastCellNum();
		System.out.println("Last Column Number : "+noOfColums);
		
		for(int i=0; i<noOfColums; i++)
		{
			Cell data =row.getCell(i);
			//Dataformat 
			DataFormatter format = new DataFormatter();
			format.formatCellValue(cell);
			System.out.println(data);
			
		}
		
			
	}
	private static void getBothRowColumn() throws InvalidFormatException, IOException
	{
		File file = new File("C:\\Arunkumar\\SeleniumData\\TestData.xlsx");
		Workbook book = new XSSFWorkbook(file);
		Sheet sheet = book.getSheet("Sheet1");
		//Row row = sheet.getRow(0);
		//Cell cell = row.getCell(0);
		
		//Find last row 
		int noOfRows = sheet.getLastRowNum();
		System.out.println("Number OF Rows :"+noOfRows);
		
		//Find no of columns 
		short noOfColums = sheet.getRow(0).getLastCellNum();
		System.out.println("Last Column Number : "+noOfColums);
		
		for (int i=0; i<=noOfRows; i++)
		{
			Row row = sheet.getRow(i);
			for(int j=0; j<noOfColums; j++)
			{
				Cell cell =row.getCell(j);
				//Dataformat 
				DataFormatter format = new DataFormatter();
				format.formatCellValue(cell);
				System.out.println(cell);
				
			}	
		}
		
		
	}
	public static void main(String[] args) throws InvalidFormatException, IOException {
		//getAllDataFromXl();
		getBothRowColumn();
	}

	

}
