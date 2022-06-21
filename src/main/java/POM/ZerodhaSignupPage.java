package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ZerodhaSignupPage {

	@FindBy(xpath = "//input[@id='user_mobile']") private WebElement mobilenumber;
	@FindBy(xpath = "//button[@class='register-user']") private WebElement continuebutton;
	@FindBy(xpath = "//a[text()='Want to open an NRI account?']") private WebElement wannaOpenNRIacc;
	//@FindBy(xpath = "//a[text()='About']") private WebElement aboutbutton;
	//@FindBy(xpath = "//a[text()='Products']") private WebElement productbutton;
	//@FindBy(xpath = "//a[text()='Pricing']") private WebElement pricingbutton;
	//@FindBy(xpath = "//a[text()='Support']") private WebElement supportbutton;
	//@FindBy(xpath = "//a[text()='Signup']") private WebElement signbutton;
	@FindBy(xpath = "//div[@id='menu_btn']") private WebElement menubutton;
	
}
