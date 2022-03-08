package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GrowwLogin {

	private WebDriver d;
	@FindBy(xpath="//span[text()='Login/Register']")
	private WebElement loginbutton;

	@FindBy(xpath="//div[text()='Continue with Google']")
	private WebElement continuegoogle;

	@FindBy(xpath="//div[text()='paratkarv@gmail.com']")
	private WebElement emailidclick;

	@FindBy(xpath="//div[@id='otpinput88parent']")
	private WebElement pinenter;
	
	public GrowwLogin(WebDriver d) {
		PageFactory.initElements(d, this);
		this.d=d;
	}
	
	public void growwlogin() throws InterruptedException {
		loginbutton.click(); 
		Thread.sleep(3000);
		continuegoogle.click(); 
		Thread.sleep(3000);
		emailidclick.click();
		Thread.sleep(3000);
		
		pinenter.sendKeys("7733");
	}
}
