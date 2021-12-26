package com.fbistech.SubDealer_TestCase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fbistech.SubDealer.DirectFunding_SubDealerToRetailer_SubdealerDownline;
import com.fbistech.SubDealer.DirectFunding_SubDealerToRetailer_UnderDealer;
import com.fbistech.SubDealer.DirectFunding_SubDealerToSubDealer_OnSameDealer;
import com.fbistech.SubDealer.FundRecallSubDealer_To_RetailerUnderDealer;
import com.fbistech.SubDealer.FundRecallSubDealer_To_RetailerUnderSubDealer;
import com.fbistech.SubDealer.FundRecallSubDealer_To_SubDealerOnSameDealer;
import com.fbistech.SubDealer.FundRequest;
import com.fbistech.Utility.LaunchMobileUtility;

import io.appium.java_client.AppiumDriver;

public class FundRequest_TestCase {
	
	
	AppiumDriver driver = LaunchMobileUtility.initializeMobileAndroidDriver();
	
	public static Properties prop;
	 
	public static FileInputStream input;
	
	FundRequest fundRequestToAllTps;
	
	


	
	@BeforeMethod
	public void setUp()
	{
		initializePropFile();
		fundRequestToAllTps = new FundRequest(driver);
	}

	

	@Test(priority = 1)
	public void verifySubdealerCanRequestFundfromDealerUpline()throws Exception
	{
		String success_Token = fundRequestToAllTps.validateFundRequest
				(prop.getProperty("fundRequestSubdealerToDealerUpline"), prop.getProperty("subDealer_PIN"));
		System.out.println(success_Token + " " + "_ FundRequestSubdealerToDealerUpline");
		Thread.sleep(19000); 
	}
	
	 
	
	@Test(priority = 2)
	public void verifySubdealerCannotRequestFundfromDealer_NotUpline()throws Exception
	{
		String success_Token = fundRequestToAllTps.validateFundRequest
				(prop.getProperty("fundRequestSubdealerToDealerNotUpline"), prop.getProperty("subDealer_PIN"));
		System.out.println(success_Token + " " + "_ SubdealerCannotRequestFundfromDealerNotUpline");
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
