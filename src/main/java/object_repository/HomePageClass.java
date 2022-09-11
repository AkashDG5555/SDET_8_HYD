package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageClass {

	@FindBy(linkText="Organizations")
	private WebElement org_link;
	
	
	@FindBy(linkText="Contacts")
	private WebElement cont_link;
	

	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement adm_syb;

	@FindBy(linkText="Sign Out")
	private WebElement logot_btn;
	
	@FindBy(linkText="Opportunities")
	private WebElement Oprtu_link;

	public HomePageClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getOrg_link() {
		return org_link;
	}

	public WebElement getCont_link() {
		return cont_link;
	}

	public WebElement getAdm_syb() {
		return adm_syb;
	}

	public WebElement getLogot_btn() {
		return logot_btn;
	}
	
	public void getorgLink() {
		org_link.click();
	}
	public void getContactLink() {
		cont_link.click();
	}
	
	public void getOportynityLink() {
		Oprtu_link.click();
	}
	
	public void setLogout(WebDriver driver) {
		Actions act=new Actions(driver);
		act.moveToElement(adm_syb).perform();
		logot_btn.click();
	}
	
	
	
	
	
}
