package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ZerodhaForgotPage {
	
	@FindBy(xpath = "//input[@id='radio-30']") private WebElement rememberbutton;	
	@FindBy(xpath = "//input[@id='radio-31']") private WebElement forgotbutton;
	@FindBy(xpath = "//input[@placeholder='User ID']") private WebElement userid;
	@FindBy(xpath = "//input[@placeholder='PAN']") private WebElement pan;
	@FindBy(xpath = "//input[@id='radio-35']") private WebElement emailbutton;
	@FindBy(xpath = "//input[@id='radio-36']") private WebElement smsbutton;
	@FindBy(xpath = "//input[@placeholder='E-mail (as on account)']") private WebElement email;
	@FindBy(xpath = "//span[@class='icon icon-reload']") private WebElement captchareload;
	@FindBy(xpath = "//input[@placeholder='Captcha']") private WebElement captcha;
	@FindBy(xpath = "//button[@class='button-orange wide']") private WebElement resetbutton;
	@FindBy(xpath = "//a[@class='text-xsmall text-light reset-account-button']") private WebElement backtologin;
	@FindBy(xpath = "//a[@class='text-light']") private WebElement signup;
	@FindBy(xpath = "//img[@src='/static/images/zerodha-logo.svg']") private WebElement logo;

}
