package com.fbistech.SubDealer;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ApproveAirtimeRequest extends BasePage{

	
	public ApproveAirtimeRequest(AppiumDriver driver)
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
	private AndroidElement ok_Button;
	
	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
	private AndroidElement fundTransferPopUpMessage;

	
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView']")
//	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
	private AndroidElement successPrompt;
	
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Close\"]")
	private AndroidElement smsCancel_Btn;
	
	

	
	public String validateSubdealerApproveAirtimeRequest(String subDealerApproveCustomerAirtimeRequest, String subDealer_PIN) throws Exception
	{
		textField.sendKeys(subDealerApproveCustomerAirtimeRequest);
		call_Btn.click();
		Thread.sleep(5000);
		
//		Enter PIN 
		pinInPutField.sendKeys(subDealer_PIN);
		sendPIN_Btn.click();
		Thread.sleep(8000);

		
		String text = successPrompt.getText();
		Thread.sleep(6000);
		
		ok_Button.click(); 
		return text; 
		
	}

	
	
}
