package com.fbistech.Dealer_TestCase;

import org.testng.annotations.Test;

import com.fbistech.SubDealer.Retrieve_Retailcode;
import com.fbistech.Utility.LaunchMobileUtility;

import io.appium.java_client.AppiumDriver;

public class Retrieve_Retailcode_TestCase {
	
	
	AppiumDriver driver = LaunchMobileUtility.initializeMobileAndroidDriver();
	

	@com.fbistech.Utility.JiraPolicy(logTicketReady = true)
	@Test(priority = 1)
	public void verifySubDealerCanRetrieve_Retailcode() throws Exception
	{
		
		Retrieve_Retailcode retrieveRetailcode = new Retrieve_Retailcode(driver);

		String retrieveSubdealerRetailcode = retrieveRetailcode.validateSubdealerRetrieve_Retailcode();
//		Assert.assertNull(getWalletBalanceText);
		System.out.println(retrieveSubdealerRetailcode);
		
//		checkBalance.userCheckBalance(prop.getProperty("checkBalance"));
	}	

}
