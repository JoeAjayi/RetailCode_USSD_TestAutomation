package com.fbistech.Dealer;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DirectFunding_DealerToRetailer_SubdealerDownline extends BasePage {

	
	public DirectFunding_DealerToRetailer_SubdealerDownline(AndroidDriver driver)
	{
		super(driver);
	}
	
	
		
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	private AndroidElement textField;	
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Call\"]")
	private AndroidElement call_Btn;
	
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	private AndroidElement pinInPutField;
	
	
	@AndroidFindBy(xpath = "//*[@text='SEND']")
	private AndroidElement sendPIN_Btn;
	
	@AndroidFindBy(xpath = "//*[@text='OK']")
	private AndroidElement ok_Btn;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Close\"]")
	private AndroidElement smsOK_Btn;
	
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView']")
//	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
	private AndroidElement accountBalancePopUp;

	@AndroidFindBy(xpath = "//*[@resource-id='com.android.mms:id/text_message']")
	private AndroidElement debitSMS;
	
	@AndroidFindBy(xpath = "//*[@clss='android.widget.LinearLayout']")
	private AndroidElement enterSMS;
	
//	public void dealerToFundSubdealerDownline(String subDealerToRetailerDownline) throws Exception
	public String validateDealerFundRetailerOnSubdealerDownline() throws Exception

	{
//		textField.sendKeys(subDealerToRetailerDownline);
		textField.sendKeys("*878*878*33*005394*1#");
		call_Btn.click();
		Thread.sleep(5000);
		
		pinInPutField.sendKeys("1234");
		sendPIN_Btn.click();
		Thread.sleep(5000);
		
		String balance = accountBalancePopUp.getText();
		Thread.sleep(6000);

		
		ok_Btn.click();
		Thread.sleep(70000);
		
//		smsOK_Btn.click();
//		debitSMS.click();
		
//		trying to verify sms for validation
		enterSMS.click();

		return balance;
	}



}
