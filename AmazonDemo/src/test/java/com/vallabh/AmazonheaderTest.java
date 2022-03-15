package com.vallabh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.AmazonHeader;

public class AmazonheaderTest {

	private WebDriver d;
	@BeforeClass
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91906\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.amazon.in/");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before Method Initialized..");
	}
	@Test
	public void headertest() {
		AmazonHeader ah=new AmazonHeader(d);
		ah.allheadersclick();
	}
}
