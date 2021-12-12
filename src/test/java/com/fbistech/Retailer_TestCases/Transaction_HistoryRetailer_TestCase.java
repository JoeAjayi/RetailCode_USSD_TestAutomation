package com.fbistech.Retailer_TestCases;

import org.testng.annotations.Test;

import com.fbistech.Retailer.Transaction_HistoryRetailer;
import com.fbistech.Utility.LaunchMobileUtility;

import io.appium.java_client.AppiumDriver;

public class Transaction_HistoryRetailer_TestCase {
	
	AppiumDriver driver = LaunchMobileUtility.initializeMobileAndroidDriver();
	  
	  
	@Test(priority = 1)
	public void verifyRetailerCanCheckTransactionHistory() throws Exception
	{
		Transaction_HistoryRetailer retailerCheckTransaction_History  = new  Transaction_HistoryRetailer (driver);
		String viewTransactionHistory = retailerCheckTransaction_History.validateRetailerCanView_TransactionHistory();
		System.out.println(viewTransactionHistory);
		Thread.sleep(19000);
	
	}
	

}
