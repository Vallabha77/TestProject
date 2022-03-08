package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GrowwFunctions {

private WebDriver d;
	
	@FindBy(xpath="//img[@src='//assets-netstorage.groww.in/web-assets/billion_groww_desktop/prod/build/client/images/logo-dark-groww.83f43714.svg']")
	private WebElement growwlogo;
	@FindBy(xpath="//input[@id='globalSearch23']")
	private WebElement searchbar;
	@FindBy(xpath="//span[@class='rodal-close']")
	private WebElement closecross;
	@FindBy(xpath="//span[text()='View all products']")
	private WebElement productclick;
	@FindBy(xpath="//span[text()='All']")
	private WebElement allheader;
	@FindBy(xpath="//div[@id='suggestionswipro-ltd']")
	private WebElement wiprostock;
	@FindBy(xpath="//a[text()='ICICI Prudential Large & Mid Cap Fund Direct Plan Growth']")
	private WebElement mfclick;
	@FindBy(xpath="//input[@id='mfoc89Amount']")
	private WebElement sipamountsend;
	@FindBy(xpath="//div[@class='valign-wrapper mfoc94InpParent']")
	private WebElement calenderclick;
	@FindBy(xpath="//div[@class='date101Grid-item regular'][14]")
	private WebElement dateselection15;
	@FindBy(xpath="//span[text()='CONFIRM']")
	private WebElement confirm;
	@FindBy(xpath="//span[text()='1Y']")
	private WebElement yearbutton;
	
	public GrowwFunctions(WebDriver d) {
		PageFactory.initElements(d, this);
		this.d=d;
	}
	
	public void methodcalling() throws InterruptedException {
		System.out.println("Method Start..");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		searchbar.click();
		Thread.sleep(4000);
	//	allheader.click();
		wiprostock.click();
		Thread.sleep(4000);
		WebElement mftab=d.findElement(By.xpath("//a[text()='ICICI Prudential Large & Mid Cap Fund Direct Plan Growth']"));
		JavascriptExecutor js=(JavascriptExecutor) d;
		js.executeScript("arguments[0].scrollIntoView(true);", mftab);
		Thread.sleep(4000);
		mfclick.click();
		Thread.sleep(4000);
		yearbutton.click();
		Thread.sleep(4000);
		sipamountsend.sendKeys("1000");
		Thread.sleep(4000);
		calenderclick.click();
		Thread.sleep(4000);
		dateselection15.click();
		Thread.sleep(4000);
		confirm.click();
		//productclick.click();
	}
	
}

