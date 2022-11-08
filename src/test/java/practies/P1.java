package practies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class P1 {
	@Test
	 public  void p1() {
		//to setup the chrome driver
		WebDriverManager.chromedriver().setup();
		// to launch the chromebrowser
		WebDriver driver=new ChromeDriver();
	//to manage the web page
		driver.manage().window().maximize();
  //to get the title of web page
		driver.get("http://www6.githup.com/?template=ARROW_3&tdfs=0&s_token=1667063688.0396310000&uuid=1667063688.0396310000&term=Digital%20Asset%20Management%20Version%20Control&term=Source%20Code%20Escrow%20Service&term=Project%20Management%20Tools&term=Source%20Code%20Management%20Tools&searchbox=0&showDomain=0&backfill=0");
		// to capture all cookies from browser
	Set <Cookie> cookies=driver.manage().getCookies();
			// Set<org.openqa.selenium.Cookie> cookies=driver.manage().getCookies();
			 //to prient the total num(size) of cookies
			 System.out.println("the total  numb of cookies are " +  cookies.size());
              //read and print all the cookies
			 for(Cookie cookie:cookies) {
			 System.out.println(cookie.getName()+" "+cookie.getValue());
	}
			 // to delete the cookies
			 driver.manage().deleteAllCookies();
			 cookies=driver.manage().getCookies();
			 System.out.println("the total  numb of cookies are " +  cookies.size());

	}
}
