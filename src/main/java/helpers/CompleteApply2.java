package helpers;

import pages.Apply2AddressDetailsPage;
import utilities.WaitForElement;

public class CompleteApply2 {

	public static void apply(String postcode)
	{
		Apply2AddressDetailsPage apply2addressdetailspage = new Apply2AddressDetailsPage();
		apply2addressdetailspage.inputPostcode(postcode);
		apply2addressdetailspage.findAddress.click();
		apply2addressdetailspage.selectAddress();
		apply2addressdetailspage.completeResidentialStatusValid();
	}
	
}
