package com.fbistech.Dealer;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DirectFunding_DealerToRetailer_OnDownline extends BasePage {

	
	public DirectFunding_DealerToRetailer_OnDownline(AppiumDriver driver)
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
	private AndroidElement smsCancel_Btn;
	
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView']")
//	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
	private AndroidElement accountBalancePopUp;
	

	
//	public void dealerToFundSubdealerDownline(String subDealerToRetailerDownline) throws Exception
	public String ValidateDealerFundRetailerOnDownline() throws Exception

	{
//		textField.sendKeys(subDealerToRetailerDownline);
		textField.sendKeys("*878*878*33*007201*1#");
		call_Btn.click(); 
		Thread.sleep(4000);
		
		pinInPutField.sendKeys("1234");
		sendPIN_Btn.click();
		Thread.sleep(5000);
		
		String balance = accountBalancePopUp.getText();
		Thread.sleep(6000);
		
		ok_Btn.click();
//		Thread.sleep(10000);
//		smsOK_Btn.click();

		return balance;
		
	}



	
	
	
}
