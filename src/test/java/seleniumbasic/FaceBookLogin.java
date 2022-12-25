package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookLogin {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("adarsh");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("gfddgf");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
        driver.close();
	}

}
