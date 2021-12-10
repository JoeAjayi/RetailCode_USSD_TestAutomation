package com.fbistech.SubDealer_TestCase;

import org.testng.annotations.Test;

import com.fbistech.SubDealer.DirectFunding_SubDealerToRetailer_SubdealerDownline;
import com.fbistech.SubDealer.DirectFunding_SubDealerToRetailer_UnderDealer;
import com.fbistech.SubDealer.FundRecallSubDealer_To_RetailerUnderDealer;
import com.fbistech.SubDealer.FundRecallSubDealer_To_RetailerUnderSubDealer;
import com.fbistech.Utility.LaunchMobileUtility;

import io.appium.java_client.AppiumDriver;

public class FundRecall_TestCase {

    AppiumDriver driver = LaunchMobileUtility.initializeMobileAndroidDriver();
	
	
//	AppiumDriver driver = LaunchSamsungMobileUtilit.initializeMobileAndroidDriver();
	
	
	
	
	@Test(priority = 1) 
	public void verifySubDealerCanFund_RetailerUnderDealer()throws Exception
	{
		DirectFunding_SubDealerToRetailer_UnderDealer subDealerFundRetailer_UnderDealer = new DirectFunding_SubDealerToRetailer_UnderDealer(driver);
		String fundToRetailer_Dealer = subDealerFundRetailer_UnderDealer.validateSubdealerFundRetailer_UnderDealer();
//		System.out.println("Sub-dealer to Retailer under dealer Fund transfer was" + "\n" + fundToRetailer_Dealer);
		System.out.println(fundToRetailer_Dealer);
		Thread.sleep(19000);
	}
	

    
    
	@Test(priority = 2)
	public void verifySubDealerCanRecallFund_from_RetailerUnderDealer()throws Exception
	{
		FundRecallSubDealer_To_RetailerUnderDealer subdealerRecallFund_from_R_D = new FundRecallSubDealer_To_RetailerUnderDealer(driver);
		String fundRecallFromRetailer_Dealer = subdealerRecallFund_from_R_D.validateSubdealerRecallFund_from_RetailerUnderDealer();
//		System.out.println("Sub-dealer to Retailer under dealer Fund Recall was" + "\n" + fundRecallFromRetailer_Dealer);
		System.out.println(fundRecallFromRetailer_Dealer);
		Thread.sleep(19000);
	}
	
	
	
	
	
    
//    @Test(priority = 3) 
//	public void verifySubDealerCanFund_from_RetailerUnderSubDealer()throws Exception
//	{
//    	 DirectFunding_SubDealerToRetailer_SubdealerDownline subDealerFundRetailer_UnderSubDealer = new  DirectFunding_SubDealerToRetailer_SubdealerDownline(driver);
//		String fundToRetailer_Subdealer = subDealerFundRetailer_UnderSubDealer.validateSubdealerFundRetailer_SubDealerDownline();
//		System.out.println(fundToRetailer_Subdealer);
//		Thread.sleep(19000);
//	}
//	
//
//    
//    
//	@Test(priority = 4)
//	public void verifySubDealerCanRecallFund_from_RetailerUnderSubDealer()throws Exception
//	{
//		FundRecallSubDealer_To_RetailerUnderSubDealer subdealerRecallFund_from_R_D = new FundRecallSubDealer_To_RetailerUnderSubDealer(driver);
//		String fundRecallFromRetailer_Subdealer = subdealerRecallFund_from_R_D.validateSubdealerRecallFund_from_RetailerUndeSubDealer();
//		System.out.println(fundRecallFromRetailer_Subdealer);
//		Thread.sleep(19000);
//	}
    
    
	
}
