package com.vallabh;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import pom.GrowwFunctionsMutualFunds;
import pom.UtilityClass;

public class NewTestClass extends BaseClass  {
WebDriver d;

@BeforeTest
@Parameters("browser")
public void forChrome(String browserName) {
	if(browserName.equals("chrome")) {
		d=BaseClass.chromeBrowser();
	}
	if(browserName.equals("firefox")) {
		d=BaseClass.firefoxBrowser();
	}
	if(browserName.equals("IE")) {
		d=BaseClass.IEBrowser();
	}
}

@BeforeClass
public void url() {
	d.get("https://groww.in/");
}
@Test(groups= "Regression Testing")
public void test1() throws InterruptedException {
		GrowwFunctionsMutualFunds g=new GrowwFunctionsMutualFunds(d);
		g.start();
	}

@AfterMethod
public void utility(ITestResult r) throws IOException {
	UtilityClass u=new UtilityClass();
	if(r.FAILURE ==r.getStatus())
	 {
		u.scrrenshotMethod();
		}
		u.excelsheetdataFetch();
	
	
}
	
}
