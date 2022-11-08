package practice;


import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataFromPropertyFileTest {

	public static void main(String[] args) throws Throwable {
		
//create object for source file
	
	//*	filein
		// create obj for proprerty file
		Properties pobj=new Properties();
	//	pobj.load(fis);
	//	 read the value using getProperty("key")
		String BROWSER=pobj.getProperty("browser");
		String URL =pobj.getProperty("url");
		String USERNAME=pobj.getProperty("username");
		String PASSWORD=pobj.getProperty("password"); 
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
			WebDriverManager.chromedriver().setup();
  // WebDriver driver=new ChromeDriver();*/
	
		
		
	}

}
