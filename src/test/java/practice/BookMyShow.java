package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookMyShow {
		
		public static void main(String[] args) throws Throwable {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.get("https://in.bookmyshow.com/explore/home/bengaluru");
			//driver.findElement(By.xpath("//a[.='Movies']/parent::div[@class='sc-kjoXOD jWrtnU']")).click();
			driver.findElement(By.xpath("//span[@id='4']")).click();
			driver.findElement(By.xpath("//input[@placeholder='Search for Movies, Events, Plays, Sports and Activities']")).sendKeys("kantara tulu");
		    driver.findElement(By.xpath("//span[.='Kantara (Tulu)']")).click();
			driver.findElement(By.xpath("(//div[@class='styles__CtaText-sc-1vmod7e-2 bBLrVT']//span[@style='font-weight: 500; font-size: 16px; color: rgb(255, 255, 255);'])[1]")).click();
			driver.findElement(By.xpath("(//div[@class='date-numeric']/parent::a[@class='date-href'])[1]")).click();
			List<WebElement> place = driver.findElements(By.xpath("//div[@class='__title']/a"));
		    List<WebElement> time = driver.findElements(By.xpath("//div[@class='__details']//div"));
		   FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\notes.xlsx");
		   Workbook wb=WorkbookFactory.create(fis);
			org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheet("sheet1");
			for(int i=1; i<=place.size(); i++)
			{
				Row row = sheet.createRow(i);
				row.createCell(0).setCellValue(place.get(i-1).getText());
				row.createCell(1).setCellValue(time.get(i-1).getText());
				FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\notes.xlsx");
				wb.write(fos);
			}
		}
}
