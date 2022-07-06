package extentReporting.reports;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ExtentReportTemp3 extends Base {
	

	
	@Test
	public void initialDemo_3() throws IOException {
		
		WebDriver driver = initializeDriver();
		driver.get("https://blazedemo.com");
		ExtentTest test = extentTest.get();
		test.log(Status.PASS, "HELLO 03");
		driver.close();
	}
	

	

	

}
