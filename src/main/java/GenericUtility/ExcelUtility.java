package GenericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	/**
	 * It is used to read the data from ExcelFile
	 * @param SheetName
	 * @param RowNo
	 * @param columnNo
	 * @return
	 * @throws Throwable
	 */
	public String readDataFromExcelFile(String SheetName, int RowNo, int columnNo) throws Throwable
	{
		FileInputStream fi=new FileInputStream(IPathInterface.excelPath);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet(SheetName);
		Row row = sh.getRow(RowNo);
		Cell cel = row.getCell(columnNo);
		String value = cel.toString();
		wb.close();
		return value;
		
	}
	/**
	 * write data into excel file
	 * @param SheetName
	 * @param RowNo
	 * @param celNo
	 * @param Data
	 * @throws Throwable
	 */
	
	public void writeDataIntoExcel(String SheetName, int RowNo,int celNo, String Data) throws Throwable
	{
		FileInputStream fi=new FileInputStream(IPathInterface.excelPath);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet(SheetName);
		Row row = sh.getRow(RowNo);
		Cell ce = row.createCell(celNo);
		ce.setCellValue(Data);
		FileOutputStream fout=new FileOutputStream(IPathInterface.excelPath);
		wb.write(fout);
		wb.close();
		
		}
	/**
	 * This method is used to get Last row number
	 * @param SheetName
	 * @return
	 * @throws Throwable
	 */
	public int getLastRowNo(String SheetName) throws Throwable
	{
		FileInputStream fi=new FileInputStream(IPathInterface.excelPath);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet(SheetName);
		int lastrow = sh.getLastRowNum();
		return lastrow;
		
	}
	public void initialiseExcel(String excelpath) {
		// TODO Auto-generated method stub
		
	}
	public void saveDataaintoTheExcel(String filepath) {
		// TODO Auto-generated method stub
		
	
	}}

