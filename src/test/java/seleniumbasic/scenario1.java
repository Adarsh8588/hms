package seleniumbasic;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scenario1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("adarsh854885@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Adarsh@1234");
        driver.findElement(By.xpath("//button[contains(.,'Log in')]")).click();
        String title = driver.getTitle();
        System.out.println(title);
        //to verify wheather it is going to home page or not we write if else condition
        if(title.equals("Facebook – log in or sign up\r\n"+ ""))
        {
			System.out.println("pass:home page is displayed");
        }
        else
			{
				System.out.println("fail:home page is not displayed");
			}
       String url = driver.getCurrentUrl();
       System.out.println(url);
       driver.close();
		}
	}


