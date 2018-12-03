package helpers;

public class CompleteApplyDetailsAll {

	public static void apply(String firstName, String surname,String homePhoneNumber,String email, String postcode)
	{
		CompleteApply1.apply(firstName, surname, homePhoneNumber, email);
		CompleteApply2.apply(postcode);
		CompleteApply3.apply();
	}
	
	
}
