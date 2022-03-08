package basepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {

	public static WebDriver chromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91906\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		return driver;
	}
	public static WebDriver firefoxBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\91906\\Downloads\\geckodriver-v0.30.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		return driver;
	}
	public static WebDriver IEBrowser() {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\91906\\Downloads\\IEDriverServer_x64_4.0.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		return driver;
	}
}
