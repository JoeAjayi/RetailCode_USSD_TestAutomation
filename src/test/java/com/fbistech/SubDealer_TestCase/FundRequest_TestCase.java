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
import com.fbistech.SubDealer.FundRequest_SubDelerToDealerUpline;
import com.fbistech.Utility.LaunchMobileUtility;

import io.appium.java_client.AppiumDriver;

public class FundRequest_TestCase {
	
	
	AppiumDriver driver = LaunchMobileUtility.initializeMobileAndroidDriver();
	
	public static Properties prop;
	 
	public static FileInputStream input;
	
	FundRequest_SubDelerToDealerUpline subdelerRequestFundFromDealer;
	
	


	
	@BeforeMethod
	public void setUp()
	{
		initializePropFile();
		subdelerRequestFundFromDealer = new FundRequest_SubDelerToDealerUpline(driver);
	}

	

	@Test(priority = 1)

	public void verifyFundRequestSubdealerToDealerUpline()throws Exception
	{
		String getWalletBalanceText = subdelerRequestFundFromDealer.validateFundRequestSubdealerToDealerUpline
				(prop.getProperty("fundRequestSubdealerToDealerUpline"), prop.getProperty("subDealer_PIN"));
		System.out.println(getWalletBalanceText);	
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
