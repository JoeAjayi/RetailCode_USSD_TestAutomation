package com.fbistech.Dealer_TestCase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fbistech.Dealer.FundRecallSubDealer_To_RetailerUnderDealer;
import com.fbistech.Dealer.FundRecallSubDealer_To_RetailerUnderSubDealer;
import com.fbistech.SubDealer.ApproveAirtimeRequest;
import com.fbistech.SubDealer.DirectFunding_SubDealerToRetailer_SubdealerDownline;
import com.fbistech.SubDealer.DirectFunding_SubDealerToRetailer_UnderDealer;
import com.fbistech.SubDealer.DirectFunding_SubDealerToSubDealer_OnSameDealer;
import com.fbistech.SubDealer.FundRecallSubDealer_To_SubDealerOnSameDealer;
import com.fbistech.Utility.LaunchMobileUtility;

import io.appium.java_client.AppiumDriver;

public class FundRecallDealer_TestCase {

    AppiumDriver driver = LaunchMobileUtility.initializeMobileAndroidDriver();
    public static Properties prop;
	 
	public static FileInputStream input;
	DirectFunding_SubDealerToRetailer_UnderDealer subDealerFundRetailer_UnderDealer;
	FundRecallSubDealer_To_RetailerUnderDealer subdealerRecallFund_from_R_D;

    
	
//	AppiumDriver driver = LaunchSamsungMobileUtilit.initializeMobileAndroidDriver();
	
	@BeforeMethod
	public void setUp()
	{
		initializePropFile();
		subDealerFundRetailer_UnderDealer = new DirectFunding_SubDealerToRetailer_UnderDealer(driver);
		subdealerRecallFund_from_R_D = new FundRecallSubDealer_To_RetailerUnderDealer(driver);


	}
	

    
    
	@Test(priority = 1)
	public void verifySubDealerCanRecallFund_from_RetailerUnderDealer()throws Exception
	{
		String fundToRetailer_Dealer = subDealerFundRetailer_UnderDealer.validateSubdealerFundRetailer_UnderDealer
				(prop.getProperty("subDealerFundRetailer_Dealer"), prop.getProperty("subDealer_PIN"));
		System.out.println(fundToRetailer_Dealer);
		Thread.sleep(19000);
		
		String fundRecallFromRetailer_Dealer = subdealerRecallFund_from_R_D.validateSubdealerRecallFund_from_RetailerUnderDealer
				(prop.getProperty("subDealerRecallFundfromR_D"), prop.getProperty("subDealerRecallAmountR_D"), prop.getProperty("subDealer_PIN"));
		System.out.println(fundRecallFromRetailer_Dealer);
		Thread.sleep(19000);
	}
	
	
	

	

    
    
	@Test(priority = 2)
	public void verifySubDealerCanRecallFund_from_RetailerOnSubDealerDownline()throws Exception
	{
		DirectFunding_SubDealerToRetailer_SubdealerDownline subDealerFundRetailer_UnderSubDealer = new  DirectFunding_SubDealerToRetailer_SubdealerDownline(driver);
		String fundToRetailer_Subdealer = subDealerFundRetailer_UnderSubDealer.validateSubdealerFundRetailer_SubDealerDownline();
		System.out.println(fundToRetailer_Subdealer);
		Thread.sleep(19000);
		
		
		FundRecallSubDealer_To_RetailerUnderSubDealer subdealerRecallFund_from_R_D = new FundRecallSubDealer_To_RetailerUnderSubDealer(driver);
		String fundRecallFromRetailer_Subdealer = subdealerRecallFund_from_R_D.validateSubdealerRecallFund_from_RetailerUndeSubDealer();
		System.out.println(fundRecallFromRetailer_Subdealer);
		Thread.sleep(19000);
	}

    
    
	    
	    
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
	
	
		
		@AfterMethod 
		public void tearDown() throws Exception
		{
			Thread.sleep(6000);
			driver.quit(); 
		} 
		

		
		public void initializePropFile() 
		{
			try  
			{
//				Now instantiate by calling the constructor of properties  
				prop = new Properties();
					
//				Instantiate 
				FileInputStream input = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/fbistech/config/config.properties");	

//				Load file input stream 
				prop.load(input);	
			}
			
			catch (FileNotFoundException e) 
			{ 
				e.printStackTrace();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			
		}
    
    
	
}
