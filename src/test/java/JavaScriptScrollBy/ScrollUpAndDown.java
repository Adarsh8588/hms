package JavaScriptScrollBy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollUpAndDown{
	@Test
	public void scroll() throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
		
		  //in implicit wait controler will to search the locator in the web page it work for only find element and findElements method
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//JavascriptException js=(JavascriptException) driver;
		 JavascriptExecutor js=(JavascriptExecutor) driver;
	       js.executeScript("window.scrollBy(0,5000)");
	       Thread.sleep(3000);
	       js.executeScript("window.scrollBy(0,-5000)");
	       Thread.sleep(3000);

	       driver.close();
	}
}