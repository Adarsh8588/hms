package GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.objectRepository.AdminHomePage;
import com.objectRepository.AdminLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
public DataBaseUtility dlib=new DataBaseUtility();
public ExcelUtility   elib=new ExcelUtility();
public JavaUtility    jlib= new JavaUtility();
public PropertyFileUtility plib=new PropertyFileUtility();
public WebDriverUtility wlib=new WebDriverUtility();
public WebDriver driver=null;
public static WebDriver sdriver=null;

@BeforeSuite(groups = {"smoke","regression"})
public void ConnectTODB(){
	System.out.println("--Connection to DataBase");
}


@BeforeClass(groups = {"smoke","regression"})
public void LaunchBrowser() throws Throwable {
	System.out.println("---LaunchBrowser----");
	String BROWSER=plib.readDataFromPropertyFile("browser");
	
	
		if(BROWSER.equalsIgnoreCase("chrome"));
		{
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();
			
		}
		 if(BROWSER.equalsIgnoreCase("firefox")){
			 WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else {
			driver=new InternetExplorerDriver();
		}
		 sdriver=driver;
		wlib.waitForPageLoad(driver);
		wlib.maximizeWindow(driver);
}
@BeforeMethod(groups = {"smoke","regression"})
public void login() throws Throwable {
	String URL=plib.readDataFromPropertyFile("url");
	String USERNAME=plib.readDataFromPropertyFile("username");
    String PASSWORD=plib.readDataFromPropertyFile("password");

       driver.get(URL);
       AdminLoginPage    lp=new AdminLoginPage(driver);
       lp.AdminLoginPage(USERNAME,PASSWORD );
}
@AfterMethod(groups = {"smoke","regression"})
public void logout() {
 AdminHomePage hp=new AdminHomePage(driver);
 hp.getAdminLogOutButton();

}

@AfterClass(groups = {"smoke","regression"})
public void closeDB() throws Throwable {
	dlib.closeDB();
	System.out.println("---database disconnect---");
}
}