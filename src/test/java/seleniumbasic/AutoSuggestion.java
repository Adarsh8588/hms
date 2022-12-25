package seleniumbasic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		ele.sendKeys("dres");
		List<WebElement> ele1 = driver.findElements(By.xpath("//span[contains(text(),'ses for women')]"));
	System.out.println(ele1.size());
	
	for(WebElement c:ele1) {
		System.out.println(c.getText());
	}
    driver.close();
	}

}
