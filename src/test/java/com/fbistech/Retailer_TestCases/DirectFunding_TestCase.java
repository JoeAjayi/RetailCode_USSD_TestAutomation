 package com.fbistech.Retailer_TestCases;

import org.testng.annotations.Test;

import com.fbistech.Retailer.DirectFunding_RetailerToDealer_NotUpLine;
import com.fbistech.Retailer.DirectFunding_RetailerToDealer_Upline;
import com.fbistech.Retailer.DirectFunding_RetailerToRetailer_NotSameUpline;
import com.fbistech.Retailer.DirectFunding_RetailerToRetailer_SameUpline;
import com.fbistech.Retailer.DirectFunding_RetailerToSubDealer_NotUpline;
import com.fbistech.Retailer.DirectFunding_RetailerToSubDealer_Upline;
import com.fbistech.Utility.LaunchMobileUtility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class DirectFunding_TestCase {

	

//public class DirectFunding_SubDealer_TestCase extends BasePage {
//	
//	public DirectFunding_SubDealer_TestCase()
//	{
//		super(driver);
//
//	}

	AppiumDriver driver = LaunchMobileUtility.initializeMobileAndroidDriver();

	

	
	@Test(priority = 1)
	public void verifyRetailerCannotFundDealer_NotUpline()throws Exception
	{
		DirectFunding_RetailerToDealer_NotUpLine retailerFundDealer_NotUpLine = new DirectFunding_RetailerToDealer_NotUpLine(driver);
		
		String getWalletBalanceText = retailerFundDealer_NotUpLine.validateRetailerFundDealer_NotUpline();
		System.out.println(getWalletBalanceText);
		
		Thread.sleep(19000);

	}
	
	
	@Test(priority = 2)
	public void verifyRetailerCannotFundDealer_Upline()throws Exception
	{
		DirectFunding_RetailerToDealer_Upline retailerFundDealer_UpLine = new DirectFunding_RetailerToDealer_Upline(driver);
		
		String getWalletBalanceText = retailerFundDealer_UpLine.validateRetailerFundDealer_Upline();
		System.out.println(getWalletBalanceText);
		
		Thread.sleep(19000);

	}
	
	
	
	@Test(priority = 3)
	public void verifyRetailerCannotFundRetailer_NotSameUpline()throws Exception
	{
		DirectFunding_RetailerToRetailer_NotSameUpline retailerFundRetailerNotSameUpline = new DirectFunding_RetailerToRetailer_NotSameUpline(driver);

		String getWalletBalanceText = retailerFundRetailerNotSameUpline.validateRetailerFundRetailer_NotSameUpline();
		System.out.println(getWalletBalanceText);
		Thread.sleep(19000);
	}
	
	 
	
	@Test(priority = 4)
	public void verifyRetailerCannotFundRetailer_SameUpline()throws Exception
	{
		DirectFunding_RetailerToRetailer_SameUpline retailerFundRetailer_SameUpline = new DirectFunding_RetailerToRetailer_SameUpline(driver);

		String getWalletBalanceText = retailerFundRetailer_SameUpline.validateRetailerFundRetailer_SameUpline();
		System.out.println(getWalletBalanceText); //Attempt to read property "retail_code" on null

		Thread.sleep(19000);
	}
	 
	
	
	@Test(priority = 5)
	public void verifyRetailerCannotFundSubDealer_NotUpline()throws Exception
	{
		DirectFunding_RetailerToSubDealer_NotUpline retailerFundSubDealer_NotUpline = new DirectFunding_RetailerToSubDealer_NotUpline(driver);
		
		String getWalletBalanceText = retailerFundSubDealer_NotUpline.validateRetailerFundSubDealer_NotUpline();
		System.out.println(getWalletBalanceText);
		Thread.sleep(19000);

//		subDealerFundRetailer_OnDownline.subdealerToFundRetailer_OnDownline(prop.getProperty("subDealerToRetailerDownline"), prop.getProperty("subDealer_PIN"));
	}
	 

	
	@Test(priority = 6)
	public void verifyRetailerCannotFundSubDealer_Upline()throws Exception
	{
		DirectFunding_RetailerToSubDealer_Upline retailerFundSubDealer_Upline = new DirectFunding_RetailerToSubDealer_Upline(driver);

		String getWalletBalanceText = retailerFundSubDealer_Upline.validateRetailerFundSubDealer_Upline();
		System.out.println(getWalletBalanceText); //Attempt to read property "retail_code" on null

		Thread.sleep(19000);
		
//		subDealerFundRetailer_OnDownline.subdealerToFundRetailer_OnDownline(prop.getProperty("subDealerToRetailerDownline"), prop.getProperty("subDealer_PIN"));
	}
	
	

	
	
}
