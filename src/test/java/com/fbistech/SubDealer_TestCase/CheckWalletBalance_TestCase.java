package com.fbistech.SubDealer_TestCase;

import org.testng.annotations.Test;

import com.fbistech.SubDealer.CheckWalletBalance;
import com.fbistech.Utility.LaunchMobileUtility;

import io.appium.java_client.android.AndroidDriver;

public class CheckWalletBalance_TestCase {
	
	
	
//	public CheckBalance_TestCase(AndroidDriver driver) {
//		super(driver);
//	}




	AndroidDriver driver = LaunchMobileUtility.getAndroidDriver();

	
	

	@Test
	public void verifySubDealerCanCheckWalletBalance() throws Exception
	{
		
		CheckWalletBalance checkBalance = new CheckWalletBalance(driver);

		String getWalletBalanceText = checkBalance.subdealerCheckWalletBalance();
		System.out.println(getWalletBalanceText);
		
//		checkBalance.userCheckBalance(prop.getProperty("checkBalance"));
	}	
	
	
}
