package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IccCricket {
	@Test
public void icccricket() throws Throwable {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.icc-cricket.com/rankings/mens/overview");
	 WebElement element = driver.findElement(By.xpath("//nav[@class='main-navigation_desktop-list js-desktop-nav']//following-sibling::button[contains(text(),'Rankings') and @class='linked-list_dropdown-label js-dropdown-btn']"));
	Actions act = new Actions(driver);
	act.moveToElement(element).perform();
	driver.findElement(By.xpath("//nav[@class='main-navigation__desktop-list js-desktop-nav']//a[contains(text(),'Player Rankings')]")).click();
	driver.close();
}
}
