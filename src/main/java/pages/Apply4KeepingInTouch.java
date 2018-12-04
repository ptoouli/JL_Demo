package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

import org.openqa.selenium.WebElement;

import utilities.Sleep;
import utilities.WaitForElement;

public class Apply4KeepingInTouch extends ApplyBasePage
{

	@FindBy(css="#optionalBenefits > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > a:nth-child(2) > span:nth-child(1) > label:nth-child(2)")
	public WebElement receiveAlertsNoButton;
	@FindBy(id="PrimaryApplicant_PreferredJohnLewisStore")
	public WebElement mostFrequentJohnLewisDropdown;
	@FindBy(id="PrimaryApplicant_WhereHearPartnershipCard")
	public WebElement whereDidYouHearDropdown;
	@FindBy(id="PrimaryApplicant_NameOnCard")
	public WebElement nameOnCardBox;
	@FindBy(css="div.custom-radios:nth-child(3) > a:nth-child(2)")
	public WebElement balanceTransferNoButton;
	@FindBy(id="continue_optionalBenefits")
	public WebElement continueButton;
	
	public void selectAlerts()
	{
		receiveAlertsNoButton.click();
	}
	
	public void selectMostFrequentStore()
	{
		Select store = new Select (mostFrequentJohnLewisDropdown);
		store.selectByIndex(new Random().nextInt(store.getOptions().size() - 1) + 1);
		
	}
	
	public void selectWhereDidYouHearAboutUs()
	{
		Select media = new Select (whereDidYouHearDropdown);
		media.selectByIndex(new Random().nextInt(media.getOptions().size() - 1) + 1);	
	}
	
	public void inputNameOnCard()
	{
		nameOnCardBox.clear();
		nameOnCardBox.sendKeys(Apply1AboutYouPage.firstName + " " + Apply1AboutYouPage.surname);
	}
	
	public void selectBalanceTransfer()
	{
		balanceTransferNoButton.click();
	}
	
	public void completeAllKeepingInTouch()
	{
		selectAlerts();
		Sleep.sleep();
		selectMostFrequentStore();
		Sleep.sleep();
		selectWhereDidYouHearAboutUs();
		Sleep.sleep();
		inputNameOnCard();
		Sleep.sleep();
		selectBalanceTransfer();
		Sleep.sleep();
		continueButton.click();
		
	}
	
	
	public Apply4KeepingInTouch() 
	{
		super();
		WaitForElement.id("PrimaryApplicant_NameOnCard", driver);
		PageFactory.initElements(driver, this);
	}

}
