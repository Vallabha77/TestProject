package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHeaderPage {
	
	private WebDriver driver;
	@FindBy (xpath="//a[@class='content tt_selected selected']")
	private WebElement timetrack;
	
	@FindBy (xpath="//a[@class='content tasks']")
	private WebElement task;
	
	@FindBy (xpath="//a[@class='content reports']")
	private WebElement report;
	
	@FindBy (xpath="//a[@class='content users_selected selected']")
	private WebElement user;
	
	@FindBy (xpath="//a[@class='content calendar']")
	private WebElement workschedule;
	
	public ApplicationHeaderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	public void allclicks() {
		System.out.println("Testing using testng..");
		timetrack.click(); task.click();
	}
}
