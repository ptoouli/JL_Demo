package pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitForElement;

public class BasePage 
{

	public static WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"nav-container\"]/div[2]/div/div/div/div/div/ul/li[1]")
	public WebElement homeButton;
	
	@FindBy(xpath="//*[@id=\"nav-container\"]/div[2]/div/div/div/div/div/ul/li[2]") 
	public static WebElement partnershipCardDropDown;
	
	@FindBy(xpath="//*[@id=\"nav-container\"]/div[2]/div/div/div/div/div/ul/li[2]/div/div")
	public WebElement partnershipCardSubMenuWrapper;
	
	@FindBy(xpath="//*[@id=\"nav-container\"]/div[2]/div/div/div/div/div/ul/li[2]/div/div/ul[1]/li[2]")
	public WebElement partnershipCardSubMenuPartnershipCard;
	
	@FindBy(xpath="//*[@id=\"nav-container\"]/div[2]/div/div/div/div/div/ul/li[2]/div/div/ul[1]/li[3]")
	public static WebElement partnershipCardSubMenuApplyNow;
	
	@FindBy(xpath="//*[@id=\"nav-container\"]/div[2]/div/div/div/div/div/ul/li[2]/div/div/ul[1]/li[4]")
	public WebElement partnershipCardSubMenuCardBenefits;
	
	@FindBy(xpath="//*[@id=\"nav-container\"]/div[2]/div/div/div/div/div/ul/li[2]/div/div/ul[1]/li[5]")
	public WebElement partnershipCardSubMenuPointsCalculator;
	
	@FindBy(xpath="//*[@id=\"nav-container\"]/div[2]/div/div/div/div/div/ul/li[2]/div/div/ul[1]/li[6]")
	public WebElement partnershipCardSubMenuContactUs;
	
	@FindBy(xpath="//*[@id=\"nav-container\"]/div[2]/div/div/div/div/div/ul/li[2]/div/div/ul[1]/li[7]")
	public WebElement partnershipCardSubMenuFAQs;
	
	@FindBy(xpath="//*[@id=\"nav-container\"]/div[2]/div/div/div/div/div/ul/li[2]/div/div/ul[2]/li/h4")
	public WebElement partnershipCardSubMenuExistingCustomerTitle;
	
	@FindBy(xpath="//*[@id=\"nav-container\"]/div[2]/div/div/div/div/div/ul/li[2]/div/div/ul[2]/li/ul/li[1]")
	public WebElement partnershipCardSubMenuLogin;
	
	@FindBy(xpath="//*[@id=\"nav-container\"]/div[2]/div/div/div/div/div/ul/li[2]/div/div/ul[2]/li/ul/li[2]")
	public WebElement partnershipCardSubMenuPartnershipCardApp;
	
	@FindBy(xpath="//*[@id=\"nav-container\"]/div[2]/div/div/div/div/div/ul/li[2]/div/div/ul[2]/li/ul/li[3]")
	public WebElement partnershipCardSubMenuCardholderExlusives;
	
	@FindBy(xpath="//*[@id=\"nav-container\"]/div[2]/div/div/div/div/div/ul/li[2]/div/div/ul[2]/li/ul/li[4]")
	public WebElement partnershipCardSubMenuTravellingOverseas;
	
	@FindBy(xpath="//*[@id=\"nav-container\"]/div[2]/div/div/div/div/div/ul/li[2]/div/div/ul[2]/li/ul/li[5]")
	public WebElement partnershipCardSubMenuMobilePayments;
	
	@FindBy(xpath="//*[@id=\"nav-container\"]/div[2]/div/div/div/div/div/ul/li[2]/div/div/ul[2]/li/ul/li[6]")
	public WebElement partnershipCardSubMenuCardSecurity;
	
/*	
	@FindBy(id="CBinner-message")
	public WebElement cookiesBanner;

	@FindBy(css=".CBclose-container")
	public WebElement cookiesCloseButton;*/
	
	
	public static void mouseOverPartnershipCardDropDown()
	{
		Actions action = new Actions(driver);
		action.moveToElement(partnershipCardDropDown).perform();
		utilities.WaitForElement.xpath("//*[@id=\"nav-container\"]/div[2]/div/div/div/div/div/ul/li[2]/div/div", driver);
	}
	
	public static void applyNowPartnershipCardDropDown()
	{
		mouseOverPartnershipCardDropDown();
		partnershipCardSubMenuApplyNow.click();
		}
	
	public static void applyNowPartnershipCardDropDown_ApplyNow()
	{
		applyNowPartnershipCardDropDown();
		ArrayList<?> tabs = new ArrayList<Object> (driver.getWindowHandles());
	    driver.switchTo().window((String) tabs.get(1));
		utilities.WaitForElement.id("ccToApplyTitle", driver);
	}
	
	public BasePage(WebDriver driver) 
	{
		BasePage.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
