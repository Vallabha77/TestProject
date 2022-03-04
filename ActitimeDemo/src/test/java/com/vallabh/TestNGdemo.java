package com.vallabh;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.LoginPage;

public class TestNGdemo {

	private WebDriver driver;
	
	@BeforeClass
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91906\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://localhost:8083/login.do");
	}
	
	
	@Test()
	public void login () throws InterruptedException {
		System.out.println("Testing Start..");
		LoginPage l=new LoginPage(driver);
		l.clickLogin();
		System.out.println(driver.getCurrentUrl());

	}
	
	@AfterMethod
	public void exit() {
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.close();
	}
	
}
