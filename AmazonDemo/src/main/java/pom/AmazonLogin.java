package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLogin {
	private WebDriver driver;
	
	@FindBy(xpath="//input[@id='ap_email']")
	private WebElement email;
	@FindBy(xpath="//span[@id='continue']")
	private WebElement continuebutton;
	@FindBy(xpath="//a[@id='createAccountSubmit']")
	private WebElement createnew;
	@FindBy(xpath="//input[@id='ap_password']")
	private WebElement password;
	@FindBy(xpath="//input[@name='rememberMe']")
	private WebElement signincheckbox;
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement signin;
	@FindBy(xpath="//input[@id='continue']")
	private WebElement otpforphone;
	
	public AmazonLogin(WebDriver d) {
		PageFactory.initElements(d, this);
		this.driver=d;
	}
	public void email(String email1) {
		email.sendKeys("paratkarv@gmail.com");
	}
	public void continuebutton() {
		continuebutton.click();
	}
	public void password(String pass) {
		password.sendKeys("Vallabha@123");
	}
	public void checkbox() {
		signincheckbox.isSelected();
	}
	public void signin() {
		signin.click();
	}
}
