package com.vallabh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.SeleniumDemomain;

public class SeleniumdemoTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91906\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.selenium.dev/");
		
		SeleniumDemomain sd=new SeleniumDemomain(d);
		sd.allclicks();
		String url=d.getCurrentUrl();
		String title=d.getTitle();	System.out.println(title);
		if(url.equals("https://www.selenium.dev/")) {
			System.out.println("Passed..");
		}
		else {
			System.out.println("Failed..");
		}
	}

}
