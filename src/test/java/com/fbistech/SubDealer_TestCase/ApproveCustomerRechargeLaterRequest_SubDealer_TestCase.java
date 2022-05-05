package com.fbistech.SubDealer_TestCase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fbistech.SubDealer.ApproveAirtimeRequest;
import com.fbistech.SubDealer.ApproveCustomerRechargeLaterRequest;
import com.fbistech.Utility.LaunchMobileUtility;

import io.appium.java_client.AppiumDriver;

public class ApproveCustomerRechargeLaterRequest_SubDealer_TestCase {
	
	

	AppiumDriver driver = LaunchMobileUtility.initializeMobileAndroidDriver();

		
	public static Properties prop;
	 
	public static FileInputStream input;
	
	ApproveCustomerRechargeLaterRequest approveCustomerRechargeLaterRequest;
	
	
	
	@BeforeMethod
	public void setUp()
	{
		initializePropFile();
		approveCustomerRechargeLaterRequest = new  ApproveCustomerRechargeLaterRequest (driver);
	}
	
	
	
	
	  
	@Test(priority = 1)
	public void verifySubDealerCanApproveCustomerRechargeLaterRequest() throws Exception
	{
		String success_Prompt = approveCustomerRechargeLaterRequest.validateSubdealerApproveCustomerRechargeLaterRequest
				(prop.getProperty("subDealerApproveCustomerRechargeLaterRequest"), prop.getProperty("subDealer_PIN"));
		System.out.println(success_Prompt + " " + "_ SubDealerCanApproveCustomerRechargeLaterRequest");
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
