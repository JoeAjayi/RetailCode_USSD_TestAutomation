package com.fbistech.SubDealer_TestCase;

import org.testng.annotations.Test;

import com.fbistech.SubDealer.OnboardingDirectly_SubDealerUnder_FBIS_Dealer;
import com.fbistech.SubDealer.Onboarding_SubDealerUnder_Dealer;
import com.fbistech.Utility.LaunchMobileUtility;

import io.appium.java_client.android.AndroidDriver;

public class Onboarding_TestCases {
	
	AndroidDriver driver = LaunchMobileUtility.getAndroidDriver();
	
	
	
	
	
//	@Test(priority = 2) 
	public void verifySubDealerCanOnboardDirectlyUnderDealer()throws Exception
	{
		OnboardingDirectly_SubDealerUnder_FBIS_Dealer direct_SubDealerOnboardUnder_Dealer = new OnboardingDirectly_SubDealerUnder_FBIS_Dealer(driver);
		String registrationDetails = direct_SubDealerOnboardUnder_Dealer.validateSubdealerOnboardDirectlyUnderFBISDealer();
		System.out.println(registrationDetails);
		Thread.sleep(19000);
	}
	
	
	
	@Test(priority = 1)
	public void verifySubDealerCanOnboardUnderDealer()throws Exception
	{
		Onboarding_SubDealerUnder_Dealer subDealerOnboardUnder_Dealer = new Onboarding_SubDealerUnder_Dealer(driver);
		String registrationDetails = subDealerOnboardUnder_Dealer.validateSubdealerOnboardUnderDealer();
		System.out.println(registrationDetails);
		Thread.sleep(19000);
		
	}

	

}
