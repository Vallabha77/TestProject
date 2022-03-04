package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumDemomain {

	private WebDriver driver;
	@FindBy(xpath="//span[text()='Downloads']")
	private WebElement downloads;
	
	@FindBy(xpath="//span[text()='Documentation']")
	private WebElement documentation;
	
	@FindBy(xpath="//a[contains(@class,'selenium-button selenium-webdriver text-uppercase font-weight-bold')][1]")
	private WebElement driverreadmore;
	
	@FindBy(xpath="//img[@alt='BrowserStack']")
	private WebElement browserstack;
	
	public SeleniumDemomain(WebDriver d) {
		PageFactory.initElements(d, this);
		this.driver=d;
	}
	public void allclicks() {
		//downloads.click(); documentation.click(); 
		driverreadmore.click(); 
		//browserstack.click();
	}
}
