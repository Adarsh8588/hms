package practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericUtility.ExcelUtility;
import GenericUtility.IPathInterface;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ScnarioFlipKart {
	@Test
	public void winterHeaterTest() throws Throwable
	{
		
	ExcelUtility excelutility=new ExcelUtility();
	try {
		//excelutility.initialiseExcel(IPathInterface.excelPath);
	} catch (Throwable e) {
		
		e.printStackTrace();
	}
	String sheetname="winterheater";
	String product = excelutility.readDataFromExcelFile(sheetname, 0, 0);
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys(product);
		driver.findElement(By.className("L0Z3Pu")).click();
		driver.findElement(By.xpath("//div[@class=\"_1TmfNK\"][1]")).click();
		Thread.sleep(2000);
		
	String actualtext = driver.findElement(By.xpath("//div[@data-id='ROHG9R5RWDHK9V2T']/descendant::a[@class='s1Q9rs']")).getAttribute("title");
	System.out.println(actualtext);
	Thread.sleep(2000);
	excelutility.writeDataIntoExcel(sheetname, 0, 0, actualtext);
	Thread.sleep(2000);
	;
	driver.findElement(By.xpath("//div[@data-id='ROHG9R5RWDHK9V2T']/descendant::a[@class='s1Q9rs']")).click();
	
		String parentWindow=driver.getWindowHandle();
		 Set<String> childWindow = driver.getWindowHandles();
		 
		 for(String id:childWindow)
		 {
			 if(!parentWindow.equals(id))
			 {
			
				 driver.switchTo().window(id);
			 }
		 }
		 driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		 String expectedProduct = driver.findElement(By.xpath("//div[@class='_2-uG6-']/child::a[@class='_2Kn22P gBNbID']")).getText();
		 Reporter.log(expectedProduct,true);
		 excelutility.writeDataIntoExcel(sheetname, 0, 0, actualtext);
		// excelutility.saveDataaintoTheExcel(IPathInterface.filePath);
		 Thread.sleep(2000);
		 
			
		 
 Assert.assertEquals(expectedProduct, actualtext);	
 excelutility.writeDataIntoExcel(sheetname, 0, 0, "pass");
// excelutility.saveDataaintoTheExcel(IPathInterface.filePath);
 Thread.sleep(2000);
	
 
	 Reporter.log("test case passed",true);
driver.quit();
	}
}
