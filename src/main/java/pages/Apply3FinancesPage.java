package pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.WaitForElement;

public class Apply3FinancesPage extends ApplyBasePage
{
	@FindBy(id="PrimaryApplicant_SortCodeParts_0_")
	public WebElement sortcodeABox;
	
	@FindBy(id="PrimaryApplicant_SortCodeParts_1_")
	public WebElement sortcodeBBox;
	
	@FindBy(id="PrimaryApplicant_SortCodeParts_2_")
	public WebElement sortcodeCBox;
	
	@FindBy(id="PrimaryApplicant_AccountNumber")
	public WebElement accountNumberBox;
	
	@FindBy(id="PrimaryApplicant_AccountAgeInMonths")
	public WebElement accountAgeMonthsBox;
	
	@FindBy(id="PrimaryApplicant_AccountAgeInYears")
	public WebElement accountAgeYearsBox;
	
	@FindBy(id="PrimaryApplicant_EmploymentStatus")
	public WebElement employmentStatusDropdown;
	
	public WebElement employmentTypeDropdown;
	
	public WebElement businessRoleDropdown;
	
	public WebElement jobTitleBox;
	
	public WebElement employerNameBox;
	
	public WebElement employerAddressName_NumberBox;
	
	public WebElement employerAddressStreetOneBox;
	
	public WebElement employerAddressStreetTwoBox;
	
	public WebElement employerAddressTownBox;
	
	public WebElement employerAddressCountyBox;
	
	public WebElement employerAddressPostcodeBox;
	
	public WebElement employerStartWorkingMonth;
	
	public WebElement employerStartWorkingYear;
	
	public WebElement employerPaymentFrequency;
	
	public void inputsortcodeA()
	{
		Random random = new Random();
		String input = Integer.toString(random.nextInt(90) + 10);
		sortcodeABox.sendKeys(input);
	}
	
	public void inputsortcodeB()
	{
		Random random = new Random();
		String input = Integer.toString(random.nextInt(90) + 10);
		sortcodeBBox.sendKeys(input);
	}
	
	public void inputsortcodeC()
	{
		Random random = new Random();
		String input = Integer.toString(random.nextInt(90) + 10);
		sortcodeCBox.sendKeys(input);
	}
	
	public void inputAccountNumber()
	{
		Random random = new Random();
		String input = Integer.toString(random.nextInt(90000000) + 10000000);
		accountNumberBox.sendKeys(input);
	}
	
	public void selectAccountAgeMonth()
	{
		Select month = new Select (accountAgeMonthsBox);
		month.selectByIndex(new Random().nextInt(month.getOptions().size() - 1) + 1);
	}
	
	public void selectAccountAgeYear()
	{
		Select year = new Select (accountAgeYearsBox);
		year.selectByIndex(new Random().nextInt(year.getOptions().size() - 4) + 4);
	}
	
	public void inputAccountDetails()
	{
		inputsortcodeA();
		inputsortcodeB();
		inputsortcodeC();
		inputAccountNumber();
		selectAccountAgeMonth();
		selectAccountAgeYear();
	}
	
	public void selectEmploymentStatus()
	{
		Select empStatus = new Select (employmentStatusDropdown);
		empStatus.selectByValue("E");
		
		WaitForElement.id("employmentDetails", driver);

		employmentTypeDropdown = driver.findElement(By.id("PrimaryApplicant_EmploymentType"));
		
		businessRoleDropdown = driver.findElement(By.id("PrimaryApplicant_OccupationRole"));
		
		jobTitleBox = driver.findElement(By.id("PrimaryApplicant_JobTitle"));
		
		employerNameBox = driver.findElement(By.id("PrimaryApplicant_EmployerName"));
		
		employerAddressName_NumberBox = driver.findElement(By.id("PrimaryApplicant_EmployerAddressHouseName"));
		
		employerAddressStreetOneBox = driver.findElement(By.id("PrimaryApplicant_EmployerAddressStreet"));
		
		employerAddressStreetTwoBox = driver.findElement(By.id("PrimaryApplicant_EmployerAddressVillageOrDistrict"));
		
		employerAddressTownBox = driver.findElement(By.id("PrimaryApplicant_EmployerAddressTown"));
		
		employerAddressCountyBox = driver.findElement(By.id("PrimaryApplicant_EmployerAddressCounty"));
		
		employerAddressPostcodeBox = driver.findElement(By.id("PrimaryApplicant_EmployerAddressPostcode"));
		
		employerStartWorkingMonth = driver.findElement(By.id("PrimaryApplicant_EmployerAddressStartWorkingMonth"));
		
		employerStartWorkingYear = driver.findElement(By.id("PrimaryApplicant_EmployerAddressStartWorkingYear"));
		
		employerPaymentFrequency = driver.findElement(By.id("PrimaryApplicant_HowOftenApplicantIsPaid"));
	}
	
