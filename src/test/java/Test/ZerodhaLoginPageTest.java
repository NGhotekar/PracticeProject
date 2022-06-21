package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Utility.Parametrization;

@Listeners(TestListnerss.class)

public class ZerodhaLoginPageTest {
	
	WebDriver driver;

	@BeforeMethod
	public void browser() {
		driver = Browser.openBrowser();
	}
	
	@Test
	public void loginWithValidCredentialsTest() throws EncryptedDocumentException, IOException {
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		
		String user = Parametrization.getdata(0, 1);
		//String pass = Parametrization.getdata(1, 1);
		
		zerodhaLoginPage.enteremailId(user);
		//zerodhaLoginPage.enterpassword(pass);
		zerodhaLoginPage.clicklogin();
		
	}
	
	@Test
	public void loginWithPinTest() throws EncryptedDocumentException, IOException, InterruptedException {
        ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		
		String user = Parametrization.getdata(0, 1);
		String pass = Parametrization.getdata(1, 1);
		
		zerodhaLoginPage.enteremailId(user);
		zerodhaLoginPage.enterpassword(pass);
		zerodhaLoginPage.clicklogin();
		
		ZerodhaPinPage zerodhapinpage = new ZerodhaPinPage(driver);
		
		String pincode = Parametrization.getdata(6, 0);
	
		Thread.sleep(2000);
		
		System.out.println(pincode);
		
		zerodhapinpage.pin(pincode);
		zerodhapinpage.clickcontinuebutton();
	
	}
	
	@Test
	public void clickonForgetPasswordTest() {
        ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
        zerodhaLoginPage.forgetUserIdPassword();
	}
	
	@Test
	public void clickonSignupTest() {
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
        zerodhaLoginPage.signupAccount();
		
	}
	
	
	
}
