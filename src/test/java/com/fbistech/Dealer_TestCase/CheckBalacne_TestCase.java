package com.fbistech.Dealer_TestCase;

import org.testng.annotations.Test;

import com.fbistech.BasePage.BasePage;
import com.fbistech.Dealer.CheckBalance;
import com.fbistech.Utility.LaunchMobileUtility;

import io.appium.java_client.android.AndroidDriver;

public class CheckBalacne_TestCase {
	
//	public CheckBalacne_TestCase(AndroidDriver driver) {
//		super(driver);
//	}


 

	AndroidDriver driver = LaunchMobileUtility.getAndroidDriver();

	
	

	@Test
	public void verifyDealerCanChecWalletkBalance() throws Exception
	{
		
		CheckBalance dealerCheck_Balance = new CheckBalance(driver);
		
		String getWalletBalanceText = dealerCheck_Balance.dealerCheckWalletBalance();
		System.out.println(getWalletBalanceText);

		
		
	
//		checkBalance.userCheckBalance(prop.getProperty("checkBalance"));
		
	}	
	
	
}
