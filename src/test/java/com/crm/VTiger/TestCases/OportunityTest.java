package com.crm.VTiger.TestCases;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import object_repository.CreateNewOprtPageClass;
import object_repository.HomePageClass;
import object_repository.OportunityInfoPageClass;
import object_repository.OportunityPageClass;
import object_repository.SearchOrgInOportClass;
@Listeners(GenericLibrary.Listnerimp.class)
public class OportunityTest extends BaseClass {


	@Test(retryAnalyzer=GenericLibrary.RetryAnalyserClass.class)
	
	public void view() throws Throwable {
//		WebDiverUtility wUtil= new WebDiverUtility();
//		PropertyFileUtility pUtil=new PropertyFileUtility();
//		
//		WebDriver driver=new ChromeDriver();
//		wUtil.maximixeWindow(driver);
//		wUtil.waitForPageLoad(driver);
//		String URL = pUtil.readDataFromPropertyFile("url");
//		String UN = pUtil.readDataFromPropertyFile("username");
//		String PWD = pUtil.readDataFromPropertyFile("password");
//		driver.get(URL);
//		LoginClass lc=new LoginClass(driver);
//		lc.setLogin(UN, PWD);
		HomePageClass hp=new HomePageClass(driver);
		hp.getOportynityLink();
		OportunityPageClass op= new OportunityPageClass(driver);
		op.CreateNewOprtunity();
		CreateNewOprtPageClass cn= new CreateNewOprtPageClass(driver);
		cn.getOprtFields();
		wUtil.switchingwindow(driver, "Accounts");
		SearchOrgInOportClass so= new SearchOrgInOportClass(driver);
		so.NewSearchTabfld();
		wUtil.switchingwindow(driver, "Potentials");
	    cn.AssignRadioBtn();
	    OportunityInfoPageClass oi=new OportunityInfoPageClass(driver);
	    oi.setOportInfoVerification();
	    Reporter.log("org created", true);
//	    HomePageClass hc=new HomePageClass(driver);
//	    hc.setLogout(driver);
	  
//	   WebElement date = driver.findElement(By.id("jscal_field_closingdate"));
//	   String dateval="2022-08-26";
//	   selectdatebyJS(driver,date, dateval);
	  
	   
	  
	}
	
//	 public void selectdatebyJS(WebDriver driver, WebElement element,String dateval) {
//			JavascriptExecutor js=((JavascriptExecutor) driver);
//			js.executeScript("arguments[0].setAttribute('value',"+dateval+"');", element);
//			
//		}
//
//
	
@Test (groups = "regression")
	
	public void view1() throws Throwable {
//		WebDiverUtility wUtil= new WebDiverUtility();
//		PropertyFileUtility pUtil=new PropertyFileUtility();
//		
//		WebDriver driver=new ChromeDriver();
//		wUtil.maximixeWindow(driver);
//		wUtil.waitForPageLoad(driver);
//		String URL = pUtil.readDataFromPropertyFile("url");
//		String UN = pUtil.readDataFromPropertyFile("username");
//		String PWD = pUtil.readDataFromPropertyFile("password");
//		driver.get(URL);
//		LoginClass lc=new LoginClass(driver);
//		lc.setLogin(UN, PWD);
		HomePageClass hp=new HomePageClass(driver);
		hp.getOportynityLink();
		OportunityPageClass op= new OportunityPageClass(driver);
		op.CreateNewOprtunity();
		CreateNewOprtPageClass cn= new CreateNewOprtPageClass(driver);
		cn.getOprtFields();
		wUtil.switchingwindow(driver, "Accounts");
		SearchOrgInOportClass so= new SearchOrgInOportClass(driver);
		so.NewSearchTabfld();
		wUtil.switchingwindow(driver, "Potentials");
	    cn.AssignRadioBtn1();
	    OportunityInfoPageClass oi=new OportunityInfoPageClass(driver);
	    oi.setOportInfoVerification();
	    Reporter.log("org with ind created", true);
//	    HomePageClass hc=new HomePageClass(driver);
//	    hc.setLogout(driver);

}
}
