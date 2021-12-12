package com.fbistech.Dealer_TestCase;

import org.testng.annotations.Test;

import com.fbistech.Dealer.VendAirtime_DealerToCustomer;
import com.fbistech.Dealer.VendAirtime_DealerToRetailer_NotOnDownLine;
import com.fbistech.Dealer.VendAirtime_DealerToRetailer_OnDownLine;
import com.fbistech.Dealer.VendAirtime_DealerToSubDealer_NotOnDownLine;
import com.fbistech.Utility.LaunchMobileUtility;

import io.appium.java_client.AppiumDriver;

public class VendAirtime_TestCase {
	
	
	
	AppiumDriver driver = LaunchMobileUtility.initializeMobileAndroidDriver();

	

	@Test(priority = 1)
	public void verifyDealerCannotVendAirtimeToCustomer() throws Exception
	{
		VendAirtime_DealerToCustomer dealerVendAirtimeToCustomer = new VendAirtime_DealerToCustomer(driver);
		
		String getWalletBalanceText = dealerVendAirtimeToCustomer.validateDealerVendAirtimeToCustomer();
		System.out.println(getWalletBalanceText);		
		Thread.sleep(19000);
	}


	@Test(priority = 2)
	public void verifyDealerCannotVendAirtimeToRetailer_NotOnDownLine() throws Exception
	{
		VendAirtime_DealerToRetailer_NotOnDownLine dealerVendAirtimeToRetailer_NotOnDownLine = new VendAirtime_DealerToRetailer_NotOnDownLine(driver);
		
		String getWalletBalanceText = dealerVendAirtimeToRetailer_NotOnDownLine.validateDealerVendAirtimeToRetailer_NotOnDownline();
		System.out.println(getWalletBalanceText);		
		Thread.sleep(19000);
	}
	
	
	@Test(priority = 3)
	public void verifyDealerCannotVendAirtimeToRetailer_OnDownLine() throws Exception
	{
		VendAirtime_DealerToRetailer_OnDownLine dealerVendAirtimeToRetailer_OnDownLine = new VendAirtime_DealerToRetailer_OnDownLine(driver);
		
		String getWalletBalanceText = dealerVendAirtimeToRetailer_OnDownLine.validateDealerVendAirtimeToRetailer_OnDownline();
		System.out.println(getWalletBalanceText);		
		Thread.sleep(19000);
	}
	
	
	@Test(priority = 4)
	public void verifyDealerCannotVendAirtimeToSubdealer_NotOnDownLine() throws Exception
	{
		VendAirtime_DealerToSubDealer_NotOnDownLine dealerVendAirtimeToubdeale_NotOnDownLine = new VendAirtime_DealerToSubDealer_NotOnDownLine(driver);
		
		String getWalletBalanceText = dealerVendAirtimeToubdeale_NotOnDownLine.validateDealerVendAirtimeToSubdealer_NotOnDownline();
		System.out.println(getWalletBalanceText);		
		Thread.sleep(19000);
	}
	
	
	@Test(priority = 5)
	public void verifyDealerCannotVendAirtimeToSubdealer_OnDownLine() throws Exception
	{
		VendAirtime_DealerToSubDealer_NotOnDownLine dealerVendAirtimeToubdeale_NotOnDownLine = new VendAirtime_DealerToSubDealer_NotOnDownLine(driver);
		
		String getWalletBalanceText = dealerVendAirtimeToubdeale_NotOnDownLine.validateDealerVendAirtimeToSubdealer_NotOnDownline();
		System.out.println(getWalletBalanceText);		
		Thread.sleep(19000);
	}
	
	
	
	

}
