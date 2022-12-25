package TakeScreenSchot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenShot{
	@Test
	
	public void screenshot() throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//to take screen shot
		//step1: type casting
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		//step2: to store in ram access the method
		File ram = ts.getScreenshotAs(OutputType.FILE);
		//step3: specify the location
		File dest = new File("./photo./amazon.png");
		//step4: copy paste from ram to destination
		FileUtils.copyFile(ram, dest);
		driver.close();
		
	}
}