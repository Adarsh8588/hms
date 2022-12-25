package seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigateAPi {

	public static void main(String[] args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
         driver.navigate().refresh();
         Thread.sleep(4000);
         System.out.println("the title of the page is "+  driver.getTitle());
		Thread.sleep(3000);
		System.out.println("the url of the page is "+  driver.getCurrentUrl());
    	driver.close();
	}

}
