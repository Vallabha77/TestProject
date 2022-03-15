package com.vallabh;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.BaseClass1;
import pom.LoginPage;
import pom.UtilityClass;

public class HybridLoginTest extends BaseClass1 {

private	WebDriver d;
LoginPage l;
	
	
	@BeforeTest
	@Parameters("browser")
	public void test1(String browserName) {
		if(browserName.equals("Chrome")) {
			//d=new ChromeDriver();
			d=Chrome();
		}
	
		if(browserName.equals("Firefox")) {
			//d=new FirefoxDriver();
			d=Firefox();
	}
		if(browserName.equals("IE")) {
			d=IE();
		}
	}
	@BeforeClass
	public void before() {
		System.out.println("Before Class..");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method..");
	}
	@Test
	public void url() throws EncryptedDocumentException, IOException {
		l=new LoginPage(d);
		
		String user=UtilityClass.excelSheet("Sheet1", 0, 4);
		l.Sendusername(user);
		//System.out.println(user);
		String pass=UtilityClass.excelSheet("Sheet1", 0, 5);
		l.Sendpassword(pass);
		//System.out.println(pass);
		l.checkbox();
		l.clickLogin();
	}
}
