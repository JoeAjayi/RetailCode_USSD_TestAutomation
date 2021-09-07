package com.fbistech.Retailer;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DirectFunding_RetailerToSubDealer_Upline extends BasePage {

	
	public DirectFunding_RetailerToSubDealer_Upline (AndroidDriver driver)
	{
		super(driver);
	}
	
	
		


	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	private AndroidElement textField;	
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Call\"]")
	private AndroidElement dial_Button;
	
	
//	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
//	private AndroidElement pinInputField;
//	
//	@AndroidFindBy(xpath = "//*[@text='SEND']")
//	private AndroidElement sendPIN_Button;
	
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView']")
//	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
	private AndroidElement accountBalancePopUp;
	
	
	@AndroidFindBy(xpath = "//*[@text='OK']")
	private AndroidElement balanceOK_Button;
	
	
	
	
	
	public String validateRetailerFundSubDealer_Upline() throws Exception
	{
//		textField.sendKeys(subDealerToRetailerDownline);
		textField.sendKeys("*878*878*33*00649*1#");
		dial_Button.click(); 
		Thread.sleep(5000);
		
//		pinInputField.sendKeys("1234");
//		sendPIN_Button.click();
//		Thread.sleep(4000);
		
		String balance = accountBalancePopUp.getText();
		Thread.sleep(6000);
		
		balanceOK_Button.click();

		return balance;
	}
}
