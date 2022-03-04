package com.vallabh;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClassusingTestNG {
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before Class Running...");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before Method is Running...");
	}
	
	@Test
	public void test1() {
		System.out.println("Test 1 is Running..");
	}

	@Test
	public void test2() {
		System.out.println("Test 2 is Running..");
	}
	
	@AfterClass
	public void afterclasss() {
		System.out.println("After Class is Running..");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("After Method is Running..");
	}
}
