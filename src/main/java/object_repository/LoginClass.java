package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginClass {


@FindBy(name="user_name")
private WebElement usrnm_fd;

@FindBy(name="user_password")
private WebElement pwd_fd;

@FindBy(id="submitButton")
private WebElement lgn_btn;

public LoginClass(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getUsrnm_fd() {
	return usrnm_fd;
}

public WebElement getPwd_fd() {
	return pwd_fd;
}

public WebElement getLgn_btn() {
	return lgn_btn;
}

public void setLogin(String username,String Password) {
	
	usrnm_fd.sendKeys(username);
	pwd_fd.sendKeys(Password);
	lgn_btn.click();
	
}


}


