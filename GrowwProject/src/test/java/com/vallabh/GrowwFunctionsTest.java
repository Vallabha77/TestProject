package com.vallabh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.GrowwFunctions;

public class GrowwFunctionsTest {

private WebDriver d;

	@BeforeMethod
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91906\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://groww.in/");
	}
	
	@Test
	public void growwtestfunctions() throws InterruptedException {
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		GrowwFunctions g=new GrowwFunctions(d);
		g.methodcalling();
		
	}
}
