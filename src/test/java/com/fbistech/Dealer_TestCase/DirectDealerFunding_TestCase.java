package com.fbistech.Dealer_TestCase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.fbistech.Dealer.DirectFunding_DealerToDealer;
import com.fbistech.Dealer.DirectFunding_DealerToRetailer_NotOnDownline;
import com.fbistech.Dealer.DirectFunding_DealerToRetailer_OnDownline;
import com.fbistech.Dealer.DirectFunding_DealerToRetailer_SubdealerDownline;
import com.fbistech.Dealer.DirectFunding_DealerToSubDealer_NotOnDownline;
import com.fbistech.Dealer.DirectFunding_DealerToSubDealer_OnDownline;
import com.fbistech.Dealer.FundRequest_Dealer;
import com.fbistech.Dealer.VendAirtime_DealerToRetailer_NotOnDownLine;
import com.fbistech.Utility.LaunchMobileUtility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class DirectDealerFunding_TestCase {
	
	

	AppiumDriver driver = LaunchMobileUtility.initializeMobileAndroidDriver();

//	DealerFundSubDealer_DealerDownline dealerFundSubDealer_DealerDownline;
	
//	
//	public DirectFunding_TestCase(AndroidDriver driver)
//	{
//		super();
//	}
	
	
//	@BeforeMethod
//	public void setUp()
//	{
////		initialization();
//		dealerFundRetailer_Downline = new DealerFundSubDealer_DealerDownline(driver);
	
//	}
	
	
//	@Test(priority = 1)
	public void verifyDealerCannotFundDealer()throws Exception
	{
		DirectFunding_DealerToDealer dealerFund_Dealer = new DirectFunding_DealerToDealer(driver);
		
		String getWalletBalanceText = dealerFund_Dealer.validateDealerFundDealer();
		System.out.println(getWalletBalanceText);
		
//		dealerFund_Dealer.dealerFundDealer();
		Thread.sleep(15000);
	 
	}
	
//	@Test(priority = 2)
	public void verifyDealerCannotFundRetailer_NotOnDownline()throws Exception
	{
		DirectFunding_DealerToRetailer_NotOnDownline dealerFundRetailer_NotOnDownline = new DirectFunding_DealerToRetailer_NotOnDownline(driver);
		
		String getWalletBalanceText = dealerFundRetailer_NotOnDownline.validateDealerFundRetailerNotOnDownline();
		System.out.println(getWalletBalanceText);
		
		Thread.sleep(15000);

		
	}
	
//	@Test(priority = 3)
	public void verifyDealerCanFundRetailerOnDownline()throws Exception
	{
		DirectFunding_DealerToRetailer_OnDownline dealerFundRetailer_OnDownline = new DirectFunding_DealerToRetailer_OnDownline(driver);
		
		String getWalletBalanceText = dealerFundRetailer_OnDownline.ValidateDealerFundRetailerOnDownline();
		System.out.println(getWalletBalanceText);
		
		Thread.sleep(19000);

	}
	
	
//	@Test(priority = 4)
	public void verifyDealerCanFundRetailer_SubdealerDownline()throws Exception
	{
		DirectFunding_DealerToRetailer_SubdealerDownline dealerFundRetailer_SubdealerDownline = new DirectFunding_DealerToRetailer_SubdealerDownline(driver);
		
		String getWalletBalanceText = dealerFundRetailer_SubdealerDownline.validateDealerFundRetailerOnSubdealerDownline();
		System.out.println(getWalletBalanceText);
		
		Thread.sleep(19000);
	}
	
	
	
//	@Test(priority = 5)
	public void verifyDealerCanNotFundSubdealer_NotDealerDownline()throws Exception
	{
		DirectFunding_DealerToSubDealer_NotOnDownline dealerFundSubDealer_NotOnDownline = new DirectFunding_DealerToSubDealer_NotOnDownline(driver);
		dealerFundSubDealer_NotOnDownline.dealerFundSubdealerNotOnDownline();
		Thread.sleep(19000);

	}

	
	
//	@Test(priority = 6)
	public void verifyDealerCanFundSubDealer_OnDownline() throws Exception
	{
		DirectFunding_DealerToSubDealer_OnDownline dealerFundSubDealer_OnDownline = new DirectFunding_DealerToSubDealer_OnDownline(driver);
		dealerFundSubDealer_OnDownline.dealerToFundSubdealerOnDownline();

//		dealerFundSubDealer_DealerDownline.dealerToFundSubdealerDownline(prop.getProperty("DealerFundSubdealerDownline"));					
		Thread.sleep(19000);

	}
	
	

	

	
	
//	@AfterClass
//	public void tearDown() throws Exception
//	{
//		
//		
//	}
		

}
