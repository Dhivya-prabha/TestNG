package Leads;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class Retry implements IRetryAnalyzer {
	int maxtry = 2, iTries = 0;

	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(iTries < maxtry) {
			iTries++;
		}
		return false;
		
	}

	
}
