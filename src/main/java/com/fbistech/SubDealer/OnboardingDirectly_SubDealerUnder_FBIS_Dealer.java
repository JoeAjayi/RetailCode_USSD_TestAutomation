package com.fbistech.SubDealer;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class OnboardingDirectly_SubDealerUnder_FBIS_Dealer extends BasePage {
	
	public OnboardingDirectly_SubDealerUnder_FBIS_Dealer(AndroidDriver driver)
	{
		super(driver);
	}
	
	
		
//@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	private AndroidElement digits_InputField;	
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Call\"]")
	private AndroidElement dial_Button;
	

	@AndroidFindBy(xpath = "//*[@resource-id='com.android.phone:id/input_field']")
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
	
	
	

	
	public String validateSubdealerOnboardDirectlyUnderFBISDealer() throws Exception
	{
//		Dial shotcode
		digits_InputField.sendKeys("*878*878#");
		dial_Button.click();
		Thread.sleep(3000);
		
//		Select 1 to Register as Sub-dealer
		text_InputField.sendKeys("1");
		sendText_Button.click();
		Thread.sleep(3000);
		
//		Select 1 to Register Directly 
		text_InputField.sendKeys("1");
		sendText_Button.click();
		Thread.sleep(3000);
		
		
//		Enter 2 digits Dealer code
		text_InputField.sendKeys("00");
		sendText_Button.click();
		Thread.sleep(3000);
		
//		Enter names
		text_InputField.sendKeys("Joseph Sub-dealer");
		sendText_Button.click();
		Thread.sleep(3000);
		
//		Enter Sub-Region
		text_InputField.sendKeys("Lagos");
		sendText_Button.click();
		Thread.sleep(4000);
		
//		Enter more than 4 digits to create PIN
		text_InputField.sendKeys("123456");
		sendText_Button.click();
		Thread.sleep(4000);
		
//		Enter 4 digits PIN
		text_InputField.sendKeys("1234");
		sendText_Button.click();
		Thread.sleep(4000); 
		
//		Enter wrong PIN to Confirm PIN
		text_InputField.sendKeys("12356PIN");
		sendText_Button.click();
		Thread.sleep(4000);
		
//		Enter 4 digits PIN to confirm PIN
		text_InputField.sendKeys("1234");		
//		sendText_Btn.click();
		cancel_Button.click();
		Thread.sleep(6000);
		
		String onboardingDetails = onboardingConfirmation.getText();
		Thread.sleep(6000);
		
		ok_Button.click();
		
//		balanceOK_Btn.click();
//		Thread.sleep(10000);
//		smsCancel_Btn.click();
		
		return onboardingDetails;
		
		
	}
}
