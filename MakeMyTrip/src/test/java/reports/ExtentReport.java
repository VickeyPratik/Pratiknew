package reports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
@Test
public void Extent() {
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/report1.html");
	ExtentReports report = new ExtentReports();
	report.attachReporter(reporter);
	ExtentTest logger = report.createTest("tc01");
	logger.pass("passes");
	logger.fail("fail");
	logger.info("information");
	report.flush();
}

	
	

}
