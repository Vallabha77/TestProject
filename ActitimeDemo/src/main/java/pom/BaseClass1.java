package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass1 {

	public static WebDriver Chrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91906\\Downloads\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://localhost:8083/login.do");	
		return d;
	}
	public static WebDriver Firefox() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\91906\\Downloads\\geckodriver-v0.30.0-win32\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("http://localhost:8083/login.do");
		return d;
	}
	public static WebDriver IE() {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\91906\\Downloads\\IEDriverServer_x32_4.0.0\\IEDriverServer.exe");
		WebDriver d=new InternetExplorerDriver();
		d.get("http://localhost:8083/login.do");
		return d;
	}
}
