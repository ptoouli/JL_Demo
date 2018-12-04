package helpers;

public class CompleteApplyDetailsAll {

	public static void apply(String homePhoneNumber,String email)
	{
		CompleteApply1.apply(homePhoneNumber, email);
		CompleteApply2.apply();
		CompleteApply3.apply();
		CompleteApply4.apply();
	}
	
	public static void applyStudent()
	{
		String homePhoneNumber, email;
		homePhoneNumber = "01234567890";
		email = "student@studentemail.com";
		CompleteApply1.apply(homePhoneNumber, email);
		CompleteApply2.apply();
		CompleteApply3.applyStudent();
		CompleteApply4.apply();
	}
	
	
}
