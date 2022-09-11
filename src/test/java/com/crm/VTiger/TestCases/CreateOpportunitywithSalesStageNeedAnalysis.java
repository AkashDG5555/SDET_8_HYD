package com.crm.VTiger.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import GenericLibrary.ExcelFileUtility;
import GenericLibrary.JavaUtility;
import GenericLibrary.PropertyFileUtility;
import GenericLibrary.WebDiverUtility;
import object_repository.CreateNewOprtPageClass;
import object_repository.HomePageClass;
import object_repository.LoginClass;
import object_repository.OportunityInfoPageClass;
import object_repository.OportunityPageClass;
import object_repository.SearchOrgInOportClass;

public class CreateOpportunitywithSalesStageNeedAnalysis extends BaseClass {

	@Test
	
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
	
}
