package com.fbistech.SubDealer_TestCase;

import org.testng.annotations.Test;

import com.fbistech.SubDealer.FundRequest_SubDelerToDealer;
import com.fbistech.Utility.LaunchMobileUtility;

import io.appium.java_client.android.AndroidDriver;

public class FundRequest_TestCase {
	
	

	AndroidDriver driver = LaunchMobileUtility.getAndroidDriver();

	

	

	@Test(priority = 1)

	public void verifySubDealerCanRequestFund()throws Exception
	{
		FundRequest_SubDelerToDealer subdelerRequestFundFromDealer = new FundRequest_SubDelerToDealer(driver);
		
		String getWalletBalanceText = subdelerRequestFundFromDealer.validateSubdealerRequestFundFromDealer();
		System.out.println(getWalletBalanceText);		

	}
	
	

}
