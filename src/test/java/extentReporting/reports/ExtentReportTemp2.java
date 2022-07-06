package extentReporting.reports;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ExtentReportTemp2 extends Base {
		
	
	@Test
	public void initialDemo_2() throws IOException {

		ExtentTest test = extentTest.get();
		WebDriver driver = initializeDriver();
		driver.get("https://blazedemo.com");
		test.log(Status.PASS, "HELLO 02");
		driver.close();
	}
	

	

	

}
