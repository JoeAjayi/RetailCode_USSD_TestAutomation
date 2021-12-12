package com.fbistech.Retailer_TestCases;

import org.testng.annotations.Test;

import com.fbistech.BasePage.BasePage;
import com.fbistech.Retailer.CheckWalletBalance;
import com.fbistech.Utility.LaunchMobileUtility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class CheckWalletBalance_TestCase {
	
//	public CheckWalletBalance_TestCase(AndroidDriver driver) {
//		super(driver);
//	}




	AppiumDriver driver = LaunchMobileUtility.initializeMobileAndroidDriver();
	
	

	@Test
	public void verifyRetailelrCanCheckWalletBalance() throws Exception
	{
		CheckWalletBalance checkBalance = new CheckWalletBalance(driver);

		String getWalletBalanceText = checkBalance.validateRetailerCheckWalletBalance();
		System.out.println(getWalletBalanceText);
		
//		checkBalance.userCheckBalance(prop.getProperty("checkBalance"));
		
	}	
	
	
}
