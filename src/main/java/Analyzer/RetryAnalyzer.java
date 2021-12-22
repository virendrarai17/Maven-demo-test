package Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	// IRetryAnalyzer is interface
 
	int counter=0;
	int retryLimit=3; // how many time we want execute failed test cases. 
	// we will override retry method
	public boolean retry(ITestResult result){
		if (counter <retryLimit){
			counter++;
			return true;
		}
		return false;
	}
}
