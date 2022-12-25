package seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowsOperation {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		//no minimize method
		//driver.manage().window().minimize()
        driver.close();
	}

}
