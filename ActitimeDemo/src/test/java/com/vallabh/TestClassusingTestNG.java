package com.vallabh;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.BaseClass1;

public class TestClassusingTestNG extends BaseClass1 {
	WebDriver d;
	
	@BeforeTest
	@Parameters("browser")
	public void test1(String browserName) {
		if(browserName.equals("Chrome")) {
			//d=new ChromeDriver();
			d=Chrome();
		}
	}
//		if(browserName.equals("Firefox")) {
//			//d=new FirefoxDriver();
//			d=Firefox();
//	}
//		if(browserName.equals("IE")) {
//			d=IE();
//		}
//	}
////	@BeforeMethod
//	public void beforemethod() {
//		System.out.println("");
//	}
	
	@Test(groups="Sanity")
	public void test1() {
		System.out.println("Sanity 1 is Running..");
	}

	@Test(groups="Smoke", invocationCount = 3)
	public void test2() {
		System.out.println("Smoke 1 invocation is Running..");
	}
	@Test(groups="Sanity",description = "test 6 fails..using assertions")
	public void test6() {
	//	System.out.println("Sanity 2 is Running..");
		Assert.fail();
	}
	@Test(groups="Smoke")
	public void test4() {
		System.out.println("Smoke 2 is Running..");
	}
	@Test(groups="Sanity")
	public void test5() {
		System.out.println("Sanity 3 is Running..");
	}
	
//	@AfterClass
//	public void afterclasss() {
//		System.out.println("After Class is Running..");
//	}
//	
//	@AfterMethod
//	public void aftermethod() {
//		System.out.println("After Method is Running..");
//	}
}
