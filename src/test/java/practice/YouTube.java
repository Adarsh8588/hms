package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YouTube {
	@Test
	public void youtube() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@id='search']")).sendKeys("googly");
	 driver.findElement(By.xpath("//input[@id='search']")).sendKeys(Keys.ENTER);
	 driver.findElement(By.xpath("//ancestor::div[@class='text-wrapper style-scope ytd-video-renderer']/descendant::a[@id='video-title']/child::yt-formatted-string[contains(.,'Thenmozhi - Official Video Song')]")).click();
}
}

