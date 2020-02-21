package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
 static WebDriver driver;
 
 
 public static WebDriver startBrowser () {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\tanvi\\eclipse-workspace\\PageObjectModel\\pom2\\src\\driver\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
	 return driver;
 }
 
	
}
