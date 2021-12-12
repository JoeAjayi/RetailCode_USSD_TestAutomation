package com.fbistech.SubDealer_TestCase;

import org.testng.annotations.Test;

import com.fbistech.SubDealer.Transaction_HistorySubDealer;
import com.fbistech.Utility.LaunchMobileUtility;

import io.appium.java_client.AppiumDriver;

public class Transaction_HistorySubDealer_TestCase {
	
	
	
	  AppiumDriver driver = LaunchMobileUtility.initializeMobileAndroidDriver();
	  
	  
		@Test(priority = 1)
		public void verifySubDealerCanCheckTransactionHistory() throws Exception
		{
			Transaction_HistorySubDealer subDealerCheckTransaction_History  = new  Transaction_HistorySubDealer (driver);
			String viewTransactionHistory = subDealerCheckTransaction_History.validateSubdealerCanView_TransactionHistory();
			System.out.println(viewTransactionHistory);
			Thread.sleep(19000);
		
		}
		

}
