package com.fbistech.SubDealer;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DirectFunding_SubDealerToSubDealer_NotOnSameDealer extends BasePage {

//	this is the first layer in Page object model which contain the web Object/webElement and page Actions/Methods  
	
	
	
//	Initialize the Page Objects
	public DirectFunding_SubDealerToSubDealer_NotOnSameDealer(AppiumDriver driver)
	{
		super(driver); 
				
//		PageFactory.initElements(driver, this); //does not work when used error:- Can not set io.appium.java_client.android.AndroidElement field
		
//		PageFactory.initElements(new AppiumFieldDecorator(driver), this); //error:- Keys to send should be a not null CharSequence
	} 
	
	
	
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	private AndroidElement textField;	
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Call\"]")
	private AndroidElement callButton;
	
	
//	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
//	private AndroidElement pinInputField;
//	
//	@AndroidFindBy(xpath = "//*[@text='SEND']")
//	private AndroidElement sendPinButton;
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView']")
//	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
	private AndroidElement accountBalancePopUp;
	
	
	@AndroidFindBy(xpath = "//*[@text='OK']")
	private AndroidElement ok_Button;
	
	
//	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Close\"]")
//	private AndroidElement smsCancel_Btn;
	
	

	
//	public void subdealerToFundRetailer_OnDownline(String subDealerFundRetailer_OnDownline, String subDealer_PIN) throws Exception
	public String subdealerFundSubdealer_NotOnSameDealer(String subDealerFundSubdealer_NotOnSameDealer, 
			String subDealer_PIN) throws Exception
	{ 
//		textField.sendKeys("*878*878*33*20423*1#");
		textField.sendKeys(subDealerFundSubdealer_NotOnSameDealer);
		callButton.click();
		Thread.sleep(8000);
	
//		Enter PIN 
//		pinInPutField.sendKeys(subDealer_PIN);
//		pinInputField.sendKeys("1234");
//		sendPinButton.click();
//		Thread.sleep(5000);
		
		String balance = accountBalancePopUp.getText();
		Thread.sleep(7000);
		
		ok_Button.click();

		return balance;
		
	}


}
