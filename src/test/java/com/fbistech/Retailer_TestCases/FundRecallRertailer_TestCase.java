package com.fbistech.Retailer_TestCases;

import org.testng.annotations.Test;

import com.fbistech.SubDealer.DirectFunding_SubDealerToSubDealer_OnSameDealer;
import com.fbistech.SubDealer.FundRecallSubDealer_To_SubDealerOnSameDealer;
import com.fbistech.Utility.LaunchMobileUtility;

import io.appium.java_client.AppiumDriver;

public class FundRecallRertailer_TestCase {

    AppiumDriver driver = LaunchMobileUtility.initializeMobileAndroidDriver();
	
	
//	AppiumDriver driver = LaunchSamsungMobileUtilit.initializeMobileAndroidDriver();
	
	

    
    
//	@Test(priority = 1)
//	public void verifySubDealerCanRecallFund_from_RetailerUnderDealer()throws Exception
//	{
//		DirectFunding_SubDealerToRetailer_UnderDealer subDealerFundRetailer_UnderDealer = new DirectFunding_SubDealerToRetailer_UnderDealer(driver);
//		String fundToRetailer_Dealer = subDealerFundRetailer_UnderDealer.validateSubdealerFundRetailer_UnderDealer();
//		System.out.println(fundToRetailer_Dealer);
//		Thread.sleep(19000);
//		
//		FundRecallSubDealer_To_RetailerUnderDealer subdealerRecallFund_from_R_D = new FundRecallSubDealer_To_RetailerUnderDealer(driver);
//		String fundRecallFromRetailer_Dealer = subdealerRecallFund_from_R_D.validateSubdealerRecallFund_from_RetailerUnderDealer();
//		System.out.println(fundRecallFromRetailer_Dealer);
//		Thread.sleep(19000);
//	}
	
	
	

	

    
    
//	@Test(priority = 2)
//	public void verifySubDealerCanRecallFund_from_RetailerOnSubDealerDownline()throws Exception
//	{
//		DirectFunding_SubDealerToRetailer_SubdealerDownline subDealerFundRetailer_UnderSubDealer = new  DirectFunding_SubDealerToRetailer_SubdealerDownline(driver);
//		String fundToRetailer_Subdealer = subDealerFundRetailer_UnderSubDealer.validateSubdealerFundRetailer_SubDealerDownline();
//		System.out.println(fundToRetailer_Subdealer);
//		Thread.sleep(19000);
//		
//		
//		FundRecallSubDealer_To_RetailerUnderSubDealer subdealerRecallFund_from_R_D = new FundRecallSubDealer_To_RetailerUnderSubDealer(driver);
//		String fundRecallFromRetailer_Subdealer = subdealerRecallFund_from_R_D.validateSubdealerRecallFund_from_RetailerUndeSubDealer();
//		System.out.println(fundRecallFromRetailer_Subdealer);
//		Thread.sleep(19000);
//	}

    
    
	    
	    
		@Test(priority = 3)
		public void verifySubDealerCanRecallFund_from_SubdealerOnSameDealer()throws Exception
		{
			DirectFunding_SubDealerToSubDealer_OnSameDealer subDealerFundSubdealer_OnSameDealer = new DirectFunding_SubDealerToSubDealer_OnSameDealer(driver);
			String fundToSubdealer_SameDealer = subDealerFundSubdealer_OnSameDealer.validateSubdealerFundSubdealer_OnSameDealer();
			System.out.println(fundToSubdealer_SameDealer);
			Thread.sleep(19000);
			
			FundRecallSubDealer_To_SubDealerOnSameDealer subdealerRecallFund_from_Subdealer_Dealer = new FundRecallSubDealer_To_SubDealerOnSameDealer(driver);
			String fundRecallFromRetailer_Subdealer = subdealerRecallFund_from_Subdealer_Dealer.validateSubdealerRecallFund_from_SubDealer();
			System.out.println(fundRecallFromRetailer_Subdealer);
			Thread.sleep(19000);
		}
	
	
	
    
    
	
}
