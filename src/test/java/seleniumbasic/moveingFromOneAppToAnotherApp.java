package seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class moveingFromOneAppToAnotherApp {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
        driver.navigate().to("https://www.flipkart.com/");
        //it will go back to amazon appl
        driver.navigate().back();
        Thread.sleep(3000);
        //it will go to flipkark appl
        driver.navigate().forward();
        Thread.sleep(3000);
        //it will refresh the flipkart appli
        driver.navigate().refresh();
        driver.close();
	}

}
