package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.DraftInputPage;
import pages.LoginPage;
import pages.PostDisplayPage;
import util.BrowserFactory;

public class PostDisplaytest {

	WebDriver driver;

	@Test
	public void UserShouldBeAbleToLOgin () throws InterruptedException {
		driver= BrowserFactory.startBrowser();
		LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);
		loginPage.login("opensourcecms", "opensourcecms");
		loginPage.isDashBoardTitleSeen();
		
		DraftInputPage draftInputPage= PageFactory.initElements(driver, DraftInputPage.class);
		draftInputPage.makeDraft("New Draft", "Save it");
		Thread.sleep(2000);
		PostDisplayPage postDisplayPage= PageFactory.initElements(driver, PostDisplayPage.class);
		postDisplayPage.ClickAllPost();
	}
}
