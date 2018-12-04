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
	
	@FindBy(id="PrimaryApplicant_GrossAnnualIncome")
	public WebElement grossAnnualIncomeBox;
	@FindBy(id="PrimaryApplicant_PartnerGrossAnnualIncome")
	public WebElement partnerGrossAnnualIncomeBox;
	@FindBy(css="#incomeAndOutgoings > div:nth-child(8) > div:nth-child(1) > div:nth-child(4) > a:nth-child(2)")
	public WebElement foreseeAnyChangesNoButton;
	@FindBy(css="#incomeAndOutgoings > div:nth-child(8) > div:nth-child(3) > div:nth-child(4) > a:nth-child(2) > span:nth-child(1) > label:nth-child(2)")
	public WebElement internationalTransfersNoButton;
	@FindBy(id="PrimaryApplicant_HowMuchCashWillTransferToYourPartnershipCardEachMonth")
	public WebElement howMuchBalancePayCashEachMonthBox;
	@FindBy(id="PrimaryApplicant_HowMuchCashPlanToWithdrawFromYourPartnershipCardEachMonth")
	public WebElement howMuchCashWithdrawalEachMonthBox;
	@FindBy(css="#incomeAndOutgoings > div:nth-child(8) > div:nth-child(7) > div:nth-child(4) > a:nth-child(2) > span:nth-child(1) > label:nth-child(2)")
	public WebElement anyoneElseFundingPartnershipCardEachMonthNo;
	@FindBy(id="continue_finances")
	public WebElement continueButton;
	
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
		//Random random = new Random();
		//String input = Integer.toString(random.nextInt(90) + 10);
		String input = "77";
		sortcodeABox.sendKeys(input);
	}
	
	public void inputsortcodeB()
	{
		//Random random = new Random();
		//String input = Integer.toString(random.nextInt(90) + 10);
		String input = "49";
		sortcodeBBox.sendKeys(input);
	}
	
	public void inputsortcodeC()
	{
		//Random random = new Random();
		//String input = Integer.toString(random.nextInt(90) + 10);
		String input = "26";
		sortcodeCBox.sendKeys(input);
	}
	
	public void inputAccountNumber()
	{
		//Random random = new Random();
		//String input = Integer.toString(random.nextInt(90000000) + 10000000);
		String input = "38898768";
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
		Sleep.sleep();
		inputsortcodeB();
		Sleep.sleep();
		inputsortcodeC();
		Sleep.sleep();
		inputAccountNumber();
		Sleep.sleep();
		selectAccountAgeMonth();
		Sleep.sleep();
		selectAccountAgeYear();
		Sleep.sleep();
	}
	
	public void selectEmploymentStatusE()
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
		new Select (businessRoleDropdown).selectByValue("E");
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
	
	public void inputEmployersPostcode()
	{
		employerAddressPostcodeBox.clear();
		String employersPostcode = ConfigFileReader.getRandomPostcode();
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
		selectEmploymentStatusE();
		Sleep.sleep();
		selectEmploymentType();
		Sleep.sleep();
		selectBusinessRole();
		Sleep.sleep();
		inputJobTitle("jobTitle");
		Sleep.sleep();
		inputEmployersName("employersName");
		Sleep.sleep();
		inputEmployersAddressNumber("employersHouseNameNumber");
		Sleep.sleep();
		inputEmployersAddressLineOne("employersAddressLineOne");
		Sleep.sleep();
		inputEmployersAddressLineTwo("employersAddressLineTwo");
		Sleep.sleep();
		inputEmployersTown("employersTown");
		Sleep.sleep();
		inputEmployersCounty("employersCounty");
		Sleep.sleep();
		inputEmployersPostcode();
		Sleep.sleep();
		selectStartWorkingMonth();
		Sleep.sleep();
		selectStartWorkingYear();
		Sleep.sleep();
		selectPaymentFrequency();
		Sleep.sleep();
		
	}
	
	public void selectEmploymentStatusS()
	{
		Select empStatus = new Select (employmentStatusDropdown);
		empStatus.selectByValue("S");	
		
		try 
		{
			Thread.sleep(1500);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		empStatus.selectByValue("E");	
		
		try 
		{
			Thread.sleep(1500);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		empStatus.selectByValue("S");
	}
	
	public void inputIncome()
	{
		grossAnnualIncomeBox.clear();
		grossAnnualIncomeBox.sendKeys("30000");
	}
	
	public void inputPartnerIncome()
	{
		partnerGrossAnnualIncomeBox.clear();
		partnerGrossAnnualIncomeBox.sendKeys("30000");
	}
	
	public void selectForeseenChanges()
	{
		foreseeAnyChangesNoButton.click();
	}
	
	public void selectInternationalPayment()
	{
		internationalTransfersNoButton.click();
	}
	
	public void inputPayOffCash()
	{
		howMuchBalancePayCashEachMonthBox.clear();
		howMuchBalancePayCashEachMonthBox.sendKeys("0");
	}
	
	public void inputCashWithdrawal()
	{
		howMuchCashWithdrawalEachMonthBox.clear();
		howMuchCashWithdrawalEachMonthBox.sendKeys("0");
	}
	
	public void selectOtherFunding()
	{
		anyoneElseFundingPartnershipCardEachMonthNo.click();
	}

	public void inputAllIncomeAndOutgoings()
	{
		inputIncome();
		Sleep.sleep();
		inputPartnerIncome();
		Sleep.sleep();
		selectForeseenChanges();
		Sleep.sleep();
		selectInternationalPayment();
		Sleep.sleep();
		inputPayOffCash();
		Sleep.sleep();
		inputCashWithdrawal();
		Sleep.sleep();
		selectOtherFunding();
		Sleep.sleep();
		continueButton.click();
	}
	
 	public Apply3FinancesPage()
	{
		super();
		WaitForElement.id("finances", driver);
		PageFactory.initElements(driver, this);
	}
	
}
