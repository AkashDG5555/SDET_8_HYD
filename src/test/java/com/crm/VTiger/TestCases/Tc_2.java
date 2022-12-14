package com.crm.VTiger.TestCases;

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
import GenericLibrary.JavaUtility;
import GenericLibrary.PropertyFileUtility;
import GenericLibrary.WebDiverUtility;
import object_repository.OrganisationPageClass;
import object_repository.Create_New_Organisation;
import object_repository.HomePageClass;
import object_repository.LoginClass;
import object_repository.Org_Info_Page;

public class Tc_2 extends BaseClass {
	@Test
	
	public void view() throws Throwable {
		
		WebDiverUtility wUtil= new WebDiverUtility();
		
//		PropertyFileUtility pUtil=new PropertyFileUtility();
//		String URL = pUtil.readDataFromPropertyFile("url");
//		String UN = pUtil.readDataFromPropertyFile("username");
//		String PWD= pUtil.readDataFromPropertyFile("password");
		
//		ExcelFileUtility eUtil= new ExcelFileUtility();
		String orgName = eUtil.readDataFromExcel("Sheet1", 1, 1)+JavaUtility.generateRandomNumber();
		String IndType = eUtil.readDataFromExcel("Sheet1", 4, 2);
		
//		WebDriver driver=new ChromeDriver();
//		wUtil.maximixeWindow(driver);
//		wUtil.waitForPageLoad(driver);
//		driver.get(URL);
//		LoginClass lc=new LoginClass(driver);
//		lc.setLogin(UN, PWD);
		HomePageClass hp=new HomePageClass(driver);
		hp.getorgLink();
		OrganisationPageClass co=new OrganisationPageClass(driver);
		co.CreateNewOrg();
		Create_New_Organisation cn= new Create_New_Organisation(driver);
		cn.DetailsOfCreatePageInfo(orgName, IndType);
		Org_Info_Page oi=new Org_Info_Page(driver);
		oi.setOrgInfoVerification();
		
//	hp.setLogout(driver);
		}

	
	}


