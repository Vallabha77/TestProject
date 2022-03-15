package com.vallabh;

import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.xml.XmlSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;

public class ExtentReportListner implements IReporter {

	private static final String OUTPUT_FOLDER="test-output/ExtentReport/";
	private static final String FILE_NAME="Extent.html";
	
	private ExtentReports ex;
	
	public void generateReport(List<XmlSuite> xmlsuites, List<ISuite> isuit,String outputdirectory) {
		//init();
		for(ISuite suit:isuit) {
			Map<String, ISuiteResult> results=suit.getResults();
		
		for(ISuiteResult r:results.values()) {
			ITestContext context=r.getTestContext();
			
		
             
		}
		
	}
}
}
