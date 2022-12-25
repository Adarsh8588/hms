package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//error
public class HiddenDevisionOrCalanderPopup {
	@Test
	public void calander() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//i[contains(@class,'wewidgeticon we_close')]")).click();
		driver.findElement(By.xpath("//p[.='Friday']")).click();
		WebElement ele = driver.findElement(By.xpath("(//div[@class='dateInnerCell'])[15]"));
		System.out.println(ele.getText());
		ele.click();
	}

}
