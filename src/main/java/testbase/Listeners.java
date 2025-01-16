package testbase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resource.ExtentReporterNG;

public class Listeners extends TestBase implements ITestListener {
    ExtentTest test;
    ExtentReports extent = ExtentReporterNG.getReportObject();
    ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>(); // Thread-safe

    
    public void onTestStart(ITestContext context) {
    	extent.setSystemInfo("Suite Name", context.getName());
    	extentTest.get().log(Status.INFO, "Test Suite Started: " + context.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        extentTest.get().log(Status.PASS, "Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        extentTest.get().fail(result.getThrowable());

        WebDriver driver = null;
        try {
            driver = (WebDriver) result.getTestClass().getRealClass()
                    .getField("driver").get(result.getInstance());
        } catch (Exception e) {
            e.printStackTrace();
        }

        String filePath = null;
        try {
            filePath = getScreenshot(result.getMethod().getMethodName(), driver);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (filePath != null) {
            extentTest.get().addScreenCaptureFromPath(filePath, result.getMethod().getMethodName());
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        extentTest.get().log(Status.SKIP, "Test Skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        extentTest.get().log(Status.FAIL, "Test Failed But Within Success Percentage");
    }

   // @Override
   // public void onStart(ITestContext context) {
   // 	extentTest.get().log(Status.INFO, "Test Suite Started: " + context.getName());
   // }

    @Override
    public void onFinish(ITestContext context) {
    	extentTest.get().log(Status.INFO, "Test Suite Finished: " + context.getName());
        extent.flush();
    }
}
