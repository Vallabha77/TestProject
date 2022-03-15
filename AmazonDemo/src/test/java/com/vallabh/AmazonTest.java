package com.vallabh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.AmazonHeader;
import pom.AmazonLogin;


public class AmazonTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91906\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		
		AmazonLogin login=new AmazonLogin(d);
	//	login.email();	login.password();	login.checkbox();	login.signin();
		
		
		AmazonHeader header=new AmazonHeader(d);
		header.allheadersclick();
	
		String url=d.getCurrentUrl();
		if(url.equals("https://www.amazon.in/")) {
			System.out.println("Passed..");
		}
		else {
			System.out.println("Failed..");
		}
		
	}

}
