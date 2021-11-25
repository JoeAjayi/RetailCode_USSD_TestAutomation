package com.fbistech.SubDealer_TestCase;

import org.testng.annotations.Test;

import com.fbistech.SubDealer.CheckWalletBalance;
import com.fbistech.Utility.LaunchMobileUtility;

import io.appium.java_client.android.AndroidDriver;

public class CheckWalletBalance_TestCase {
	
	


//	public CheckBalance_TestCase(AndroidDriver driver) {
//		super(driver);
//	}




	AndroidDriver driver = LaunchMobileUtility.initializeMobileAndroidDriver();

	
	
	

	@com.fbistech.Utility.JiraPolicy(logTicketReady = true)
	@Test(priority = 1)
	public void verifySubDealerCanCheckWalletBalance() throws Exception
	{
		
		CheckWalletBalance checkBalance = new CheckWalletBalance(driver);

		String getWalletBalanceText = checkBalance.subdealerCheckWalletBalance();
//		Assert.assertNull(getWalletBalanceText);
		System.out.println(getWalletBalanceText);
		
//		checkBalance.userCheckBalance(prop.getProperty("checkBalance"));
	}	
	
	
}
