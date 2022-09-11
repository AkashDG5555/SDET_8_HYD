package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OportunityPageClass {

	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement CreatNewOprBtn;

	public OportunityPageClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreatNewOprBtn() {
		return CreatNewOprBtn;
	}
	
	public void CreateNewOprtunity() {
		CreatNewOprBtn.click();
	}
}
