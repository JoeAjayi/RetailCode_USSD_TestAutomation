package com.fbistech.SubDealer_TestCase;

import java.io.*;
import org.testng.annotations.Test;

import com.fbistech.SubDealer.ApproveFundRequest;
import com.fbistech.Utility.LaunchMobileUtility;
import com.fbistech.Utility.LaunchMobile_SMS_Utility;

import io.appium.java_client.AppiumDriver;

public class ApproveFundRequest_TestCase {
	
	
	
	
	
	AppiumDriver driver = LaunchMobile_SMS_Utility.initializeMobileAndroidSMSDriver();
	
//	AppiumDriver driver2 = LaunchMobileUtility.initializeMobileAndroidDriver();
		
//	public static Properties prop;
//	 
//	public static FileInputStream input;
//	
//	ApproveFundRequest fundRequestApproval;
	

	

	
//	@BeforeMethod
//	public void setUp()
//	{
//		initializePropFile();
//		fundRequestApproval = new ApproveFundRequest(driver);
//	}
	

	@Test(priority = 1)
	public void verifySubDealerCanApproveRetailFundRequest() throws Exception
	{
		
		
		ApproveFundRequest fundRequestApproval = new ApproveFundRequest(driver);

		String approvedToken = null;
		try 
		{
			approvedToken = fundRequestApproval.getRetailerFundApprovalToken();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
		System.out.println("SubDealer Approve Retailer Fund Request TOKEN is _" + " " + approvedToken);
		Thread.sleep(5000);
			

		AppiumDriver driver = LaunchMobileUtility.initializeMobileAndroidDriver();
		
		
		String success_Prompt = fundRequestApproval.validateSubdealerApproveFundRequest();
		System.out.println(success_Prompt + " " + "_ SubDealer Approve Customer Airtime Requests");
//		Thread.sleep(19000); 
	}
	
	

	
	
//	@AfterMethod 
//	public void tearDown() throws Exception
//	{
//		Thread.sleep(6000);
//		driver.quit(); 
//	} 
	

	
//	public void initializePropFile() 
//	{
//		try  
//		{
////			Now instantiate by calling the constructor of properties  
//			prop = new Properties();
//				
////			Instantiate 
//			FileInputStream input = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/fbistech/config/config.properties");	
//
////			Load file input stream 
//			prop.load(input);	
//		}
//		
//		catch (FileNotFoundException e) 
//		{ 
//			e.printStackTrace();
//		}
//		catch (Exception e)
//		{
//			e.printStackTrace();
//		}
//		
//	}
}



