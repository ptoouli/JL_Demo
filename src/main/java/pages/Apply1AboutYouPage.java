package pages;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.ConfigFileReader;
import utilities.Sleep;
import utilities.WaitForElement;

public class Apply1AboutYouPage extends ApplyBasePage
{
	@FindBy(id="PrimaryApplicant_PromoCode")
	public WebElement promoCodeBox;

	@FindBy(id="PrimaryApplicant_Title")
	public WebElement titleDropdown;

	@FindBy(id="PrimaryApplicant_FirstName")
	public WebElement firstNameBox;

	@FindBy(id="PrimaryApplicant_MiddleName")//
	public WebElement middleNameBox;

	@FindBy(id="PrimaryApplicant_LastName")
	public WebElement surnameBox;

	@FindBy(xpath="//*[@id=\"aboutyou\"]/div[1]/div[3]/div[1]/div[2]/a[1]")
	public WebElement haveYouBeenKnownByAnyOtherNamesYes;
	
	@FindBy(xpath="//*[@id=\"aboutyou\"]/div[1]/div[3]/div[1]/div[2]/a[2]") 
	public WebElement haveYouBeenKnownByAnyOtherNamesNo;
	
	@FindBy(xpath="//*[@id=\"aboutyou\"]/div[1]/div[4]/div[1]/div[2]/a[1]")
	public WebElement areYouKnownByAnyOtherNamesYes;
	
	@FindBy(xpath="//*[@id=\"aboutyou\"]/div[1]/div[4]/div[1]/div[2]/a[2]")
	public WebElement areYouKnownByAnyOtherNamesNo;

	@FindBy(id="PrimaryApplicant_Gender")
	public WebElement genderDropDown;

	@FindBy(id="PrimaryApplicant.DateOfBirthDay")
	public WebElement dateOfBirthDayDropDown;

	@FindBy(id="PrimaryApplicant.DateOfBirthMonth")
	public WebElement dateOfBirthMonthDropDown;

	@FindBy(id="PrimaryApplicant.DateOfBirthYear")
	public WebElement dateOfBirthYearDropDown;
	
	@FindBy(id="PrimaryApplicant_Nationality")
	public WebElement nationalityDropDown;
	
	@FindBy(xpath="//*[@id=\"aboutyou\"]/div[1]/div[8]/div[1]/div[2]/a[1]")
	public WebElement otherNationalitiesYes;
	
	@FindBy(xpath="//*[@id=\"aboutyou\"]/div[1]/div[8]/div[1]/div[2]/a[2]")
	public WebElement otherNationalitiesNo;
	
	@FindBy(id="PrimaryApplicant_MaritalStatus")
	public WebElement maritalStatusDropDown;

	@FindBy(id="PrimaryApplicant_HomePhoneNumber")
	public WebElement homePhoneNumberBox;
	
	@FindBy(id="PrimaryApplicant_MobileNumber")
	public WebElement mobilePhoneNumberBox;
	
	@FindBy(id="PrimaryApplicant_OtherPhoneNumber")
	public WebElement workPhoneNumberBox;
	
	@FindBy(id="PrimaryApplicant_EmailAddress")
	public WebElement emailAddressBox;
	
	@FindBy(id="PrimaryApplicant_ConfirmEmailAddress")
	public WebElement confirmEmailAddressBox;
	
	@FindBy(id="PrimaryApplicant_FutureCorrespondenceFormat")
	public WebElement futureCorrespondenceFormatDropdown;
	
	@FindBy(id="PrimaryApplicant_PhoneContactRequirements")
	public WebElement phoneContactRequirementsDropdown;
	
	@FindBy(id="continue_aboutyou")
	public WebElement continueButton;
	
	
	public void inputPromoCode(String promoCode)
	{
		promoCodeBox.clear();
		promoCodeBox.sendKeys(promoCode);
	}
	
	public void selectTitle()
	{
		Select title = new Select (titleDropdown);
		title.selectByIndex(new Random().nextInt(title.getOptions().size() - 1) + 1);
	}
	
	public void inputFirstName()
	{
		firstNameBox.clear();
		String firstName = ConfigFileReader.getRandomFirstName();
		firstNameBox.sendKeys(firstName);
	}
	
	public void inputMiddleName(String middleName)
	{
		middleNameBox.clear();
		middleNameBox.sendKeys(middleName);
	}
	
