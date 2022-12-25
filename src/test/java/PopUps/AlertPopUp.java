package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class AlertPopUp{
	@Test
	public void alert() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement b = driver.findElement(By.xpath("//a[@id='course']"));
		Actions act = new Actions(driver);
         act.moveToElement(b).perform();
         driver.findElement(By.xpath("(//a[.='Selenium Training'])[2]")).click();
         driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
         Alert a = driver.switchTo().alert();
         System.out.println(a.getText());
       //  a.accept();
         a.dismiss();
	}
}