	public void selectEmploymentType()
	{
		Select empType = new Select (employmentTypeDropdown);
		empType.selectByIndex(new Random().nextInt(empType.getOptions().size() - 1) + 1);
	}
	
	public void selectBusinessRole()
	{
		Select busRole = new Select (businessRoleDropdown);
		busRole.selectByIndex(new Random().nextInt(busRole.getOptions().size() - 1) + 1);
	}
	
	public void inputJobTitle(String jobTitle)
	{
		jobTitleBox.clear();
		jobTitleBox.sendKeys(jobTitle);
	}
	
	public void inputEmployersName(String employersName)
	{
		employerNameBox.clear();
		employerNameBox.sendKeys(employersName);
	}
	
	public void inputEmployersAddressNumber(String employersHouseNameNumber)
	{
		employerAddressName_NumberBox.clear();
		employerAddressName_NumberBox.sendKeys(employersHouseNameNumber);
	}
	
	public void inputEmployersAddressLineOne(String employersAddressLineOne)
	{
		employerAddressStreetOneBox.clear();
		employerAddressStreetOneBox.sendKeys(employersAddressLineOne);
	}
	
	public void inputEmployersAddressLineTwo(String employersAddressLineTwo)
	{
		employerAddressStreetTwoBox.clear();
		employerAddressStreetTwoBox.sendKeys(employersAddressLineTwo);
	}
	
	public void inputEmployersTown(String employersTown)
	{
		employerAddressTownBox.clear();
		employerAddressTownBox.sendKeys(employersTown);
	}
	
	public void inputEmployersCounty(String employersCounty)
	{
		employerAddressCountyBox.clear();
		employerAddressCountyBox.sendKeys(employersCounty);
	}
	
	public void inputEmployersPostcode(String employersPostcode)
	{
		employerAddressPostcodeBox.clear();
		employerAddressPostcodeBox.sendKeys(employersPostcode);
	}
	
	public void selectStartWorkingMonth()
	{
		Select month = new Select (employerStartWorkingMonth);
		month.selectByIndex(new Random().nextInt(month.getOptions().size() - 1) + 1);
	}
	
	public void selectStartWorkingYear()
	{
		Select year = new Select (employerStartWorkingYear);
		year.selectByIndex(new Random().nextInt(year.getOptions().size() - 1) + 1);
	}
	
	public void selectPaymentFrequency()
	{
		Select pay = new Select (employerPaymentFrequency);
		pay.selectByIndex(new Random().nextInt(pay.getOptions().size() - 1) + 1);
	}
	
	
	public void inputEmployerDetailsValid()
	{
		selectEmploymentStatus();
		selectEmploymentType();
		selectBusinessRole();
		inputJobTitle("jobTitle");
		inputEmployersName("employersName");
		inputEmployersAddressNumber("employersHouseNameNumber");
		inputEmployersAddressLineOne("employersAddressLineOne");
		inputEmployersAddressLineTwo("employersAddressLineTwo");
		inputEmployersTown("employersTown");
		inputEmployersCounty("employersCounty");
		inputEmployersPostcode("postcd");
		selectStartWorkingMonth();
		selectStartWorkingYear();
		selectPaymentFrequency();
		
	}
	
	
	
 	public Apply3FinancesPage()
	{
		super();
		WaitForElement.id("finances", driver);
		PageFactory.initElements(driver, this);
	}
	
}
