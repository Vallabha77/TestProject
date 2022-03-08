 package com.vallabh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserDemo {
WebDriver d;

@BeforeTest
@Parameters("browser")
public void start(String name) {
	if(name.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91906\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d=new ChromeDriver();
	}
	if(name.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\91906\\Downloads\\geckodriver-v0.30.0-win32\\geckodriver.exe");
		d=new FirefoxDriver();
	}
	if(name.equalsIgnoreCase("IE")) {
		System.setProperty("webdriver.ie.driver","C:\\Users\\91906\\Downloads\\IEDriverServer_x64_4.0.0\\IEDriverServer.exe");
		d=new InternetExplorerDriver();
	}
	d.manage().window().maximize();
	d.get("https://groww.in/");
	System.out.println(d.getTitle());
	d.close();
}
}
