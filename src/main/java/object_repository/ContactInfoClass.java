package object_repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactInfoClass {

	@FindBy(className="dvHeaderText")
	private WebElement verify_txt;
	
	@FindBy(id = "mouseArea_Last Name")
	private WebElement lastName_info;
	
	
}
