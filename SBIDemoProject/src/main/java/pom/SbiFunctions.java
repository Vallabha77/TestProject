package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SbiFunctions {

private WebDriver d;

	@FindBy(xpath="//span[text()='New User Registration /']")
	private WebElement newRegister;
	@FindBy(xpath="(//span[text()='How Do I'])[1]")
	private WebElement howDoI;
	@FindBy(xpath="(//span[text()='Customer Care'])[1]")
	private WebElement customerCare;
	@FindBy(xpath="//span[text()='Lock & ']")
	private WebElement lockUnlockuser;
	@FindBy(xpath="//a[text()='Cancel']")
	private WebElement cancelbutton;
	@FindBy(xpath="//a[text()='Services ']")
	private WebElement services;
	@FindBy(xpath="//span[text()='Products and Services']")
	private WebElement productandservices;
	@FindBy(xpath="//a[text()='RTGS/NEFT']")
	private WebElement rtgsneftclick;
	@FindBy(xpath="//a[@id='secure_safe_text']")
	private WebElement securendsafefooter ;
	@FindBy(xpath="//a[text()='Corporate Banking - Home']")
	private WebElement corporatebankingtab ;
	@FindBy(xpath="//a[text()='About OnlineSBI']")
	private WebElement aboutonlinesbiheader ;
	@FindBy(xpath="//a[text()='Anywhere Corporate']")
	private WebElement anywherecorporate;
	@FindBy(xpath="//a[text()='Mobile Banking ']")
	private WebElement mobilebanking;
	
	
	
	
	public SbiFunctions(WebDriver d) {
		PageFactory.initElements(d, this);
		this.d=d;
	}
	//
	
	public void method1() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      //  d.findElement(By.xpath("//a[text()='Mobile Banking ']")).sendKeys(Keys.CONTROL +"t");
   //     d.findElement(By.xpath("//a[text()='Anywhere Corporate']")).sendKeys(Keys.CONTROL +"/t");
        
	//	  newRegister.click();
		//services.sendKeys(Keys.CONTROL +"t");
		//personalbanking.click();
		//cancelbutton.click();
		//howDoI.click();
		//d.navigate().to("https://www.onlinesbi.com/#");
		
		
	}
}
