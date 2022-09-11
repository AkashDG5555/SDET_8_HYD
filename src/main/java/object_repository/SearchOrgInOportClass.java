package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchOrgInOportClass {

	@FindBy(name="search_text")
	private WebElement SearchBox;
	
	@FindBy(name="search")
	private WebElement SearchIcon;
	
	@FindBy(linkText = "ABCD")
	private WebElement SelectOrgName;

	public SearchOrgInOportClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSearchBox() {
		return SearchBox;
	}

	public WebElement getSearchIcon() {
		return SearchIcon;
	}

	public WebElement getSelectOrgName() {
		return SelectOrgName;
	}
	
	public void NewSearchTabfld() {
		SearchBox.sendKeys("ABCD");
		SearchIcon.click();
		SelectOrgName.click();
	}
}
