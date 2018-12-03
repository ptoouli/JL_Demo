package helpers;

import pages.Apply2AddressDetailsPage;
import utilities.WaitForElement;

public class CompleteApply2 {

	public static void apply()
	{
		Apply2AddressDetailsPage apply2addressdetailspage = new Apply2AddressDetailsPage();
		apply2addressdetailspage.inputPostcode();
		apply2addressdetailspage.findAddress.click();
		apply2addressdetailspage.selectAddress();
		apply2addressdetailspage.completeResidentialStatusValid();
	}
	
}
