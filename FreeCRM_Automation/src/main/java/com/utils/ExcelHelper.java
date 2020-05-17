package com.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import io.github.millij.poi.SpreadsheetReadException;
import io.github.millij.poi.ss.reader.XlsReader;

public class ExcelHelper {
	
	public static String filePath = System.getProperty("user.dir") + "/resources/test-data/newTask_data.xlsx";
	static Workbook book;
	static Sheet sheet;
	
	public static Object[][] getTaskData(String sheetName){
		
		FileInputStream file = null;
		try {
			file = new FileInputStream(filePath);
			book = WorkbookFactory.create(file);
			sheet = book.getSheet(sheetName);
		}catch(Exception e) {
			e.printStackTrace();
		}
			
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		System.out.println("last row num " + sheet.getLastRowNum());
		System.out.println("last cell num :" + sheet.getRow(0).getLastCellNum());
		for(int i = 0; i<sheet.getLastRowNum(); i++) {
			for(int j = 0; j<sheet.getRow(0).getLastCellNum(); j++) {
				data[i][j] = sheet.getRow(i+1).getCell(j).toString();
			}
		}
			
		return data;
	}
	
	public static List readFile() {
		List<TaskBO> taskList = null;
		 final File xlsxFile = new File(filePath);
		    final XlsReader reader = new XlsReader();
		    try {
				 taskList = reader.read(TaskBO.class, xlsxFile);
			} catch (SpreadsheetReadException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		    return taskList;
	}
	
	public static void main(String[] args) {
		List list = readFile();
		
		for ( int i=0; i < list.size(); i++) {
			TaskBO taskBO= (TaskBO) list.get(i);
			
			System.out.println(taskBO.title);
		}
	}

}
