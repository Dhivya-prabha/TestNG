package utlity;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.IAnnotation;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.ITest;

public class RetryListener implements  IAnnotationTransformer{
	
//set values for invocationcount, enabled, priority, dependsOnMethods, timeout, dependsOnGroups, groups, retryAnalyzer
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
		annotation.setRetryAnalyzer(utlity.RetryEngine.class);
	}

}
