package Sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionPractice {
	@Test
	public void strictComparisonHardAssert() {
		String expectedValue = "robin";
		String actualValue = "robin";
		Assert.assertEquals(actualValue, expectedValue);
		System.out.println("Assertion completed");
	}
	@Test
	public void containsComparisonHardAssert() {
		String expectedValue = "Don";
		String actualValue = "london";
		Assert.assertTrue(actualValue.contains(expectedValue));
		System.out.println("contains comparison completed");
		
	}

}
