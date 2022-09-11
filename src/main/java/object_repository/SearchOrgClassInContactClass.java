package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchOrgClassInContactClass {

	@FindBy(name="search_text")
	private WebElement Search_box;
	
	@FindBy(name="search")
	private WebElement Search_button;
	
	@FindBy(linkText = "ABCD")
	private WebElement orgName;

	public SearchOrgClassInContactClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSearch_box() {
		return Search_box;
	}

	public WebElement getSearch_button() {
		return Search_button;
	}

	public WebElement getOrgName() {
		return orgName;
	}
	
	public void selectOrgInSearch() {
		Search_box.sendKeys("abcbdb");
		Search_button.click();
		orgName.click();
		
	}
	
}
