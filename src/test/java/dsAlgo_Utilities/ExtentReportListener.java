package dsAlgo_Utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import dsAlgo_DriverFactory.driverfactory;

public class ExtentReportListener implements ITestListener {

	private static ExtentReports extent;
	private static ExtentTest test;

	@Override
	public void onStart(ITestContext context) {
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("./Reports/TestReport.html");
		htmlReporter.config().setDocumentTitle("Automation Report");
		htmlReporter.config().setReportName("DS Algo Project Test Results");
		htmlReporter.config().setTheme(Theme.STANDARD);

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		extent.setSystemInfo("Project Name", "DS Algo Portal");
		extent.setSystemInfo("Tester", "Team");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Browser", "Chrome");
	}

	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Passed: " + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {

		System.out.println("Test Failed: " + result.getName());
		try {
			// Take screenshot
			TakesScreenshot ts = (TakesScreenshot) driverfactory.getDriver();
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./Screenshots/" + result.getName() + ".png"));
			System.out.println("Screenshot captured for failed test: " + result.getName());
		} catch (Exception e) {
			System.out.println("Exception while taking screenshot: " + e.getMessage());
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Test Skipped: " + result.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush(); // important: writes everything to the report
	}
}
