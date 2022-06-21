package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLoginPage {
	
	@FindBy(xpath = "//input[@id='userid']") private WebElement email;
	@FindBy(xpath = "//input[@id='password']") private WebElement passcode;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginbutton;
	@FindBy(xpath = "//a[@class='text-light forgot-link']") private WebElement forget;
	@FindBy(xpath = "//a[@class='text-light']") private WebElement signup;
	@FindBy(xpath = "//img[@src='/static/images/zerodha-logo.svg']") private WebElement logo;
	
	
	public ZerodhaLoginPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	public void enteremailId(String emailaddress){
		email.sendKeys(emailaddress);
	}
	
	public void enterpassword(String password) {
		passcode.sendKeys(password);
	}
	public void clicklogin() {
		loginbutton.click();
	}
	
	public void forgetUserIdPassword() {
		forget.click();
	}
	
	public void signupAccount() {
		signup.click();
	}
	
	public void zerodhaLogo() {
		logo.click();
	}
}
