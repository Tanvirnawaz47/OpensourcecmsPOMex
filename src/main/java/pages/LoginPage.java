package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {
	
WebDriver driver;

public LoginPage() {
	this.driver=driver;
}
@FindBy(how=How.ID, using= "user_login") 
WebElement Username_Field;

@FindBy(how=How.ID, using= "user_pass") 
WebElement Password_Field;

@FindBy(how=How.ID, using= "wp-submit") 
WebElement Submit_Field;

@FindBy(how=How.XPATH, using= "//h1[text()='Dashboard']")
WebElement Dashboard_Field;

public void login(String UserName, String Password) {
	
	Username_Field.sendKeys(UserName);
	Password_Field.sendKeys(Password);
	Submit_Field.click();
}
//public void waitForDashboardTitle() {
	//waitForElement(Dashboard_Field,driver);
//}
public boolean isDashBoardTitleSeen () {
//	waitForDashboardTitle();
	Dashboard_Field.isDisplayed();
	return true;
}
}
