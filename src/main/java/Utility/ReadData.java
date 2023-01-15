package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.print.attribute.standard.SheetCollate;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {
	
	public static String readPrpertyFile(String value) throws Exception
	{
		Properties p = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Dipak\\eclipse-workspace\\Dip_Project\\Test Data\\config.properties");
		p.load(file);
		return p.getProperty(value);
	}
	public static String readExcelData(int row,int col) throws Exception
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Dipak\\eclipse-workspace\\Dip_Project\\Test Data\\Data swag lab.xlsx");
		Sheet excel = WorkbookFactory.create(file).getSheet("sheet1");
		String value = excel.getRow(row).getCell(col).getStringCellValue();
		return value;
	}
}
