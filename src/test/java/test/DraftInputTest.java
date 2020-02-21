package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.DraftInputPage;
import pages.LoginPage;
import util.BrowserFactory;

public class DraftInputTest {
	WebDriver driver;

	@Test
	public void UserShouldBeAbleToPostDraft() throws InterruptedException {
		driver= BrowserFactory.startBrowser();
		LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);
		loginPage.login("opensourcecms", "opensourcecms");
		Thread.sleep(2000);
		DraftInputPage draftInputPage= PageFactory.initElements(driver, DraftInputPage.class);
		draftInputPage.makeDraft("New Draft", "Save it");
		
		
	}
}
