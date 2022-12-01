package com.fbistech.SubDealer_TestCase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fbistech.SubDealer.CheckSubDealerWalletBalance;
import com.fbistech.Utility.LaunchMobileUtility;

import io.appium.java_client.AppiumDriver;

public class CheckSubDealerWalletBalance_TestCase {
	 
	

	public static Properties prop;
	 
	public static FileInputStream input;
	
	CheckSubDealerWalletBalance checkBalance;

	AppiumDriver driver = LaunchMobileUtility.initializeMobileAndroidDriver();
	


	
	@BeforeMethod
	public void setUp()
	{
		initializePropFile();
		checkBalance = new CheckSubDealerWalletBalance(driver);
	}
	
	
	
 

	@com.fbistech.Utility.JiraPolicy(logTicketReady = true)
	@Test(priority = 1)
	public void verifySubDealerCanCheckWalletBalance() throws Exception
	{
		String getWalletBalance = checkBalance.validateSubdealerCheckBalance(prop.getProperty("checkWalletBalance"));
		System.out.println(getWalletBalance);
//		Assert.assertTrue(getWalletBalance);
	
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
