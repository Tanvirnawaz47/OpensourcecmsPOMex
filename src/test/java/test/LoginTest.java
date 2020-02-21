package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.LoginPage;
import util.BrowserFactory;

public class LoginTest {
WebDriver driver;

@Test
public void UserShouldBeAbleToLOgin () {
	driver= BrowserFactory.startBrowser();
	LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);
	loginPage.login("opensourcecms", "opensourcecms");
	loginPage.isDashBoardTitleSeen();
}
	
}
