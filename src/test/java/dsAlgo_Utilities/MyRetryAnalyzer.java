package dsAlgo_Utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyzer implements IRetryAnalyzer {
	private int count = 0;
	private static final int maxTry = 3; // Retry three times

	@Override
	public boolean retry(ITestResult iTestResult) {
		if (count < maxTry) {
			count++;
			return true;
		}
		return false;
	}
}
