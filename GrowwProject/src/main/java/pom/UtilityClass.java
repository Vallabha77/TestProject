package pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {

	public static WebDriver scrrenshotMethod() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91906\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://groww.in/");
		Random r=new Random();
		int x=r.nextInt(40);
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\91906\\Documents\\vallabh.jpg" +x);
		FileHandler.copy(f, dest);
		return driver;
	}
	public static String excelsheetdataFetch() throws EncryptedDocumentException, IOException {
		String path="C:\\Users\\91906\\Documents\\Excelsheet.xlsx";
		FileInputStream f=new FileInputStream(path);
		String val=WorkbookFactory.create(f).getSheet("Sheet1").getRow(2).getCell(2).getStringCellValue();
		System.out.println(val);
		return val;
				
	}
}
