package seleniumbasic;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownAction {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
     Select S=new Select(dropdown);
     S.selectByIndex(3);
     Thread.sleep(3000);
     S.selectByValue("search-alias=amazon-pharmacy");
     Thread.sleep(3000);
     S.selectByVisibleText("Appliances");
     
    List<WebElement> AllOptions = S.getOptions();
    System.out.println(AllOptions.size());
    for(WebElement c:AllOptions) {
    	System.out.println(c.getText());
    }
    
     driver.close();
            
	}

}