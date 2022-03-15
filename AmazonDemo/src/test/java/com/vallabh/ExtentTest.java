package com.vallabh;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pom.AmazonLogin;
import pom.Baseclass;

public class ExtentTest extends Baseclass {
	WebDriver d;
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	Sheet sh;
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browser) throws Exception {
		reporter = new ExtentHtmlReporter("test-output"+File.separator+"ExtentReport"+File.separator+"Extent.html");
		ExtentReports extend = new ExtentReports();
		FileInputStream fis=new FileInputStream("C:\\Users\\91906\\Documents\\AmzonExcelfiile.xlsx");
		sh=WorkbookFactory.create(fis).getSheet("Sheet1");
		extend.attachReporter(reporter);
		if(browser.equalsIgnoreCase("Chrome"))
		{
			d = Chrome();
		}
		
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			d = Firefox();
		}
		
		else if(browser.equalsIgnoreCase("IE"))
		{
			d = IE();
		}
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
	@Test
	public void logintoApp() {
		AmazonLogin login=new AmazonLogin(d);
		login.email(sh.getRow(0).getCell(1).getStringCellValue());
		login.continuebutton();
		System.out.println(sh.getRow(0).getCell(1));
		login.password(sh.getRow(1).getCell(1).getStringCellValue());
		System.out.println(sh.getRow(1).getCell(1));
		login.signin();
	}
}