package seleniumbasic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectAndDeselect {
	@Test
	public void SelectAndDeselect() {
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
	
	//deselecting one by one also error in this program so it will not deselect 
//	S.deselectByIndex(0);
	//S.deselectByValue("199");
  //  S.deselectByVisibleText("INR 50 - INR 99 ( 1 )");
	System.out.println(S.isMultiple());
	if (S.isMultiple()) {
		S.deselectAll();
	}
	List<WebElement> op = S.getAllSelectedOptions();
	
	for(WebElement allOption:op) 
	{
		System.out.println(allOption.getText());
	}
    driver.close();
	}

}
