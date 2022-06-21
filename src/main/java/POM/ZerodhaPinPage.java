package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaPinPage {
	
	@FindBy(xpath = "//input[@id='pin']") private WebElement pin;
	@FindBy(xpath = "//button[@class='button-orange wide']") private WebElement continuebutton;
	@FindBy(xpath = "//a[text()='Forgot 2FA?']") private WebElement forgot2fa;
	@FindBy(xpath = "//a[text()=\"Don't have an account? Signup now!\"]") private WebElement signupbutton;


	public ZerodhaPinPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	public void pin(String enterpin){
		pin.sendKeys(enterpin);
	}
	
	public void clickcontinuebutton() {
		continuebutton.click();;
	}
}
