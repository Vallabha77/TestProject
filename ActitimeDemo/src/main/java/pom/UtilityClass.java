package pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {

	public static WebDriver Screenshot() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91906\\Downloads\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://localhost:8083/login.do");
		Random r=new Random();
		int x=r.nextInt(20);
		File path=new File("C:\\Users\\91906\\Documents\\Scrrenshots");
		FileInputStream fis=new FileInputStream(path);
		File dest=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		System.out.println(dest);
		FileHandler.copy(path, dest);
		return d;	
	}
	public static String excelSheet(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		String path="C:\\Users\\91906\\Documents\\Excelsheet.xlsx";
		FileInputStream fis=new FileInputStream(path);
		String data=WorkbookFactory.create(fis).getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		System.out.println(data);
		return data;
	}
}