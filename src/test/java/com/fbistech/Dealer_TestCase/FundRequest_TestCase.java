package com.fbistech.Dealer_TestCase;

import org.testng.annotations.Test;

import com.fbistech.Dealer.FundRequest_Dealer;
import com.fbistech.Utility.LaunchMobileUtility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class FundRequest_TestCase {

	AppiumDriver driver = LaunchMobileUtility.initializeMobileAndroidDriver();

	
	
	
	@Test(priority = 1)
	public void verifyDealerCannotInitiateRequestFund() throws Exception
	{
		FundRequest_Dealer DealerRequestFund = new FundRequest_Dealer(driver);
		
		String getWalletBalanceText = DealerRequestFund.validateDealerFundRequest();
		System.out.println(getWalletBalanceText);		
		Thread.sleep(19000);
	}
	
}
