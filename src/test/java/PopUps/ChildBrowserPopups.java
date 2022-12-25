package PopUps;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBrowserPopups {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("tps://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//new tab
         //newwendow method will not support in this selenium 3.1.4 version it will support for old version
		//driver.switchTo().newwindow(WindowType.TAB);
		driver.get("https://demoapp.skillrary.com/");
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		//driver.close() will close the current open window
		//driver.close();
		// driver.quit will close all the windows
		driver.quit();
	}

}
