package com.fbistech.SubDealer;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class VendAirtime_SubDealerToDealer_NotUpline extends BasePage {
	
	public VendAirtime_SubDealerToDealer_NotUpline(AppiumDriver driver)
	{
		super(driver);
	}
			

	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	private AndroidElement textField;	
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Call\"]")
	private AndroidElement dial_Button;
	
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	private AndroidElement pinInputField;
	
	
	@AndroidFindBy(xpath = "//*[@text='SEND']")
	private AndroidElement sendPIN_Btn;
	
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView']")
//	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
	private AndroidElement accountBalancePopUp;
	
	@AndroidFindBy(xpath = "//*[@text='OK']")
	private AndroidElement OK_Button;
	

	
	public String validateSubdealerVendAirtimeToDealer_NotUpline(String subDealerVendAirtimeToDealer_NotUpline, 
			String subDealer_PIN) throws Exception
	{
//		Dial Short code 
//		textField.sendKeys("*878*878*08037007878*1#"); 
		textField.sendKeys(subDealerVendAirtimeToDealer_NotUpline);
		dial_Button.click();
		Thread.sleep(5000);
		 
//		Enter PIN 
		pinInputField.sendKeys(subDealer_PIN);
		sendPIN_Btn.click();
		Thread.sleep(8000);

		
		String balance = accountBalancePopUp.getText();
		Thread.sleep(6000);
		
		OK_Button.click();
		return balance;
	} 
}
