package com.fbistech.SubDealer;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ApproveAirtimeRequest_Retailer extends BasePage{

	
	public ApproveAirtimeRequest_Retailer(AndroidDriver driver)
	{
		super(driver);
//		PageFactory.initElements(driver, this);
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
	private AndroidElement balanceOK_Btn;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Close\"]")
	private AndroidElement smsCancel_Btn;
	
	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
	private AndroidElement fundTransferPopUpMessage;
	

	
	public void SubdealerApproveRetailerAiritmeRequest() throws Exception
	
	{
//		textField.sendKeys(subDealerFundRetailer_OnDownline);
		textField.sendKeys("*878*878*33*005394*1#");
		call_Btn.click();
		Thread.sleep(4000);
		
//		Enter PIN 
		
//		pinInPutField.sendKeys(subDealer_PIN);
		pinInPutField.sendKeys("1234");
		Thread.sleep(3000);
		sendPIN_Btn.click();
		
//		balanceOK_Btn.click();
//		Thread.sleep(10000);
//		smsOK_Btn.click();
		
	}


	public String getFundTransferMessage()
	{
		return fundTransferPopUpMessage.getText();
	}
	
	
}
