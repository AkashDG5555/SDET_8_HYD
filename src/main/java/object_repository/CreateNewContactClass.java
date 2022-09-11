package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContactClass {

	@FindBy(name="firstname")
	private WebElement FirstName_Fd;
	

	@FindBy(name="lastname")
	private WebElement LastName_Fd;
	
	@FindBy(name="button")
	private WebElement save_btn;

	@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
	private WebElement Plusbtn;

	public CreateNewContactClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName_Fd() {
		return FirstName_Fd;
	}

	public WebElement getLastName_Fd() {
		return LastName_Fd;
	}

	public WebElement getSave_btn() {
		return save_btn;
	}

	public WebElement getPlusbtn() {
		return Plusbtn;
	}
	
	
	public void CreateNewContactsFilds(String FirstName, String LastName) {
		FirstName_Fd.sendKeys(FirstName);
		LastName_Fd.sendKeys(LastName);
		Plusbtn.click();
			
	}
	public void SaveContactsPage() {
		save_btn.click();
	}
	
	}
	

