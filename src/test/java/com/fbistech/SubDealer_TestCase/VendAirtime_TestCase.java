package com.fbistech.SubDealer_TestCase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fbistech.SubDealer.CheckSubDealerWalletBalance;
import com.fbistech.SubDealer.VendAirtime_SubDealerToCustomer;
import com.fbistech.SubDealer.VendAirtime_SubDealerToDealer_NotUpline;
import com.fbistech.SubDealer.VendAirtime_SubDealerToDealer_Upline;
import com.fbistech.SubDealer.VendAirtime_SubDealerToRetailer_Downline;
import com.fbistech.SubDealer.VendAirtime_SubDealerToRetailer_NotDownline;
import com.fbistech.SubDealer.VendAirtime_SubDealerToSubDealer_NotSameUpline;
import com.fbistech.SubDealer.VendAirtime_SubDealerToSubDealer_SameUpline;
import com.fbistech.Utility.LaunchMobileUtility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class VendAirtime_TestCase {
 

	public static Properties prop;
	 
	public static FileInputStream input;
	

	AppiumDriver driver = LaunchMobileUtility.initializeMobileAndroidDriver();
	

	VendAirtime_SubDealerToCustomer subdealerVendAirtimeToCustomer;
	VendAirtime_SubDealerToDealer_NotUpline subdealerVendAirtimeDealerNotUpline;
	VendAirtime_SubDealerToDealer_Upline subdealerVendAirtimeToDealerUpline;
	VendAirtime_SubDealerToRetailer_Downline subdealerVendAirtimeToRetailerDownline;
	VendAirtime_SubDealerToRetailer_NotDownline subdealerVendAirtimeToRetailerNotDownline;
	VendAirtime_SubDealerToSubDealer_NotSameUpline subdealerVendAirtimeToSubDealerNotSameUpline;
	VendAirtime_SubDealerToSubDealer_SameUpline subdealerVendAirtimeToSubDealer_SameUpline;
	
	
	
	@BeforeMethod
	public void setUp()
	{
		initializePropFile();
		subdealerVendAirtimeToCustomer = new VendAirtime_SubDealerToCustomer(driver);
		subdealerVendAirtimeDealerNotUpline = new VendAirtime_SubDealerToDealer_NotUpline(driver);
		subdealerVendAirtimeToDealerUpline = new VendAirtime_SubDealerToDealer_Upline(driver);
		subdealerVendAirtimeToRetailerDownline = new VendAirtime_SubDealerToRetailer_Downline(driver);
		subdealerVendAirtimeToRetailerNotDownline = new VendAirtime_SubDealerToRetailer_NotDownline(driver);
		subdealerVendAirtimeToSubDealerNotSameUpline = new VendAirtime_SubDealerToSubDealer_NotSameUpline(driver);
		subdealerVendAirtimeToSubDealer_SameUpline = new VendAirtime_SubDealerToSubDealer_SameUpline(driver);

	}
	
	
	

	@Test(priority = 1)
	public void verifySubDealerCanVendAirtimeToCustomer() throws Exception
	{
		String getWalletBalance = subdealerVendAirtimeToCustomer.validateSubdealerVendAirtimeTo_Customer
				(prop.getProperty("subDealerVendAirtimeToCustomer1"), prop.getProperty("subDealer_PIN"));
		System.out.println(getWalletBalance + " " + "subdealerVendAirtimeToCustomer" );
		Thread.sleep(19000);
	}  
	 
	
	
	
	@Test(priority = 2)
	public void verifySubDealerCanVendAirtimeToDealer_NotUpline() throws Exception
	{		
		String getWalletBalance = subdealerVendAirtimeDealerNotUpline.validateSubdealerVendAirtimeToDealer_NotUpline
				(prop.getProperty("subDealerVendAirtimeToDealer_NotUpline"), prop.getProperty("subDealer_PIN"));
		System.out.println(getWalletBalance + " " + "subdealerVendAirtimeToCustomer");
		Thread.sleep(19000);
	}
	
	
	
	
	@Test(priority = 3)
	public void verifySubDealerCanVendAirtimeToDealer_Upline() throws Exception
	{		
		String getWalletBalance = subdealerVendAirtimeToDealerUpline.validateSubdealerVendAirtimeToDealer_Upline
				(prop.getProperty("subDealerVendAirtimeToDealer_Upline"), prop.getProperty("subDealer_PIN"));
		System.out.println(getWalletBalance + " " + "subdealerVendAirtimeToDealerUpline");
		Thread.sleep(19000);
	}
	
	
	
		 
	@Test(priority = 4)
	public void verifySubDealerCanVendAirtimeToRetailer_OnDownline() throws Exception
	{		
		String getWalletBalance = subdealerVendAirtimeToRetailerDownline.validateSubdealerVendAirtimeToRetailer_OnDownline
				(prop.getProperty("subDealerVendAirtimeToRetailer_Downline"), prop.getProperty("subDealer_PIN"));
		System.out.println(getWalletBalance + " " + "subdealerVendAirtimeToRetailerDownlin");
		Thread.sleep(19000);
	}
	
	
	
	@Test(priority = 5)
	public void verifySubDealerCanVendAirtimeToRetailer_NotDownline() throws Exception
	{
		String getWalletBalance = subdealerVendAirtimeToRetailerNotDownline.validateSubdealerVendAirtimeToRetailer_NotOnDownline
				(prop.getProperty("subDealerVendAirtimeToRetailer_NotOnDownline"), prop.getProperty("subDealer_PIN"));
		System.out.println(getWalletBalance + " " + "subdealerVendAirtimeToRetailerNotDownline");
		Thread.sleep(19000);
	}
	
	
	
	@Test(priority = 6)
	public void verifySubDealerCanVendAirtimeToSubDealer_NotSameUpline() throws Exception
	{		
		String getWalletBalanceText = subdealerVendAirtimeToSubDealerNotSameUpline.validateSubdealerVendAirtimeToSubDealer_NotSameUpline
				(prop.getProperty("subDealerVendAirtimeToSubDealer_NotSameUpline"), prop.getProperty("subDealer_PIN"));
		System.out.println(getWalletBalanceText + " " + "subdealerVendAirtimeToSubDealerNotSameUpline");
//		Assert.assertEquals(getWalletBalanceText, "Invalid USSD code.");
		Thread.sleep(19000);

	}

	
	
	
	@Test(priority = 7)
	public void verifySubDealerCanVendAirtimeToSubDealer_SameUpline() throws Exception
	{
		String getWalletBalance = subdealerVendAirtimeToSubDealer_SameUpline.subdealerVendAirtimeToSubdealer_SameUpline
				(prop.getProperty("subDealerVendAirtimeToSubDealer_SameUpline"), prop.getProperty("subDealer_PIN"));
		System.out.println(getWalletBalance + " " + "subdealerVendAirtimeToSubDealer_SameUpline");
//		Assert.assertEquals(vendAirtimeSuccess_PopUp, "Invalid USSD code.");
		Thread.sleep(19000);
	}

	
	
	
	
	@AfterMethod 
	public void tearDown() throws Exception
	{
		Thread.sleep(8000);
		driver.quit(); 
	} 
	
	
	
	
	public void initializePropFile() 
	{
		try  
		{
//			Now instantiate by calling the constructor of properties  
			prop = new Properties();
				
//			Instantiate 
			FileInputStream input = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/com/fbistech/config/config.properties");	

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
