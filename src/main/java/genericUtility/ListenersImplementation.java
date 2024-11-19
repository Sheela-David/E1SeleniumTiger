package genericUtility;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

//this class provides implementation for itestlistener in TestNG and will monitor the execution of
public class ListenersImplementation implements ITestListener{
	
	ExtentReports report;
	ExtentTest test;
	JavaUtility jUtil = new JavaUtility();
	String dateTimeStamp = jUtil.getCalendarDetails("dd-MM-yyyy hh-mm-ss");
	

	@Override
	public void onTestStart(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName + "execution started");
		
		//create a test
		test = report.createTest(methodName);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName + "execution passed");
		
		test.log(Status.PASS, methodName + "execution passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName + "execution failed");
		
		test.log(Status.FAIL, methodName + "execution failed");
		
		//creating the screenshot on test script getting failed and attaching to report
		SeleniumUtility sUtil = new SeleniumUtility();
		String screenshotName = methodName+dateTimeStamp;
		try {
			String path = sUtil.captureSreenshot(BaseClass.sdriver, screenshotName);
			
			test.addScreenCaptureFromPath(path);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName + "execution skipped");
		
		test.log(Status.SKIP, methodName + "execution skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("suite execution started");
		
		//configuration of the report
		ExtentSparkReporter reporter = new ExtentSparkReporter(".\\Extent reports\\report-"+dateTimeStamp+".html");
		reporter.config().setDocumentTitle("VTiger Testing Reports");
		reporter.config().setReportName("VTiger");
		reporter.config().setTheme(Theme.DARK);
		
		report = new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Base URL", "http://localhost:8888");
		report.setSystemInfo("Base OS", "Windows");
		report.setSystemInfo("Base Browser", "Chrome");
		report.setSystemInfo("Reporter Name", "Rajat");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("suite execution finished");
		
		report.flush();
	}
	
	


}
