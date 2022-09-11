import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

public class extent_reports {
	
	ExtentSparkReporter reporter; //PATH ,LOOK AND FEEL REPORT
	ExtentReports reports; // AATCH REPORTER AND ENV VARIABLE
	ExtentTest test; //TO CREATE ENTRIES
@Test
	public void generateReports() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		reporter=new ExtentSparkReporter("./Reports/facebook.html");
		reporter.config().setDocumentTitle("VTIGER");
		reporter.config().setTheme(Theme.DARK);
		reporter.config().setReportName("smoke test");
		
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("browser version", "105");
		reports.setSystemInfo("reporter name", "Akash");
		reports.setSystemInfo("build no", "4.12");
		reports.setSystemInfo("Operating system", "Windows");
		
		test=reports.createTest("Flipkart");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path = "../SDET_HYD_8/screenshot/ABC2.PNG";
		File dest=new File(path);
		Files.copy(src, dest);
		
		test.addScreenCaptureFromPath(path);
		
		test.log(Status.FAIL, "Got failed");
		reports.flush();
	}
}
