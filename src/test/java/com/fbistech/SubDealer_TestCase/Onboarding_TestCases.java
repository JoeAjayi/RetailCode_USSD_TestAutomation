package com.fbistech.SubDealer_TestCase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fbistech.SubDealer.Onboarding_SubDealerUnder_Dealer;
import com.fbistech.SubDealer.Retrieve_Retailcode;
import com.fbistech.Utility.LaunchMobileUtility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Onboarding_TestCases {
	
	
	 AppiumDriver driver = LaunchMobileUtility.initializeMobileAndroidDriver();
	
	 public static Properties prop;
	 
	public static FileInputStream input;
		
	Onboarding_SubDealerUnder_Dealer subDealerOnboardUnder_Dealer;
		
		
	@BeforeMethod
	public void setUp()
	{
		initializePropFile();
		subDealerOnboardUnder_Dealer = new Onboarding_SubDealerUnder_Dealer(driver);
	}
	
	
//	@Test(priority = 2) 
//	public void verifySubDealerCanOnboardDirectlyUnderDealer()throws Exception
//	{
//		OnboardingDirectly_SubDealerUnder_FBIS_Dealer direct_SubDealerOnboardUnder_Dealer = new OnboardingDirectly_SubDealerUnder_FBIS_Dealer(driver);
//		String registrationDetails = direct_SubDealerOnboardUnder_Dealer.validateSubdealerOnboardDirectlyUnderFBISDealer();
//		System.out.println(registrationDetails);
//		Thread.sleep(19000);
//	}
	
	
	
	@Test(priority = 1)
	public void verifySubDealerCanOnboardUnderDealer()throws Exception
	{
		String registrationDetails = subDealerOnboardUnder_Dealer.validateSubdealerOnboardUnderDealer
				(prop.getProperty("subSealerOnboardUnderDealer"), prop.getProperty("subDealerName"), prop.getProperty("subRegion"), 
						prop.getProperty("invalidPIN"), prop.getProperty("validPIN"), prop.getProperty("invalidPINtoConfirmPIN"), 
						prop.getProperty("String confirmPIN"));
		System.out.println(registrationDetails);
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
