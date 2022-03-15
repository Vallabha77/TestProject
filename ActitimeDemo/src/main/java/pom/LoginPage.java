package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.annotations.VisibleForTesting;

public class LoginPage {
	
	private WebDriver driver;

	@FindBy (xpath="//input[@id='username']")
	private WebElement username;
	
	@FindBy (xpath="//input[@name='pwd']")
	private WebElement password;
	
	@FindBy (xpath="//input[@id='keepLoggedInCheckBox']")
	private WebElement keepmelogincheckbox;
	
	@FindBy (xpath="//a[@id='loginButton']")
	private WebElement login;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
	
	public void Sendusername(String user) {
		username.sendKeys(user);
	}
	public void Sendpassword(String pass) {
		password.sendKeys(pass);
	}
	public void checkbox() {
		if(! keepmelogincheckbox.isSelected()) {
			keepmelogincheckbox.click();
		}
		else {
			System.out.println("Checkbox already Selected..");
		}
	}
	public void clickLogin() {
		login.click();
	}
//	public void LogintoApplication() {
//		username.sendKeys("admin");	password.sendKeys("manager"); 
//	//	this.driver=driver;
//		if(! keepmelogincheckbox.isSelected()) {
//			keepmelogincheckbox.click();
//		}
//		else {
//			System.out.println("Checkbox already Selected..");
//		}
//		login.click();
//	}
}
