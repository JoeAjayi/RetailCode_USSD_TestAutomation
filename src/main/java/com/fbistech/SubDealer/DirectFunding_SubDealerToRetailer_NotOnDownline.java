package com.fbistech.SubDealer;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DirectFunding_SubDealerToRetailer_NotOnDownline extends BasePage {

	
	public DirectFunding_SubDealerToRetailer_NotOnDownline(AppiumDriver driver)
	{
		super(driver);
	}
	
	
		
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	private AndroidElement textField;	
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Call\"]")
	private AndroidElement callButton;
	
	
//	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
//	private AndroidElement pinInPutField;
//	
//	@AndroidFindBy(xpath = "//*[@text='SEND']")
//	private AndroidElement sendPinButton;
	
	
	@AndroidFindBy(xpath = "//*[@text='OK']")
	private AndroidElement ok_Button;
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView']")
//	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
	private AndroidElement successPrompt;
	
	
//	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
//	private AndroidElement invalidFund_PopUp;
//
	

	
	public String validateSubdealerFundRetailer_NotOnDownline(String subDealerFundRetailer_NotOnDownline, 
			String subDealer_PIN) throws Exception
	{
//		textField.sendKeys("*878*878*33*318290*1#");
		textField.sendKeys(subDealerFundRetailer_NotOnDownline);
		callButton.click();
		Thread.sleep(8000);
		
//		pinInPutField.sendKeys(subDealer_PIN );
//		sendPinButton.click();
//		Thread.sleep(7000); 
		
		String balance = successPrompt.getText();
		Thread.sleep(8000);
		
		ok_Button.click();

		return balance;
	}
	
}
