package com.fbistech.SubDealer;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DirectFunding_SubDealerToSubDealer_OnSameDealer extends BasePage{

	
	public DirectFunding_SubDealerToSubDealer_OnSameDealer(AppiumDriver driver)
	{
		super(driver);
//		PageFactory.initElements(driver, this);
	}
	

	
		
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	private AndroidElement textField;	
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Call\"]")
	private AndroidElement callButton;
	
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	private AndroidElement pinInputField;
	
	@AndroidFindBy(xpath = "//*[@text='SEND']")
	private AndroidElement sendPinButton;
	
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView']")
//	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
	private AndroidElement accountBalanceResponse;
	
	@AndroidFindBy(xpath = "//*[@text='OK']")
	private AndroidElement balanceOK_Button;
	
	
//	@AndroidFindBy(xpath = "//*[@text='878']")
//	private AndroidElement tap878;
	
	
//	@AndroidFindBy(xpath = "//*[@resource-id='com.android.mms:id/text_message']")
//	private AndroidElement debitSMS;
	
//	@AndroidFindBy(xpath = "//*[@text='Enter message']")
//	private AndroidElement enterText;
	
			
//	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Close\"]")
//	private AndroidElement smsCancel_Btn;
	
	

	public String validateSubdealerFundSubdealer_OnSameDealer(String subDealerFundSubdealer_OnSameDealer, 
			String subDealer_PIN)throws Exception
	{
//		textField.sendKeys("*878*999*33*00695*5#");
		textField.sendKeys(subDealerFundSubdealer_OnSameDealer);
		callButton.click();
		Thread.sleep(8000);
		 
		
		pinInputField.sendKeys(subDealer_PIN);
		sendPinButton.click();
		Thread.sleep(5000);
		
		
		String balance = accountBalanceResponse.getText();
		Thread.sleep(8000);
		
		balanceOK_Button.click();
		
//		Thread.sleep(6000);
//		debitSMS.click();
		
//		Thread.sleep(4000);
//		tap878.click();
//		enterText.click();

		return balance;
	}
	
}
