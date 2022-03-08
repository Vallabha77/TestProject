package com.vallabh;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport {
	ExtentReports extent;
	ExtentTest logger;
	
@BeforeTest
public void extent() {
	extent = new ExtentReports (System.getProperty("user.dir") +"/test-output/STMExtentReport.html", true);
	//extent.addSystemInfo("Environment","Environment Name")
	extent
	                .addSystemInfo("Host Name", "SoftwareTestingMaterial")
	                .addSystemInfo("Environment", "Automation Testing")
	                .addSystemInfo("User Name", "Vallabh P");
	                //loading the external xml file (i.e., extent-config.xml) which was placed under the base directory
	                //You could find the xml file below. Create xml file in your project and copy past the code mentioned below
	                extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
	}
	@Test
	public void passTest(){
	//extent.startTest("TestCaseName", "Description")
	//TestCaseName – Name of the test
	//Description – Description of the test
	//Starting test
	logger = extent.startTest("passTest");
	Assert.assertTrue(true);
	//To generate the log when the test case is passed
	logger.log(LogStatus.PASS, "Test Case Passed is passTest");
	}
	@Test
	public void failTest(){
	logger = extent.startTest("failTest");
	Assert.assertTrue(false);
	logger.log(LogStatus.PASS, "Test Case (failTest) Status is passed");
	}
}
