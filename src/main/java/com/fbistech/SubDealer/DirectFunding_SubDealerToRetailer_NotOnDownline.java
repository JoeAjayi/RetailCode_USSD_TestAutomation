package com.fbistech.SubDealer;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DirectFunding_SubDealerToRetailer_NotOnDownline extends BasePage {

	
	public DirectFunding_SubDealerToRetailer_NotOnDownline(AndroidDriver driver)
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
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView']")
//	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
	private AndroidElement accountBalancePopUp;
	
	
	@AndroidFindBy(xpath = "//*[@text='OK']")
	private AndroidElement ok_Button;
	
	
//	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
//	private AndroidElement invalidFund_PopUp;
//
	

	
	public String validatesubdealerFundRetailer_NotOnDownline() throws Exception
	{
//		textField.sendKeys(subDealerToRetailerDownline);
		textField.sendKeys("*878*878*33*318290*1#");
		callButton.click();
		Thread.sleep(5000);
		
//		pinInPutField.sendKeys("3262");
//		sendPinButton.click();
//		Thread.sleep(7000);
		
		String balance = accountBalancePopUp.getText();
		Thread.sleep(5000);
		
		ok_Button.click();

		return balance;
	}
	
}
