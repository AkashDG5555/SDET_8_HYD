import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class createMultipleTestMethods {
	@BeforeSuite
	
	public void ConnectWithDB() {
		System.out.println("Connected With DataBase");
	}
	
	@BeforeTest
	public void CrossBrowser() {
		System.out.println("Cross Browser Started");
	}

	@BeforeClass
	public void openBrowser() {
		System.out.println("Opening browser");
	}
	
	@BeforeMethod
	public void Login() {
		System.out.println("Logged into Application");
	}
	
	@Test(priority = 1)
	public void orgTest() {
		System.out.println("Organisation created");
		
	}
	
	@Test(priority = 2)
	public void orgWithIndustry() {
		System.out.println("organisation created with Industry");
	}
	
	@AfterMethod
	public void Logout() {
		System.out.println("Logged out from Appication");
	}
	
	@AfterClass
	public void CloseBrowser() {
		System.out.println("Browser closed");
	}
	
	@AfterTest
	public void CrossBrowserEnd() {
		System.out.println("Cross Browser Ended");

}
	@AfterSuite
	public void DisConnectWithDB() {
		System.out.println("Dis Connected From DataBase");
}
}
