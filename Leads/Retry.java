package Leads;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Retry implements IAnnotationTransformer{

	
	public void transformer(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod ) {
		annotation.setRetryAnalyzer(RetryFailedTest.class);
	}
}

}
