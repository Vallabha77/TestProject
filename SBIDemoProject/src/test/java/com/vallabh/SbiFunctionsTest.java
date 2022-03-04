package com.vallabh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.SbiFunctions;

public class SbiFunctionsTest {
private WebDriver d;

	@BeforeMethod
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91906\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.onlinesbi.com/#");
	}
	
	@Test
	public void test1() throws InterruptedException {
		SbiFunctions sbi=new SbiFunctions(d);
		sbi.method1();
	}
}
