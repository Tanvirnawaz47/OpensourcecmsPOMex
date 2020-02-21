package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import util.BrowserFactory;

public class DraftInputPage {
WebDriver driver;

public DraftInputPage(WebDriver driver) {
this.driver=driver;
	
}
//element library

@FindBy(how=How.ID, using= "title") 
WebElement title_Field;

@FindBy(how=How.ID, using= "content") 
WebElement content_Field;

@FindBy(how=How.ID, using= "save-post") 
WebElement submit_Field;

public void makeDraft(String Title, String Content) {
	
	title_Field.sendKeys(Title);
	content_Field.sendKeys(Content);
	submit_Field.click();
}

}
