package com.vallabh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.GrowwLogin;

public class GrowwLoginUsingTestNG {

 private WebDriver d;

	

//	@BeforeMethod
//	public void setup() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91906\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		d=new ChromeDriver();
//	}
	 @BeforeClass
		public void start() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\91906\\Downloads\\chromedriver_win32\\chromedriver.exe");
			d=new ChromeDriver();
			d.get("https://groww.in");
		}
	
	
	@Test
	public void logincheck() throws InterruptedException {
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		GrowwLogin gl=new GrowwLogin(d);
		gl.growwlogin();
	}
	
	
}
