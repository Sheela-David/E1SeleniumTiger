package Sample;

import org.testng.annotations.Test;

public class RetryAnalyzerPractice {
	
	@Test(retryAnalyzer = genericUtility.RetryAnalyzerImplementation.class)
//	@Test(invocationCount = 3)
	public void sample() {
		
		System.out.println("Hiiii");
	}

}
