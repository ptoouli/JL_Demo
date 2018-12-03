package helpers;

import pages.Apply3FinancesPage;

public class CompleteApply3 
{

	public static void apply()
	{
		Apply3FinancesPage apply3financepage = new Apply3FinancesPage();
		apply3financepage.inputAccountDetails();
		apply3financepage.inputEmployerDetailsValid();
	}
	
}
