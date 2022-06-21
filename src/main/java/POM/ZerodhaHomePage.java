package POM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaHomePage {
	
	
	@FindBy(xpath = "//input[@icon='search']") private WebElement search;
	@FindBy(xpath = "//span[@class='tradingsymbol']") private List<WebElement> searchresult;
	@FindBy(xpath = "//button[@data-balloon='Buy']") private WebElement buy;
	@FindBy(xpath = "//button[@data-balloon='Sell']") private WebElement sell;
	@FindBy(xpath = "//a[@href='/orders']") private WebElement orders;
	@FindBy(xpath = "//a[@href='/dashboard']") private WebElement dashboard;
	@FindBy(xpath = "//span[text()='OKP335']") private WebElement myprofile;
	
	public ZerodhaHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void clickorders() {
		orders.click();
	}
	
	public void clickdashboard() {
		dashboard.click();
	}
	
	public void clickMyProfile() {
		myprofile.click();
	}
	
	public void searchOnSearchTab(WebDriver driver,String shares) {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(5000));
		wait.until(ExpectedConditions.visibilityOf(search));
		
		search.sendKeys(shares);
   }
	
	public void clickonShareName(WebDriver driver ,String sharename) {
		int n = searchresult.size();
		for(int i=0;i<n;i++) {
			String z = searchresult.get(i).getText();
			System.out.println(z);
			if(z.equals(sharename)) {
				Actions act = new Actions(driver);
				act.moveToElement(searchresult.get(i));
				act.click();
				act.perform();
			}
	      }
	}
	
	public void clickonBuyButton(WebDriver driver , String sharename) {
		int n = searchresult.size();
		for(int i=0;i<n;i++) {
			String z = searchresult.get(i).getText();
			if(z.equals(sharename)) {
				Actions act = new Actions(driver);
				act.moveToElement(searchresult.get(i));
				act.moveToElement(buy);
				//act.click();
				act.perform();
				}
            }
	}
	




















}
