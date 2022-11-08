package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathForIccCricket {
	@Test
	
	public void XpathForIccCricket() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.icc-cricket.com/rankings/mens/overview");
	
	// xpath for rankings
			driver.findElement(By.xpath("//nav[@class='main-navigation_desktop-list js-desktop-nav']//following-sibling::button[contains(text(),'Rankings') and @class='linked-list_dropdown-label js-dropdown-btn']")).click();
			// xpath for teams
			driver.get("https://www.icc-cricket.com/rankings/mens/overview");
			driver.findElement(By.xpath("//nav[@class='main-navigation__desktop-list js-desktop-nav']//a[contains(text(),'Teams')]")).click();
}
}