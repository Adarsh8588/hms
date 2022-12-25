package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

 public class DragAndDrop {
	@Test
 public void drag() throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    WebElement block1 = driver.findElement(By.xpath("//p[.='Block 1 data']"));
	    WebElement block2 = driver.findElement(By.xpath("//h1[.='Block 2']"));
	    Thread.sleep(3000);
	 Actions act = new Actions(driver);
	    Thread.sleep(3000);

	 act.dragAndDrop(block1, block2).perform();
	    Thread.sleep(3000);

	// driver.close();
	}

}
