package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GrowwFunctionsStocks {
private WebDriver d;

	@FindBy(xpath="//input[@id='globalSearch23']")
	private WebElement searchbar;
	@FindBy(xpath="//div[@id='globalSearch23-searchMainDivId']")
	private WebElement stocksclick;
	@FindBy(xpath="(//div[@id='suggestionsadani-transmission-ltd'])[1]")
	private WebElement adanistockclick;
	@FindBy(xpath="//span[text()='1Y']")
	private WebElement yearbutton;
	@FindBy(xpath="//div[text()='Profit']")
	private WebElement profitclick;
	@FindBy(xpath="(//a[@class='clrText pr54companyName truncate fs15'])[1]")
	private WebElement powergridstockclick;
	

	
	public GrowwFunctionsStocks(WebDriver d) {
		PageFactory.initElements(d, this);
		this.d=d;
	}
	public void methodstart() {
		searchbar.click(); 
		stocksclick.click();
		adanistockclick.click();
		WebElement year=d.findElement(By.xpath("//span[text()='1Y']"));
		JavascriptExecutor j=(JavascriptExecutor) d;
		j.executeScript("arguments[0].scrollIntoView(true);",year);
		yearbutton.click();
		WebElement profit=d.findElement(By.xpath("//div[text()='Profit']"));
		j.executeScript("arguments[0].scrollIntoView(true);",profit);
		profitclick.click();
		WebElement powergrid=d.findElement(By.xpath("(//a[@class='clrText pr54companyName truncate fs15'])[1]"));
		j.executeScript("arguments[0].scrollIntoView(true);", powergrid);
		powergridstockclick.click();
		
	}
}
//