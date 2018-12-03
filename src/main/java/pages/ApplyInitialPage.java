package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Sleep;
import utilities.WaitForElement;

public class ApplyInitialPage extends ApplyBasePage
{

	@FindBy(id="applyCreditCard")
	public WebElement whatYouNeedWrapper;
	
	@FindBy(xpath="//*[@id=\"applyCreditCard\"]/fieldset[1]")
	public WebElement whatYouNeedDetails;
	
	@FindBy(xpath="//*[@id=\"applyCreditCard\"]/fieldset[2]")
	public WebElement whatYouNeedTellUs;
	
	@FindBy(xpath="//*[@id=\"applyCreditCard\"]/form")
	public WebElement choseYourCardContainer;
	
	@FindBy(css="a.custom-radio-link:nth-child(1) > span:nth-child(1) > label:nth-child(1)")
	public static WebElement cardColourOption1;

	@FindBy(css="a.custom-radio-link:nth-child(2) > span:nth-child(1) > label:nth-child(1)")
	public static WebElement cardColourOption2;

	@FindBy(css="#Card3")
	public static WebElement cardColourOption3;

	@FindBy(css="a.custom-radio-link:nth-child(4) > span:nth-child(1) > label:nth-child(1)")
	public static WebElement cardColourOption4;
	
	@FindBy(id="ApplyNowButton")
	public static WebElement continueButton;
	
	
	public static void selectCardOption(String colour)
	{

		colour = colour.toLowerCase();
		
		switch (colour) 
		{
			case "green":
			    cardColourOption1.click();
			break;
				
			case "pink":
			    cardColourOption2.click();
			break;	
			
			case "blue":
			    cardColourOption3.click();
			break;
			
			case "black":
			    cardColourOption4.click();
			break;
			
			default:
				System.out.println("no colour has been selected");
			break;
				
		}
		
	}
	
	public void applyForNewCard(String colour)
	{
		acceptCookies();
		Sleep.sleep();
		selectCardOption(colour);
		Sleep.sleep();
		continueButton.click();
		Sleep.sleep();
		utilities.WaitForElement.xpath("//*[@id=\"ApplyMainPage\"]/form", driver);
	}
	
	public ApplyInitialPage()
	{
		super();
		WaitForElement.id("ApplyNowButton", driver);
		PageFactory.initElements(driver, this);
	}
	
}
