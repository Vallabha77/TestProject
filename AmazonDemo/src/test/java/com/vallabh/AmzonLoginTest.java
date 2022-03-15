package com.vallabh;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.AmazonLogin;

public class AmzonLoginTest {

	WebDriver d;
	AmazonLogin login;
	Sheet sh;
	
	
	@BeforeTest
	@Parameters("browser")
	public void before() throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\91906\\Documents\\AmzonExcelfiile.xlsx");
		
		sh=WorkbookFactory.create(fis).getSheet("Sheet1");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91906\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Test
	public void logintoApp() {
		AmazonLogin login=new AmazonLogin(d);
		login.email(sh.getRow(0).getCell(1).getStringCellValue());
		login.continuebutton();
		System.out.println(sh.getRow(0).getCell(1));
		login.password(sh.getRow(1).getCell(1).getStringCellValue());
		System.out.println(sh.getRow(1).getCell(1));
		login.signin();
	}
}
