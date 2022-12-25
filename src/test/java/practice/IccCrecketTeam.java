package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class IccCrecketTeam {
	@Test
	

	public void iccCrecket() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		 List<WebElement> teams = driver.findElements(By.xpath("//tbody/tr//td[2]//span[2]"));
		 List<WebElement> points = driver.findElements(By.xpath("//tbody/tr//td[4]"));
	     List<WebElement> matches = driver.findElements(By.xpath("//tbody/tr//td[3]"));
	    
	    for(int i=0; i<teams.size(); i++) {
	    	System.out.println(teams.get(i).getText()+" = "+points.get(i).getText());
	    }
	}
}
