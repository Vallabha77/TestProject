package com.vallabh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import pom.AmazonLogin;

public class AmzonPropTest {

	public static void main(String[] args) {
		
		
		File f=new File("C:\\Users\\91906\\eclipse-workspace\\AmazonDemo\\Amazonprop\\Amazon.properties");
		
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop=new Properties();
		try {
			prop.load(fis);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91906\\Downloads\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get(prop.getProperty("URL"));
		
		d.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(prop.getProperty("email"));
		d.findElement(By.xpath("//span[@id='continue']")).click();
		d.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(prop.getProperty("password"));
		d.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
		File  folder=new File("C:\\Users\\91906\\Pictures\\Screenshots\\vallabh.jpg");
		
		f=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(f, folder);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
