package com.fbistech.SubDealer_TestCase;

import org.testng.annotations.Test;

import com.fbistech.SubDealer.ApproveCustomerRechargeLaterRequest_SubDealer;
import com.fbistech.Utility.LaunchMobileUtility;

import io.appium.java_client.AppiumDriver;

public class ApproveCustomerRechargeLaterRequest_SubDealer_TestCase {
	
	
	AppiumDriver driver = LaunchMobileUtility.initializeMobileAndroidDriver();
	  
	  
	@Test(priority = 1)
	public void verifySubDealerCanCheckTransactionHistory() throws Exception
	{
		ApproveCustomerRechargeLaterRequest_SubDealer subdealer_ApproveCustomerRechargeLaterRequest = new  ApproveCustomerRechargeLaterRequest_SubDealer (driver);
		String subdealer_ApproveRechargeLaterRequest = subdealer_ApproveCustomerRechargeLaterRequest.validateSubdealerApproveCustomerRechargeLaterRequest();
		System.out.println(subdealer_ApproveRechargeLaterRequest);
		Thread.sleep(19000);
	}
		

}
