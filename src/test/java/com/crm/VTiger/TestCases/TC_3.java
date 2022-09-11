package com.crm.VTiger.TestCases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import GenericLibrary.ExcelFileUtility;
import GenericLibrary.JSONFileUtility;
import GenericLibrary.JavaUtility;
import GenericLibrary.WebDiverUtility;
import object_repository.CreateContactClass;
import object_repository.CreateNewContactClass;
import object_repository.HomePageClass;
import object_repository.LoginClass;
import object_repository.SearchOrgClassInContactClass;

public class TC_3 extends BaseClass {
	@Test
	public void view() throws Throwable {
//		
//		WebDiverUtility wUtil= new WebDiverUtility();
//		JSONFileUtility jUtil=new JSONFileUtility();
//		String URL = jUtil.JsonFileUtility("url");
//		String UN = jUtil.JsonFileUtility("username");
//		String PWD = jUtil.JsonFileUtility("password");
		
		ExcelFileUtility eUtil= new ExcelFileUtility();
		String FirstName = eUtil.readDataFromExcel("Sheet2", 1, 1);
		String LastName = eUtil.readDataFromExcel("Sheet2", 1, 2);
		
//		WebDriver driver=new ChromeDriver();
//		wUtil.maximixeWindow(driver);
//		wUtil.waitForPageLoad(driver);
//		driver.get(URL);
//		LoginClass lc=new LoginClass(driver);
//		lc.setLogin(UN, PWD);
		HomePageClass hp=new HomePageClass(driver);
		hp.getContactLink();
		CreateContactClass cn=new CreateContactClass(driver);
		cn.creatContactButton();
		CreateNewContactClass cf=new CreateNewContactClass(driver);
		cf.CreateNewContactsFilds(FirstName, LastName);
		
	    wUtil.switchingwindow(driver, "Accounts");
	    SearchOrgClassInContactClass so=new SearchOrgClassInContactClass(driver);
		so.selectOrgInSearch();
		wUtil.switchingwindow(driver, "Contacts");
		
		cf.getSave_btn();
		
//		hp.setLogout(driver);
//		driver.quit();
	}
}