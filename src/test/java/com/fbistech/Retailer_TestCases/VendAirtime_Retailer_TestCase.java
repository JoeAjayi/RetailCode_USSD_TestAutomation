package com.fbistech.Retailer_TestCases;

import org.testng.annotations.Test;

import com.fbistech.Retailer.VendAirtime_RetailerToCustomer;
import com.fbistech.Retailer.VendAirtime_RetailerToDealer_NotUpline;
import com.fbistech.Retailer.VendAirtime_RetailerToDealer_Upline;
import com.fbistech.Retailer.VendAirtime_RetailerToRetailer;
import com.fbistech.Retailer.VendAirtime_RetailerToSubDealer_NotUpline;
import com.fbistech.Retailer.VendAirtime_RetailerToSubDealer_Upline;
import com.fbistech.Utility.LaunchMobileUtility;

import io.appium.java_client.android.AndroidDriver;

public class VendAirtime_Retailer_TestCase {
	 
	
AndroidDriver driver = LaunchMobileUtility.getAndroidDriver();

	
	
	 
	
	@Test(priority = 1)
	public void verifyRetailerCanVendAirtimeToCustomer() throws Exception
	{
		VendAirtime_RetailerToCustomer retailerVendAirtime_Customer = new VendAirtime_RetailerToCustomer(driver);
		retailerVendAirtime_Customer.retailerVendAirtimeToCustomer();
		Thread.sleep(19000);
	}
	 
	
//	@Test(priority = 2)
	public void verifyRetailerCanVendAirtimeToDealer_NotUpline() throws Exception
	{
		VendAirtime_RetailerToDealer_NotUpline retailerVendAirtimeToDealer_NotUpline = new VendAirtime_RetailerToDealer_NotUpline(driver);
		retailerVendAirtimeToDealer_NotUpline.retailerVendAirtimeTo_DealerNotUpline();
		Thread.sleep(19000);

	}
	
//	@Test(priority = 3)
	public void verifyRetailerCanVendAirtimeToDealer_Upline() throws Exception
	{
		VendAirtime_RetailerToDealer_Upline retailerVendAirtimeToDealer_Upline = new VendAirtime_RetailerToDealer_Upline(driver);
		retailerVendAirtimeToDealer_Upline.retailerVendAirtimeTo_DealerUpline();
		Thread.sleep(19000);

	}
	
//	@Test(priority = 4)
	public void verifyRetailerCanVendAirtimeToRetailer() throws Exception
	{
		VendAirtime_RetailerToRetailer retailerVendAirtimeToRetailer = new VendAirtime_RetailerToRetailer(driver);
		retailerVendAirtimeToRetailer.retailerVendAirtimeTo_Retailer();
		Thread.sleep(19000);

	}
	
	
//	@Test(priority = 5)
	public void verifyRetailerCanVendAirtime_SubDealerNotUpline() throws Exception
	{
		VendAirtime_RetailerToSubDealer_NotUpline retailerVendAirtimeToSubDealer_NotUpline = new VendAirtime_RetailerToSubDealer_NotUpline(driver);
		retailerVendAirtimeToSubDealer_NotUpline.retailerVendAirtimeTo_SubdealerNotUpline();
		Thread.sleep(19000);

	}
	
	
//	@Test(priority = 6)
	public void verifyRetailerCanVendAirtime_SubDealerUpline() throws Exception
	{
		VendAirtime_RetailerToSubDealer_Upline retailerVendAirtimeToSubDealer_Upline = new VendAirtime_RetailerToSubDealer_Upline(driver);
		retailerVendAirtimeToSubDealer_Upline.retailerVendAirtimeTo_SubdealerUpline();
		Thread.sleep(19000);

	}
	
	
	
	
	

}
