 package com.fbistech.SubDealer_TestCase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fbistech.SubDealer.DirectFunding_SubDealerToCustomer;
import com.fbistech.SubDealer.DirectFunding_SubDealerToDealer_NotUpline;
import com.fbistech.SubDealer.DirectFunding_SubDealerToDealer_Upline;
import com.fbistech.SubDealer.DirectFunding_SubDealerToRetailer_NotOnDownline;
import com.fbistech.SubDealer.DirectFunding_SubDealerToRetailer_SubdealerDownline;
import com.fbistech.SubDealer.DirectFunding_SubDealerToRetailer_UnderDealer;
import com.fbistech.SubDealer.DirectFunding_SubDealerToSubDealer_NotOnSameDealer;
import com.fbistech.SubDealer.DirectFunding_SubDealerToSubDealer_OnSameDealer;
import com.fbistech.Utility.LaunchMobileUtility;

import io.appium.java_client.AppiumDriver;

public class DirectFunding_TestCase {

	

	AppiumDriver driver = LaunchMobileUtility.initializeMobileAndroidDriver();
	
	public static Properties prop;
	 
	public static FileInputStream input;
	
	DirectFunding_SubDealerToCustomer subDealerFundCustomer;	
	DirectFunding_SubDealerToDealer_NotUpline subDealerFundDealer_NotUpline;
	DirectFunding_SubDealerToDealer_Upline subDealerToFundDealer_Upline;
	DirectFunding_SubDealerToRetailer_NotOnDownline subDealerFundRetailer_NotOnDownline;
	DirectFunding_SubDealerToRetailer_SubdealerDownline subDealerToRetailer_SubdealerDownline;
	DirectFunding_SubDealerToRetailer_UnderDealer subDealerToRetailer_DealerDownline;
	DirectFunding_SubDealerToSubDealer_NotOnSameDealer subDealerFundSubdealer_NotOnSameDealer;
	DirectFunding_SubDealerToSubDealer_OnSameDealer subDealerToFundSubdealer_OnSameDealer;
	
	
	@BeforeMethod
	public void setUp()
	{
		initializePropFile();
		subDealerFundCustomer = new DirectFunding_SubDealerToCustomer(driver);
		subDealerFundDealer_NotUpline = new DirectFunding_SubDealerToDealer_NotUpline(driver);
		subDealerToFundDealer_Upline = new DirectFunding_SubDealerToDealer_Upline(driver);
		subDealerFundRetailer_NotOnDownline = new DirectFunding_SubDealerToRetailer_NotOnDownline(driver);
		subDealerToRetailer_SubdealerDownline = new DirectFunding_SubDealerToRetailer_SubdealerDownline(driver);
		subDealerToRetailer_DealerDownline = new DirectFunding_SubDealerToRetailer_UnderDealer(driver);
		subDealerFundSubdealer_NotOnSameDealer = new DirectFunding_SubDealerToSubDealer_NotOnSameDealer(driver);
		subDealerToFundSubdealer_OnSameDealer = new DirectFunding_SubDealerToSubDealer_OnSameDealer(driver);

		
		
	}


	@Test(priority = 1)
	public void verifySubDealerCannotFundCustomer()throws Exception
	{
		String responseText = subDealerFundCustomer.validateSubDealerFundCustomer (prop.getProperty("subDealerFundCustomer"), 
				prop.getProperty("subDealer_PIN"));
		System.out.println(responseText + " " + "subDealer Fund Customer");
		Thread.sleep(19000);
	}
	
	 
	
	@Test(priority = 2)

	public void verifySubDealerCannotFundDealer_NotUpline()throws Exception
	{
		String responseText = subDealerFundDealer_NotUpline.validateSubDealerFundDealer_NotUpline
				(prop.getProperty("subDealerFundDealer_NotUpline"), prop.getProperty("subDealer_PIN"));
		System.out.println(responseText + " " + "subDealer Fund Dealer Not Upline");
		Thread.sleep(19000);
	}
	
	
	
	@Test(priority = 3)
	public void verifySubDealerCannotFund_DealerUpLine()throws Exception
	{
		String getWalletBalanceText = subDealerToFundDealer_Upline.validateSubDealerFundDealer_NotUpline
				(prop.getProperty("subDealerFundDealer_NotUpline"), prop.getProperty("subDealer_PIN"));
		System.out.println(getWalletBalanceText + " " + "subDealer To Fund Dealer Upline");
		Thread.sleep(19000);
	}
	
	 
	
	@Test(priority = 4)
	public void verifySubDealerCannotFundRetailer_NotOnDownLine()throws Exception
	{
		String getWalletBalanceText = subDealerFundRetailer_NotOnDownline.validateSubdealerFundRetailer_NotOnDownline
				(prop.getProperty("subDealerFundRetailer_NotOnDownline"), prop.getProperty("subDealer_PIN"));
		System.out.println(getWalletBalanceText + " " + "subDealer Fund Retailer Not On Downline");
		Thread.sleep(19000);
	}
	  
	
	
	@Test(priority = 5)
	public void verifySubDealerCanFund_RetailerUnderSubdealer()throws Exception
	{
		String getWalletBalanceText = subDealerToRetailer_SubdealerDownline.validateSubdealerFundRetailer_SubDealerDownline
				(prop.getProperty("subDealerFundRetailer_SubDealerDownline"), prop.getProperty("subDealer_PIN"));
		System.out.println(getWalletBalanceText + " " + "subDealer To Retailer Subdealer Downline");
		Thread.sleep(19000);
	}
	
	
	
	@Test(priority = 6)
	public void verifySubDealerCanFund_RetailerUnderDealer()throws Exception
	{
		String getWalletBalanceText = subDealerToRetailer_DealerDownline.validateSubdealerFundRetailer_UnderDealer
				(prop.getProperty("subDealerFundRetailer_UnderDealer"), prop.getProperty("subDealer_PIN"));
		System.out.println(getWalletBalanceText + " " + "subDealer To Retailer Dealer Downline");
		Thread.sleep(19000);
	}
	 

	
	@Test(priority = 7)
	public void verifySubDealerCannotFundSubDealer_NotOnSameDealer()throws Exception
	{
		String getWalletBalanceText = subDealerFundSubdealer_NotOnSameDealer.subdealerFundSubdealer_NotOnSameDealer
				(prop.getProperty("subDealerFundSubdealer_NotOnSameDealer"), prop.getProperty("subDealer_PIN"));
		System.out.println(getWalletBalanceText + " " + "subDealer Fund Subdealer Not On Same Dealer");
		Thread.sleep(19000);
	}
	
	
	
	
	@Test(priority = 8)
	public void verifySubDealerCanFund_SubDealerOnSameDealer()throws Exception
	{
		String getWalletBalanceText = subDealerToFundSubdealer_OnSameDealer.validateSubdealerFundSubdealer_OnSameDealer
				(prop.getProperty("subDealerFundSubdealer_OnSameDealer"), prop.getProperty("subDealer_PIN"));
		System.out.println(getWalletBalanceText + " " + "subDealer To Fund Subdealer OnSameDealer");
		Thread.sleep(19000);	
	}

	
	@AfterMethod 
	public void tearDown() throws Exception
	{
		Thread.sleep(6000);
//		driver.quit(); 
	} 
	
	
	
	
	
	public void initializePropFile() 
	{
		try  
		{
//			Now instantiate by calling the constructor of properties  
			prop = new Properties();
				
//			Instantiate 
			FileInputStream input = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/fbistech/config/config.properties");	

//			Load file input stream 
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
