package com.vallabh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import pom.GrowwFunctionsStocks;

public class GrowwFunctionsStockTest {
private WebDriver d;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91906\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://groww.in/");
	}
	
//	@Test
//	public void browsers(String browserName) {
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91906\\Downloads\\chromedriver_win32\\chromedriver.exe");
//			d=new ChromeDriver();
//			d.get("https://groww.in/");
//		}
		
	@Test
	public void stocksmethod() {
		d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		GrowwFunctionsStocks gs=new GrowwFunctionsStocks(d);
		gs.methodstart();
	}
}
