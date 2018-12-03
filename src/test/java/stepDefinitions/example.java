package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.CompleteApplyDetailsAll;
import pages.ApplyInitialPage;
import pages.BasePage;

public class example
{
	
	@Given("^I am a new user applying for a (.*) card$")//I have 
	public void iAmANewUser(String colour) throws Throwable 
	{
		BasePage.applyNowPartnershipCardDropDown_ApplyNow();
		ApplyInitialPage applyinitialpage = new ApplyInitialPage();
	    applyinitialpage.applyForNewCard(colour);
	}

	@When("^My details are (\\d+) (.*)$")
	public void iSelectACard(String homePhoneNumber,String email) throws Throwable 
	{
		CompleteApplyDetailsAll.apply(homePhoneNumber, email);
	}

	@Then("^I have applied for a card$")
	public void iHaveAppliedForACard() throws Throwable 
	{
		Thread.sleep(2000);
		
	}

}
