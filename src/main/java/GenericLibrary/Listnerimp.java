package GenericLibrary;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

public class Listnerimp implements ITestListener {

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		String currentDate=new Date().toString().replace(":","_").replace(" ","_");
		String failedtestcase=result.getMethod().getMethodName();
		System.out.println(failedtestcase);
		EventFiringWebDriver ev=new EventFiringWebDriver(BaseClass.sdriver);
		File srcImg = ev.getScreenshotAs(OutputType.FILE);
		
		File destImg = new File("./screenshot/"+failedtestcase+currentDate+".png");
		try {
			FileUtils.copyFile(srcImg, destImg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	ExtentTest test;
	ExtentReports	reports;
	public void onTestStart(ITestResult result) {
		
		test=reports.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, result.getMethod().getMethodName()+" GOT PASSED");

		
	}

	public void onTestSkipped(ITestResult result) {
		
		test.log(Status.SKIP, result.getMethod().getMethodName());
	}

	public void onStart(ITestContext context) {
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(IpathConstant.EXTENREPORTPATH+JavaUtility.datee());
		reporter.config().setDocumentTitle("VTIGER");
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setReportName("smoke");

		reports= new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("browser version", "105");
		reports.setSystemInfo("repoter name", "pavan");
		reports.setSystemInfo("Build No", "5.3.1");
		reports.setSystemInfo("OS", "Windows_11");
		
	}

	public void onFinish(ITestContext context) {
		reports.flush();
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	

}
