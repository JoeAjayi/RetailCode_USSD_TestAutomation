package com.fbistech.Retailer;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Onboarding_RetailerUnder_SubDealer extends BasePage {
	
	public Onboarding_RetailerUnder_SubDealer(AppiumDriver driver)
	{
		super(driver);
	}
	
	


	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@content-desc=\"Asterisk\"]/android.widget.TextView") 
	private AndroidElement starBtn;
	
	@AndroidFindBy(xpath = "//*[@resource-id='com.samsung.android.contacts:id/digits']") 
	private AndroidElement digits_InputField;	
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Call button\"]")
	private AndroidElement callButon;
	
	
//	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
//	private AndroidElement digits_InputField;	
//	
//	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Call\"]")
//	private AndroidElement dial_Button;
	

	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")   //*[@resource-id='com.android.phone:id/input_field']
	private AndroidElement text_InputField;
	
	@AndroidFindBy(xpath = "//*[@text='SEND']")
	private AndroidElement sendText_Button;
	
	

	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView']")
//	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
	private AndroidElement onboardingConfirmation;
	
	
	
	@AndroidFindBy(xpath = "//*[@text='CANCEL']")
	private AndroidElement cancel_Button;
//	
	@AndroidFindBy(xpath = "//*[@text='OK']")
	private AndroidElement ok_Button;
	
		

	
//	*878*22*1*Dealer-RCode# .......Sub-dealer onboard under Dealer
//	*878*22*2*Dealer-RCode# .......Retailer onboard under Dealer
//	*878*22*3*Sub-dealer-RCode#....Retailer onboard under Sub-dealer
	
	public String validateRetailerOnboardUnderSubdealer() throws Exception

	{
//		Dial Short code 
		starBtn.click();
		digits_InputField.sendKeys("878*999*22*3*00263#");
		callButon.click();
		Thread.sleep(3000);
		
		
//		Enter Retailer's name 
		text_InputField.sendKeys("*999*Joseph R-S");
		sendText_Button.click();
		Thread.sleep(3000);
		
//		Enter Sub-Region 
		text_InputField.sendKeys("*999*Lagos");
		sendText_Button.click();
		Thread.sleep(4000);
 
//		Enter more than 4 digits to create PIN
		text_InputField.sendKeys("*999*123456");
		sendText_Button.click();
		Thread.sleep(4000); 
		
//		Enter 4 digits PIN
		text_InputField.sendKeys("*999*1234");
		sendText_Button.click();
		Thread.sleep(4000);
		
		
//		Enter wrong PIN to Confirm PIN
		text_InputField.sendKeys("*999*123567");
		sendText_Button.click();
		Thread.sleep(4000);
		
//		Enter 4 digits PIN to confirm PIN
		text_InputField.sendKeys("*999*1234");
		sendText_Button.click();
		Thread.sleep(6000);
//		cancel_Button.click();
		
		String onboardingDetails = onboardingConfirmation.getText();
		Thread.sleep(6000);
		
		Thread.sleep(6000);
//		ok_Button.click();
		
//		balanceOK_Btn.click();
//		Thread.sleep(10000);
//		smsCancel_Btn.click();
		
		return onboardingDetails;
		
	}
	
	
}
