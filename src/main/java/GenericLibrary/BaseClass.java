package GenericLibrary;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import object_repository.HomePageClass;
import object_repository.LoginClass;

public class BaseClass {

	public WebDiverUtility wUtil= new WebDiverUtility();
	public WebDriver driver;
	public PropertyFileUtility pUtil=new PropertyFileUtility();
	public ExcelFileUtility eUtil= new ExcelFileUtility();
	public static WebDriver sdriver;
	
	
	@BeforeClass(groups = {"smoke","regression"})
	public void openBrowser() throws Throwable {
		System.out.println(("====Open Browser===="));
		String BROWSER = pUtil.readDataFromPropertyFile("browser");
		if(BROWSER.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else {
			driver=new FirefoxDriver();
		}
			
		wUtil.maximixeWindow(driver);
		sdriver=driver;
		wUtil.waitForPageLoad(driver);
	}
	
	@BeforeMethod(groups = {"smoke","regression"})
	public void setLogin() throws Throwable {
		System.out.println("====Login=====");
		driver.get(pUtil.readDataFromPropertyFile("url"));
		LoginClass lc=new LoginClass(driver);
		lc.setLogin(pUtil.readDataFromPropertyFile("username"), pUtil.readDataFromPropertyFile("password"));
	}
	
	@AfterMethod(groups = {"smoke","regression"})
	public void  logout() {
		System.out.println("====Logout=====");
		HomePageClass hp=new HomePageClass(driver);
		hp.setLogout(driver);
	}
	
	@AfterClass(groups = {"smoke","regression"})
	public void closeVrowser() {
		System.out.println("======close Browser====");
		driver.close();
	}
}
