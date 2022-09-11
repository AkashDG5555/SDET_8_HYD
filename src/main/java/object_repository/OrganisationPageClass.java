package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationPageClass {

	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement Create_org_btn;

	public OrganisationPageClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getCreate_org_btn() {
		return Create_org_btn;
	}
	
	public void CreateNewOrg() {
		Create_org_btn.click();
	}
}
