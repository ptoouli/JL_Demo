package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WaitForElement;

public class ApplyBasePage extends BasePage
{

	@FindBy(id="ccPromo")
	public WebElement promoRightHandWrapper;
	
	@FindBy(css="div[class='box box-promo']") 
	public WebElement promoBox;
	
	@FindBy(css="div[class='box box-promo info-box']") 
	public WebElement infoBox;
	
	@FindBy(xpath="//*[@id=\"ccPromo\"]/div[2]/p[1]") 
	public WebElement infoBoxLink1;
	
	@FindBy(xpath="//*[@id=\"ccPromo\"]/div[2]/p[2]") 
	public WebElement infoBoxLink2;
	
	@FindBy(xpath="//*[@id=\"ccPromo\"]/div[2]/p[3]") 
	public WebElement infoBoxLink3;
	
	@FindBy(xpath="//*[@id=\"ccPromo\"]/div[2]/p[4]") 
	public WebElement infoBoxLink4;

	@FindBy(css="#acceptCookies")
	public static WebElement acceptCookies;

	
	public static void acceptCookies()
	{
	    WaitForElement.css("#acceptCookies", driver);
	    acceptCookies.click();
	    WaitForElement.cssHidden("#acceptCookies", driver);
	}
	

	
	
	public ApplyBasePage()
	{
		super(driver);
		WaitForElement.id("ccPromo", driver);
		PageFactory.initElements(driver, this);
	}
	
	
}
