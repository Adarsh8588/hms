package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {
	@Test
public void MakeMyTrip() throws InterruptedException, EncryptedDocumentException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);

		Actions act = new Actions(driver);
		act.moveByOffset(10, 20).click().perform();

		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'From')]")).click();
		Thread.sleep(3000);

		FileInputStream fis = new FileInputStream(".//src/test/resources/notes.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		Sheet sheet = wb.getSheet("Sheet2");
		String data = new DataFormatter().formatCellValue(sheet.getRow(0).getCell(0));

		driver.findElement(By.xpath("//input[@type='text' and @placeholder='From']")).sendKeys(data);

	}

}
