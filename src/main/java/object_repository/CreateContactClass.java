package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactClass {

	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createCont;

	public CreateContactClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateCont() {
		return createCont;
	}
	
	public WebElement CreateContactBtn() {
		return createCont;
	}
	
	public void creatContactButton(){
		createCont.click();
	}
}
