package seleniumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectAndDeselect1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demoapp.skillrary.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='cars']"));
		Select S=new Select(dropdown);
		S.selectByIndex(0);
		S.selectByValue("199");
		S.selectByVisibleText("INR 50 - INR 99 ( 1 ) ");


	}

}
