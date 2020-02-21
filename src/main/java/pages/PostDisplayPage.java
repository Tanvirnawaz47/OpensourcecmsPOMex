package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PostDisplayPage {
WebDriver driver;
public PostDisplayPage() {
	this.driver=driver;
}
@FindBy(how=How.XPATH, using="//div[text()='Posts']") 
WebElement ClickPost_Field;

public void ClickAllPost() {
	ClickPost_Field.click();
}
}
