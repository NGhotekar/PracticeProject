package Test;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaHomePage;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Utility.Parametrization;



public class ZerodhaHomeTest extends TestBase {
	
	
	@BeforeMethod
	public void browser() {
		driver = Browser.openBrowser();
	}
	
	@Test
	public void clickonSearchtabTest() throws EncryptedDocumentException, IOException, InterruptedException {
		 ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
			
			String user = Parametrization.getdata(0, 1);
			String pass = Parametrization.getdata(1, 1);
			
			zerodhaLoginPage.enteremailId(user);
			zerodhaLoginPage.enterpassword(pass);
			zerodhaLoginPage.clicklogin();
			
			ZerodhaPinPage zerodhapinpage = new ZerodhaPinPage(driver);
			
			String pincode = Parametrization.getdata(6, 0);
		
			Thread.sleep(2000);
			
			zerodhapinpage.pin(pincode);
			zerodhapinpage.clickcontinuebutton();
		
			ZerodhaHomePage zerodhahomepage = new ZerodhaHomePage(driver);
			 
			zerodhahomepage.searchOnSearchTab(driver,"d");
			
			zerodhahomepage.clickonShareName(driver,"DCM");
			
			//zerodhahomepage.clickonBuyButton(driver, "DCM");
			
			
			
			
			
			
			
			
	}

}
