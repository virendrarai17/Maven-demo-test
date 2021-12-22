package Analyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class MyTransform implements IAnnotationTransformer {
	
// IAnnotationTransformer interface used to run failed test cases as runtime
// override transform()method
	
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod){
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
	}
}

