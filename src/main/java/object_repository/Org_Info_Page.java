package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Org_Info_Page {

@FindBy(className="dvHeaderText")
private WebElement orgTxtVerify;

@FindBy(className="dvtCellInfo")
private WebElement orgInfoBox;

public Org_Info_Page(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getOrgTxtVerify() {
	return orgTxtVerify;
}

public WebElement getOrgInfoBox() {
	return orgInfoBox;
}

public void setOrgInfoVerification() {
	String InfoNametext = orgTxtVerify.getText();
	String orgBoxName = orgInfoBox.getText();
	if(InfoNametext.contains(orgBoxName))
	{
		System.out.println("Verification SuccessFull");
		
	}
}

}
