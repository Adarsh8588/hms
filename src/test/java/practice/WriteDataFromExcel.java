package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WriteDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis =new FileInputStream(".\\src\\test\\resources\\Book1.xlsx");
		Workbook book =WorkbookFactory.create(fis);
		 Sheet sheet = book.getSheet("sheet1");
		Row row =sheet.createRow(1);
		Cell cell=row.createCell(1);
		cell.setCellValue("cfhff");
		FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\Book1.xlsx");
		book.write(fos);
		
	}

}
