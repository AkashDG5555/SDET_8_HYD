package GenericLibrary;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyserClass implements IRetryAnalyzer {
	int count=0;
	int retryLimit=0;
	public boolean retry(ITestResult result) {
		if (count<retryLimit) {
			
		
		return true;
	}
		return false;

	
	}

	
	

}
