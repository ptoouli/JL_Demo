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

	@When("^My details are (.*) (.*) (\\d+) (.*) (.*) (.*)$")
	public void iSelectACard(String firstName, String surname,String homePhoneNumber,String email, String post, String code) throws Throwable 
	{
		String postcode = post + " " + code;
	    CompleteApplyDetailsAll.apply(firstName, surname, homePhoneNumber, email, postcode);
	}

	@Then("^I have applied for a card$")
	public void iHaveAppliedForACard() throws Throwable 
	{
		Thread.sleep(5000);
		
	}

}
