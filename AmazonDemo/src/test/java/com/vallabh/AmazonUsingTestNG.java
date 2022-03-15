package com.vallabh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.AmazonLogin;

public class AmazonUsingTestNG {

	//private WebDriver d;
	File f;
	Properties p;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91906\\Downloads\\chromedriver.exe");
		// d=new ChromeDriver();
		// p=new Properties();
		// f=new File("C:\\Users\\91906\\eclipse-workspace\\AmazonDemo\\Amazonprop\\Amazon.properties");
		
		
		
	}
	
	@Test
	public void amazontest() {

		 f=new File("C:\\Users\\91906\\eclipse-workspace\\AmazonDemo\\Amazonprop\\Amazon.properties");
		 p=new Properties();
		WebDriver d=new ChromeDriver();
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	//	Properties prop=new Properties();
		try {
			p.load(fis);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		d.get(p.getProperty("URL"));
//		AmazonLogin al=new AmazonLogin(d);
//		al.email();
		d.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(p.getProperty("email"));
		d.findElement(By.xpath("//span[@id='continue']")).click();
		d.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(p.getProperty("password"));
		d.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
		Random r=new Random();
		int n=r.nextInt(10);
		
		
		File f=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		File  folder=new File("C:\\Users\\91906\\Pictures\\Screenshots\\vallabh.jpg" +n);
		try {
			FileHandler.copy(f, folder);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

