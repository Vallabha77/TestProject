package com.vallabh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.ApplicationHeaderPage;
import pom.LoginPage;

public class Testclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91906\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://localhost:8083/login.do");
		
		LoginPage lp=new LoginPage(d);
		lp.Sendusername();	lp.Sendpassword();	lp.checkbox();	lp.clickLogin();
		
		ApplicationHeaderPage ap=new ApplicationHeaderPage(d);
	//	ap.opentaskpage();	String url=d.getCurrentUrl();	String title=d.getTitle();
		
//		if(url.equals("http://localhost:8083/login.do")) {
//			System.out.println("Test Case PASSED");
//		}
//		else {
//			System.out.println("Test Case Failed..");
//		}
//		if(title.equals("Task Page is Open..")) {
//			System.out.println("PASSED...");
//		}
	}
}
