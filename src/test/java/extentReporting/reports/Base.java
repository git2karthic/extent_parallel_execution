package extentReporting.reports;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Base {
	
	WebDriver driver;
	
//	static ExtentSparkReporter sparkReporter;
//	static ExtentReports extent;
//	static ExtentTest test;
	
	static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();
	
	public WebDriver initializeDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\reports\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public String GetScreenshotPath(String testCaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationPath = System.getProperty("user.dir") + "\\reports\\" + testCaseName + ".png";
		File file = new File(destinationPath);
					
		FileUtils.copyFile(source, file);
		return destinationPath;
	}
	
//	@BeforeSuite
//	public void suiteBefore() {
//		
//		String path = System.getProperty("user.dir") + "\\reports\\index.html";
//		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
//		reporter.config().setReportName("Web Automation Report");
//		reporter.config().setDocumentTitle("Test Results");
//		
//		extent = new ExtentReports();
//		extent.attachReporter(reporter);
//		extent.setSystemInfo("Tester", System.getProperty("user.name"));
//	
//	}
//	
//	@AfterSuite
//	public void suiteAfter(ITestResult result) {
//		extent.flush();
//	}

	
//	public static ExtentReports ExtentReportGenerator() {
//		String path = System.getProperty("user.dir") + "\\reports\\index.html";
//		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
//		reporter.config().setReportName("Web Automation Report");
//		reporter.config().setDocumentTitle("Test Results");
//		
//		extent = new ExtentReports();
//		extent.attachReporter(reporter);
//		extent.setSystemInfo("Tester", System.getProperty("user.name"));
//		return extent;
//	}


}
