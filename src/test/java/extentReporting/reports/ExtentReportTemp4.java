package extentReporting.reports;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ExtentReportTemp4 extends Base {
	

	
	
	@Test
	public void initialDemo_4() {
		
		WebDriver driver = initializeDriver();
		driver.get("https://blazedemo.com");
		ExtentTest test = extentTest.get();
		test.log(Status.PASS, "HELLO 04");
		driver.close();
	}
	

	
	@Test
	public void initialDemo_5() throws IOException {

		ExtentTest test = extentTest.get();
		WebDriver driver = initializeDriver();
		driver.get("https://blazedemo.com");
		test.log(Status.PASS, "HELLO 05");
		driver.close();
	}
	
	

}
