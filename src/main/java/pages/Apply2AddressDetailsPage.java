package pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.ConfigFileReader;
import utilities.Sleep;
import utilities.WaitForElement;

public class Apply2AddressDetailsPage extends ApplyBasePage
{
	@FindBy(id="PrimaryApplicant_CurrentAddressFlatNumber")
	public WebElement flatNumberBox;

	@FindBy(id="PrimaryApplicant_CurrentAddressHouseNumber")
	public WebElement houseNumberBox;

	@FindBy(id="PrimaryApplicant_CurrentAddressHouseName")
	public WebElement houseNameBox;

	@FindBy(id="PrimaryApplicant_CurrentAddressPostcode")//
	public WebElement postcodeBox;

	@FindBy(xpath="//*[@id=\"currentAddress\"]/div[5]/span[2]/button")
	public WebElement findAddress;
	
	
	public void inputPostcode()
	{
		postcodeBox.clear();
		String postcode = ConfigFileReader.getRandomPostcode();
		postcodeBox.sendKeys(postcode);
	}
	
	public void selectAddress()
	{
		WaitForElement.id("addressCurrentChoose", driver);
		WebElement AddressOptions = driver.findElement(By.id("addressCurrentChoose"));
		Select address = new Select (AddressOptions);
		address.selectByIndex(new Random().nextInt(address.getOptions().size()));
	}
	
	public void selectResidentialStatus()
	{
		WaitForElement.id("addressCurrentLivingSinceContainer", driver);
		WebElement residentailStatus = driver.findElement(By.id("PrimaryApplicant_ResidentialStatus"));
		Select resStatus = new Select (residentailStatus);
		resStatus.selectByIndex(new Random().nextInt(resStatus.getOptions().size() - 1) + 1);
	}
	
	public void selectMonthsAtAddress()
	{
		WaitForElement.id("addressCurrentLivingSinceContainer", driver);
		WebElement monthsAtAddress = driver.findElement(By.id("PrimaryApplicant_CurrentAddressStartLivingMonth"));
		Select month = new Select (monthsAtAddress);
		month.selectByIndex(new Random().nextInt(month.getOptions().size() - 1) + 1);
	}
	
	public void selectYearsAtAddressMoreThanThree()
	{
		WaitForElement.id("addressCurrentLivingSinceContainer", driver);
		WebElement yearsAtAddress = driver.findElement(By.id("PrimaryApplicant_CurrentAddressStartLivingYear"));
		Select year = new Select (yearsAtAddress);
		year.selectByIndex(new Random().nextInt(year.getOptions().size() - 1) + 1);
	}
	
	public void completeResidentialStatusValid()
	{
		selectResidentialStatus();
		Sleep.sleep();
		selectMonthsAtAddress();
		Sleep.sleep();
		selectYearsAtAddressMoreThanThree();
		Sleep.sleep();
		driver.findElement(By.id("continue_address")).click();
		Sleep.sleep();
	}
	
	
	
	
	public Apply2AddressDetailsPage()
	{
		super();
		WaitForElement.id("PrimaryApplicant_CurrentAddressPostcode", driver);
		PageFactory.initElements(driver, this);
	}

}
