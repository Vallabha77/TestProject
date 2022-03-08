package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GrowwFunctionsMutualFunds {

private WebDriver d;

	@FindBy(xpath="//input[@id='globalSearch23']")
    private WebElement searchbar;
	@FindBy(xpath="//span[text()='MF']")
    private WebElement mfclick;
	@FindBy(xpath="//div[@id='suggestionstata-digital-india-fund-direct-growth']")
    private WebElement tatamfclick;
	@FindBy(xpath="//span[text()='1Y']")
    private WebElement yearbutton;
	@FindBy(xpath="//input[@id='mfoc89Amount']")
    private WebElement sipsend;
	@FindBy(xpath="//div[@class='valign-wrapper mfoc94InpParent']")
    private WebElement calenderclick;
	@FindBy(xpath="//div[text()='20']")
    private WebElement dateselection20;
	@FindBy(xpath="//span[text()='CONFIRM']")
    private WebElement confirm;
	@FindBy(xpath="(//img[@alt='Groww Logo'])[1]")
    private WebElement growwlogoclick;
	
	
	//(//span[text()='MF'])[1]
	
	public GrowwFunctionsMutualFunds(WebDriver d) {
		PageFactory.initElements(d, this);
		this.d=d;
	}
	public void start() throws InterruptedException {
		searchbar.click();
		Thread.sleep(5000);
		//Actions a=new Actions(d);
		//a.moveToElement(mfclick).click().build().perform();
		mfclick.click();
		Thread.sleep(5000);
		tatamfclick.click();
		Thread.sleep(5000);
		WebElement year=d.findElement(By.xpath("//span[text()='1Y']"));
		JavascriptExecutor j=(JavascriptExecutor) d;
		j.executeScript("arguments[0].scrollIntoView(true);", year);
		Thread.sleep(5000);
		yearbutton.click();
		Thread.sleep(5000);
		sipsend.sendKeys("1500");
		Thread.sleep(5000);
		calenderclick.click();
		Thread.sleep(5000);
		dateselection20.click();
		Thread.sleep(5000);
		confirm.click();
		Thread.sleep(5000);
		growwlogoclick.click();//to home page redirect..
	}
	
}
