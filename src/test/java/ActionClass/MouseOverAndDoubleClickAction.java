package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverAndDoubleClickAction {
@Test
	public  void mouseAndDouble() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement b = driver.findElement(By.xpath("//a[@id='course']"));
		Actions act = new Actions(driver);
         act.moveToElement(b).perform();
         driver.findElement(By.xpath("(//a[.='Selenium Training'])[2]")).click();
        WebElement doubClick = driver.findElement(By.xpath("//button[@id='add']"));
         act.doubleClick(doubClick).perform();
         driver.close();
         
	}

}
