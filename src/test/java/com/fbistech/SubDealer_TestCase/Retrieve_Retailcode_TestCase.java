package com.fbistech.SubDealer_TestCase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fbistech.SubDealer.Retrieve_Retailcode;
import com.fbistech.Utility.LaunchMobileUtility;

import io.appium.java_client.AppiumDriver;

public class Retrieve_Retailcode_TestCase {
	
	
	AppiumDriver driver = LaunchMobileUtility.initializeMobileAndroidDriver();
	

	public static Properties prop;
	 
	public static FileInputStream input;
	
	Retrieve_Retailcode retrieveRetailcode;
	
	
	@BeforeMethod
	public void setUp()
	{
		initializePropFile();
		retrieveRetailcode = new Retrieve_Retailcode(driver);
		
	}

	
	
	
	
	@com.fbistech.Utility.JiraPolicy(logTicketReady = true)
	@Test(priority = 1)
	public void verifySubDealerCanRetrieve_Retailcode() throws Exception
	{
		String retrieveSubdealerRetailcode = retrieveRetailcode.validateSubdealerRetrieve_Retailcode("subDealerRetrieve_Retailcodes");
//		Assert.assertNull(getWalletBalanceText);
		System.out.println(retrieveSubdealerRetailcode);
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
