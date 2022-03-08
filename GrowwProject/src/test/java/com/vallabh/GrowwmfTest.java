package com.vallabh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.GrowwFunctionsMutualFunds;

public class GrowwmfTest {
private WebDriver d;
	@BeforeClass
	public void startup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91906\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://groww.in/");
		d.navigate().refresh();
	}
	@Test
	public void mutualFundsTest() throws InterruptedException  {
		GrowwFunctionsMutualFunds g=new GrowwFunctionsMutualFunds(d);
		g.start();
	}
}
