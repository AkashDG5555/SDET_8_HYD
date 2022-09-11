package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLibrary.WebDiverUtility;

public class CreateNewOprtPageClass {

	@FindBy(name="potentialname")
	private WebElement OprtNameFd;
	
	@FindBy(id = "related_to_type")
	private WebElement assignedBox;
	

	@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
	private WebElement OrgSyb_Plus;
	
	@FindBy(xpath = "//input[@value='T']")
	private WebElement RadioBtn;
	
	@FindBy(name = "assigned_group_id")
	private WebElement Drpdown;
	
	@FindBy(id="jscal_trigger_closingdate")
	private WebElement DateBtn;
	
	@FindBy(name = "sales_stage")
	private WebElement Drpdown2;
	
	
	@FindBy(name = "button")
	private WebElement savebtn;


	public CreateNewOprtPageClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOprtNameFd() {
		return OprtNameFd;
	}

	public WebElement getOrgSyb_Plus() {
		return OrgSyb_Plus;
	}
	

	public WebElement getAssignBox() {
		return assignedBox;
	}
	public void getOprtFields() {
		OprtNameFd.sendKeys("testyantra");
		assignedBox.click();
		OrgSyb_Plus.click();
		
		
	}
	
	
	WebDiverUtility wUtil=new WebDiverUtility();
	
	
	public void AssignRadioBtn() {
		
		RadioBtn.click();
		Drpdown.click();
		wUtil.SelectingByValue(Drpdown, "2");
		wUtil.SelectingByValue(Drpdown2, "Needs Analysis");
		savebtn.click();
		
	}
	
public void AssignRadioBtn1() {
		
		RadioBtn.click();
		Drpdown.click();
		wUtil.SelectingByValue(Drpdown, "2");
		wUtil.SelectingByValue(Drpdown2, "Value Proposition");
		savebtn.click();
		
	}
	
	
	
	
	
	
}
