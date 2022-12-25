package seleniumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class clearAndSubmitMethod {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.clear();
        Thread.sleep(3000);
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.clear();
        Thread.sleep(3000);
        WebElement submit = driver.findElement(By.xpath("//button[@type='submit'][1]"));
        submit.clear();
    
	}

}
