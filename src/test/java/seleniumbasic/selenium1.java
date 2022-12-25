package seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		// it is used to launch the empty browser
		WebDriver driver =new ChromeDriver();
		//this method is used to get the url
		driver.get("https://www.amazon.in/");
        //this method is used to get the titel of the page
		System.out.println(driver.getTitle());
		//this method is used to get the currenturl
		System.out.println(driver.getCurrentUrl());
		// this method is used to c,lose the browser
		driver.close();
	}

}
