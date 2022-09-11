package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLibrary.WebDiverUtility;

public class Create_New_Organisation {
	WebDiverUtility wUtil=new WebDiverUtility();

	@FindBy(name="accountname")
	private WebElement OrgName_Fd;
	
	@FindBy(name="industry")
	private WebElement IndType;
	
	@FindBy(name="button")
	private WebElement SaveBtn;

	public Create_New_Organisation(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getOrgName_Fd() {
		return OrgName_Fd;
	}

	public WebElement getIndType() {
		return IndType;
	}

	public WebElement getSaveBtn() {
		return SaveBtn;
	}
	
	public void DetailsOfCreatePageInfo(String orgName,String IndType) {
		OrgName_Fd.sendKeys(orgName);
		wUtil.SelectingByVisible(getIndType(), IndType);
		SaveBtn.click();
		
	}
	public void DetailsOfCreatePageInfo1(String orgName) {
		OrgName_Fd.sendKeys(orgName);
		SaveBtn.click();
		
	
	
}
}
