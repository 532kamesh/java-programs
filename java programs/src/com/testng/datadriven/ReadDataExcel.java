package com.testng.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataExcel 
{
	public XSSFWorkbook wbook;
	public XSSFSheet sheet;
	public ReadDataExcel(String exepath) throws Exception
	{
		File f=new File(exepath);
		FileInputStream fis=new FileInputStream(f);
		wbook=new XSSFWorkbook(fis);
		
		
		
		
	}
	public String getData(int row, int col,int sheetnum)
	{
		sheet=wbook.getSheetAt(sheetnum);
		String data= sheet.getRow(row).getCell(col).getStringCellValue();
		return data;
	}
		
		
	public int getRowCount(int sheetIndex){
		int rows = wbook.getSheetAt(sheetIndex).getLastRowNum();
		rows = rows + 1;
		return rows;
		}
	

}