	public void inputSurname()
	{
		surnameBox.clear();
		String surname = ConfigFileReader.getRandomSurname();
		surnameBox.sendKeys(surname);
	}
	
	public void haveYouBeenKnownByAnyOtherNames()
	{
		haveYouBeenKnownByAnyOtherNamesNo.click();
	}
	
	public void areYouKnownByAnyOtherNames()
	{
		areYouKnownByAnyOtherNamesNo.click();
	}
	
	public void selectGender()
	{
		Select gender = new Select (genderDropDown);
		gender.selectByIndex(new Random().nextInt(gender.getOptions().size() - 1) + 1);
	}
	
	public void selectDayOfBirth()
	{
		Select dob = new Select (dateOfBirthDayDropDown);
		dob.selectByIndex(new Random().nextInt(dob.getOptions().size() - 1) + 1);
	}
	
	public void selectMonthOfBirth()
	{
		Select mob = new Select (dateOfBirthMonthDropDown);
		mob.selectByIndex(new Random().nextInt(mob.getOptions().size() - 1) + 1);
	}
	
	public void SelectYearOfBirth()
	{
		Select yob = new Select (dateOfBirthYearDropDown);
		yob.selectByIndex(new Random().nextInt(yob.getOptions().size() - 19) + 19);
	}
	
	public void selectNationality()
	{
		Select country = new Select (nationalityDropDown);
		country.selectByIndex(new Random().nextInt(country.getOptions().size() - 1) + 1);
	}
	
	public void otherNationalities()
	{
		otherNationalitiesNo.click();
	}
	
	public void selectMaritalStatus()
	{
		Select maritalStatus = new Select (maritalStatusDropDown);
		maritalStatus.selectByIndex(new Random().nextInt(maritalStatus.getOptions().size() - 1) + 1);
	}
	
	public void inputHomePhoneNumber(String homePhoneNumber)
	{
		homePhoneNumberBox.clear();
		homePhoneNumberBox.sendKeys(homePhoneNumber);
	}
	
	public void inputMobilePhoneNumber(String mobilePhoneNumber)
	{
		mobilePhoneNumberBox.clear();
		mobilePhoneNumberBox.sendKeys(mobilePhoneNumber);
	}
	
	public void inputWorkPhoneNumber(String workPhoneNumber)
	{
		workPhoneNumberBox.clear();
		workPhoneNumberBox.sendKeys(workPhoneNumber);
	}
	
	public void inputEmailAddress(String email)
	{
		emailAddressBox.clear();
		emailAddressBox.sendKeys(email);
		confirmEmailAddressBox.clear();
		confirmEmailAddressBox.sendKeys(email);
	}
	
	public void selectFutureCorrespondenceFormat(String futureCorrespondenceFormat)
	{
		new Select(futureCorrespondenceFormatDropdown).selectByVisibleText(futureCorrespondenceFormat);
	}
	
	public void selectPhoneContactRequirements(String phoneContactRequirements)
	{
		new Select(phoneContactRequirementsDropdown).selectByVisibleText(phoneContactRequirements);
	}
	
	public void clickContinue()
	{
		continueButton.click();
	}

	
	public void completeMandatoryDetailsValid (String homePhoneNumber,String email)
	{
		selectTitle();
		Sleep.sleep();
		inputFirstName();
		Sleep.sleep();
		inputSurname();
		Sleep.sleep();
		haveYouBeenKnownByAnyOtherNames();
		Sleep.sleep();
		areYouKnownByAnyOtherNames();
		Sleep.sleep();
		selectGender();
		Sleep.sleep();
		selectDayOfBirth();
		Sleep.sleep();
		selectMonthOfBirth();
		Sleep.sleep();
		SelectYearOfBirth();
		Sleep.sleep();
		selectNationality();
		Sleep.sleep();
		otherNationalities();
		Sleep.sleep();
		selectMaritalStatus();
		Sleep.sleep();
		inputHomePhoneNumber(homePhoneNumber);
		Sleep.sleep();
		inputEmailAddress(email);
		Sleep.sleep();
		clickContinue();
		if (homePhoneNumber.equals("09898989898"))
		{
			confirmEmailAddressBox.click();
		}
		Sleep.sleep();
		WaitForElement.id("PrimaryApplicant_CurrentAddressPostcode", driver);
	}
	
	
	public Apply1AboutYouPage()
	{
		super();
		WaitForElement.id("PrimaryApplicant_PromoCode", driver);
		PageFactory.initElements(driver, this);
	}
	
}
