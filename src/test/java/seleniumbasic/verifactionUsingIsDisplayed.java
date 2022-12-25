package seleniumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verifactionUsingIsDisplayed {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		if (search.isDisplayed())
		{
			System.out.println("pass");
		} 
		else
		{
           System.out.println("fail");
		}
 driver.close();

	}

}
