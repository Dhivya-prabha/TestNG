package Leads;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTest implements IRetryAnalyzer{
	private static final int max = 2;
	private int retryCount = 0;
	
	
	public boolean retry(ITestResult result) {
		if(retryCount < max) {
			retryCount++;
			System.out.println("Max Count: " + retryCount);
			return true;
		}
		
		return false;
	}
	

}
