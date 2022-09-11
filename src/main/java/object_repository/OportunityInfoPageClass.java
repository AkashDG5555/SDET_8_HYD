package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OportunityInfoPageClass {

	@FindBy(className = "dvHeaderText")
	private WebElement Oport_Txt_Verify;
	
	@FindBy(id = "mouseArea_Opportunity Name")
	private WebElement oportInfoBox;

	public OportunityInfoPageClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	
}

	public WebElement getOport_Txt_Verify() {
		return Oport_Txt_Verify;
	}

	public WebElement getOportInfoBox() {
		return oportInfoBox;
	}
	
	public void setOportInfoVerification() {
		String InfoNametext = Oport_Txt_Verify.getText();
		String orgBoxName = oportInfoBox.getText();
		if(InfoNametext.contains(orgBoxName))
		{
			System.out.println("Verification SuccessFull");
			
		}
	
}
}
