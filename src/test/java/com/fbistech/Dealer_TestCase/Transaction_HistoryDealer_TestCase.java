package com.fbistech.Dealer_TestCase;

import org.testng.annotations.Test;

import com.fbistech.Dealer.Transaction_HistoryDealer;
import com.fbistech.Utility.LaunchMobileUtility;

import io.appium.java_client.AppiumDriver;

public class Transaction_HistoryDealer_TestCase {
	

	  AppiumDriver driver = LaunchMobileUtility.initializeMobileAndroidDriver();
	  
	  
		@Test(priority = 1)
		public void verifybDealerCanCheckTransactionHistory() throws Exception
		{
			Transaction_HistoryDealer dealerCheckTransaction_History  = new  Transaction_HistoryDealer (driver);
			String viewTransactionHistory = dealerCheckTransaction_History.validateDealerCanView_TransactionHistory();
			System.out.println(viewTransactionHistory);
			Thread.sleep(19000);
		
		}
		


}
