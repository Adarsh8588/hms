package practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class p2 {
	@Test
	 public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804944%7Cb%7Cfacebook%20%27%7C&placement=&creative=550525804944&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D1007768%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI6reT_cGF-wIVkh0rCh04aQK4EAAYASAAEgKfi_D_BwE");
	       Thread.sleep(5000);
	       //to fetch the element
		driver.findElement(By.name("firstname")).sendKeys("adar");
		  Thread.sleep(5000);
		  driver.findElement(By.name("lastname")).sendKeys("fsg");
		  Thread.sleep(4000);
		  driver.findElement(By.name("reg_email__")).sendKeys("12234567897");
		  Thread.sleep(2000);
		  driver.findElement(By.id("password_step_input")).sendKeys("asd@34s");
		  Thread.sleep(3000);
		  //to handel drop down we use select class
		 // Select s = new Select((WebElement) driver);
	  Select obj =new Select(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]")));
      obj.selectByValue("29");
	  Thread.sleep(2000);
		  Select obj2= new Select(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[2]")));
	  obj2.selectByValue("3");
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[2]"));
	  Thread.sleep(2000);
        Select obj3=new Select(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[3]")));	 obj3.selectByValue("1998");
		 //to handel radio button
         driver.findElement(By.className("_58mt")).click();
		  driver.findElement(By.name("websubmit")).click();
		  Thread.sleep(5000);
	//	   System.out.println(driver.getCurrentUrl());
		   driver.close();
         
		
	}

}
