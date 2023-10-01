package TestNGLogic;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class RetryLogic implements IRetryAnalyzer {
	int counter = 0;
	int retryLimit=4;
	
	@Override
	public boolean retry(ITestResult result) {
		if(counter<retryLimit)
		{
			counter++;
			return true;
		}
		return false;
	}
	
	@Test(retryAnalyzer = RetryLogic.class)
	public void retryScript()
	{
		Assert.assertEquals(true, false);
	}
}