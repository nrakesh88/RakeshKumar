package reports;

import java.io.File;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class CreateHTMLReports {

	@Test
	public void learnReport(){
		//@BeforeSuite
		ExtentReports report = new ExtentReports("./reports/result.html", false);
		report.loadConfig(new File("./src/main/resources/extent-config.xml"));
		
		//@BeforeMethod
		ExtentTest test = report.startTest("Login", "Login to the LeafTaps");
		test.assignAuthor("Babu");
		test.assignCategory("smoke");
		
		//Replace in GenericWrapper(syso)
		test.log(LogStatus.PASS, "Open", "The Browser Chrome Launched Successfully");
		test.log(LogStatus.WARNING, "UserName", "UserName couldn't be entered");

		//@AfterMethod
		report.endTest(test);
		
		//@AfterSuite
		report.flush();


	}

}










