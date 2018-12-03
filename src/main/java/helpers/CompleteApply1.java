package helpers;

import pages.Apply1AboutYouPage;

public class CompleteApply1 {

	
	public static void apply(String firstName, String surname,String homePhoneNumber,String email)
	{
		Apply1AboutYouPage apply1aboutyoupage = new Apply1AboutYouPage();
		apply1aboutyoupage.completeMandatoryDetailsValid(firstName, surname, homePhoneNumber, email);
	}
}
