package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AmazonHeader {

	private WebDriver driver;
	
	@FindBy(xpath="//a[@class='nav-a  '][1]")
	private WebElement amazonpay;
	@FindBy(xpath="//a[@class='nav-a  '][2]")
	private WebElement giftcards;
	@FindBy(xpath="//a[@class='nav-a  '][3]")
	private WebElement buyagain;
	@FindBy(xpath="//a[@class='nav-a  '][4]")
	private WebElement giftideas ;
	
	public AmazonHeader(WebDriver d) {
		PageFactory.initElements(d, this);
		this.driver=d;
	}
	public void allheadersclick() {
		amazonpay.click();	giftcards.click();  buyagain.click();  giftideas.click();
	}
}
