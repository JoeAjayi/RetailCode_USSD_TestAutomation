package com.fbistech.SubDealer_TestCase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fbistech.SubDealer.ApproveAirtimeRequest;
import com.fbistech.Utility.LaunchMobileUtility;

import io.appium.java_client.AppiumDriver;

public class ApproveAirtimeRequest_TestCase {
	
	
	AppiumDriver driver = LaunchMobileUtility.initializeMobileAndroidDriver();

		
	public static Properties prop;
	 
	public static FileInputStream input;
	
	ApproveAirtimeRequest airtimeRequestApproval;
	
	


	
	@BeforeMethod
	public void setUp()
	{
		initializePropFile();
		 airtimeRequestApproval = new ApproveAirtimeRequest(driver);
	}
	

	@Test(priority = 1)
	public void verifySubDealerCanApproveCustomerAirtimeRequest()throws Exception
	{
		String success_Prompt = airtimeRequestApproval.validateSubdealerApproveAirtimeRequest
		(prop.getProperty("subDealerApproveCustomerAirtimeRequest"), prop.getProperty("subDealer_PIN"));
		System.out.println(success_Prompt + " " + "_ SubDealerApproveCustomerAirtimeReques");
		Thread.sleep(19000); 
	}
	
	
	
//	@Test(priority = 2)
	public void verifySubDealerCanApproveRetailerAirtimeRequest()throws Exception
	{
		String success_Prompt = airtimeRequestApproval.validateSubdealerApproveAirtimeRequest
		(prop.getProperty("subDealerApproveRetailerAirtimeRequest"), prop.getProperty("subDealer_PIN"));
		System.out.println(success_Prompt + " " + "_ SubDealerApproveRetailerAirtimeReques");
		Thread.sleep(19000); 
	}

	
	
//	@Test(priority = 3)
	public void verifySubDealerCanApproveDealerAirtimeRequest()throws Exception
	{
		String success_Prompt = airtimeRequestApproval.validateSubdealerApproveAirtimeRequest
		(prop.getProperty("subDealerApproveDealerAirtimeRequest"), prop.getProperty("subDealer_PIN"));
		System.out.println(success_Prompt + " " + "_ SubDealerApproveDealerAirtimeReques");
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



