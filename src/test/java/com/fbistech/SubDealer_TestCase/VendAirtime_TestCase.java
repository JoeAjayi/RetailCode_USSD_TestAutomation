package com.fbistech.SubDealer_TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fbistech.SubDealer.VendAirtime_SubDealerToCustomer;
import com.fbistech.SubDealer.VendAirtime_SubDealerToDealer_NotUpline;
import com.fbistech.SubDealer.VendAirtime_SubDealerToDealer_Upline;
import com.fbistech.SubDealer.VendAirtime_SubDealerToRetailer_Downline;
import com.fbistech.SubDealer.VendAirtime_SubDealerToRetailer_NotDownline;
import com.fbistech.SubDealer.VendAirtime_SubDealerToSubDealer_NotSameUpline;
import com.fbistech.SubDealer.VendAirtime_SubDealerToSubDealer_SameUpline;
import com.fbistech.Utility.LaunchMobileUtility;

import io.appium.java_client.android.AndroidDriver;

public class VendAirtime_TestCase {
 
	 
	AndroidDriver driver = LaunchMobileUtility.getAndroidDriver();

	
	

	@Test(priority = 1)
	public void verifySubDealerCanVendAirtimeToCustomer() throws Exception
	{
		VendAirtime_SubDealerToCustomer subdealerVendAirtimeToCustomer = new VendAirtime_SubDealerToCustomer(driver);
		
		String getWalletBalanceText = subdealerVendAirtimeToCustomer.validateSubdealerVendAirtimeTo_Customer();
		System.out.println(getWalletBalanceText);
		Thread.sleep(19000);

	}  
	 
	
	@Test(priority = 2)
	public void verifySubDealerCanVendAirtimeToDealer_NotUpline() throws Exception
	{
		VendAirtime_SubDealerToDealer_NotUpline subDealerVendAirtimeDealerNotUpline = new VendAirtime_SubDealerToDealer_NotUpline(driver);
		
		String getWalletBalanceText = subDealerVendAirtimeDealerNotUpline.validateSubdealerVendAirtimeToDealer_NotUpline();
		System.out.println(getWalletBalanceText);
		Thread.sleep(19000);
	}
	
	
	@Test(priority = 3)
	public void verifySubDealerCanVendAirtimeToDealer_Upline() throws Exception
	{
		VendAirtime_SubDealerToDealer_Upline subDealerVendAirtimeToDealerUpline = new VendAirtime_SubDealerToDealer_Upline(driver);
		
		String getWalletBalanceText = subDealerVendAirtimeToDealerUpline.validateSubdealerVendAirtimeToDealer_Upline();
		System.out.println(getWalletBalanceText);
		Thread.sleep(19000);
	}
	
	
		 
	@Test(priority = 4)
	public void verifySubDealerCanVendAirtimeToRetailer_OnDownline() throws Exception
	{
		VendAirtime_SubDealerToRetailer_Downline subdealerVendAirtimeToRetailerDownline = new VendAirtime_SubDealerToRetailer_Downline(driver);
		
		String getWalletBalanceText = subdealerVendAirtimeToRetailerDownline.validateSubdealerVendAirtimeToRetailer_OnDownline();
		System.out.println(getWalletBalanceText);
		Thread.sleep(19000);
	}
	
	
	@Test(priority = 5)
	public void verifySubDealerCanVendAirtimeToRetailer_NotDownline() throws Exception
	{
		VendAirtime_SubDealerToRetailer_NotDownline subDealerVendAirtimeToRetailerNotDownline = new VendAirtime_SubDealerToRetailer_NotDownline(driver);
	
		String getWalletBalanceText = subDealerVendAirtimeToRetailerNotDownline.validateSubdealerVendAirtimeToRetailer_NotOnDownline();
		System.out.println(getWalletBalanceText);
		Thread.sleep(19000);
	}
	
	
	
	@Test(priority = 6)
	public void verifySubDealerCanVendAirtimeToSubDealer_NotSameUpline() throws Exception
	{		
		VendAirtime_SubDealerToSubDealer_NotSameUpline subDealerVendAirtimeToSubDealerNotSameUpline = new VendAirtime_SubDealerToSubDealer_NotSameUpline(driver);
		
		
		String getWalletBalanceText = subDealerVendAirtimeToSubDealerNotSameUpline.validateSubdealerVendAirtimeToSubDealer_NotSameUpline();
		System.out.println(getWalletBalanceText);
		
		
//		Assert.assertEquals(getWalletBalanceText, "Invalid USSD code.");
		Thread.sleep(19000);

	}

	
	
	
	@Test(priority = 7)
	public void verifySubDealerCanVendAirtimeToSubDealer_SameUpline() throws Exception
	{
		VendAirtime_SubDealerToSubDealer_SameUpline subDealerVendAirtimeToSubDealer_SameUpline = new VendAirtime_SubDealerToSubDealer_SameUpline(driver);
		String getWalletBalanceText = subDealerVendAirtimeToSubDealer_SameUpline.subdealerVendAirtimeToSubdealer_SameUpline();
		System.out.println(getWalletBalanceText);
		
//		Assert.assertEquals(vendAirtimeSuccess_PopUp, "Invalid USSD code.");
		Thread.sleep(19000);

	}

	
	
	
	
}
