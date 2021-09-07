package com.fbistech.SubDealer;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class VendAirtime_SubDealerToSubDealer_NotSameUpline extends BasePage {
	
	public VendAirtime_SubDealerToSubDealer_NotSameUpline(AndroidDriver driver)
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
	private AndroidElement balanceOK_Button;
	

	
	public String validateSubdealerVendAirtimeToSubDealer_NotSameUpline() throws Exception
	{
//		Dial Short code 
		textField.sendKeys("*878*878*08137507455*1#");
		dial_Button.click();
		Thread.sleep(4000);
		 
//		Enter PIN 
		pinInputField.sendKeys("1234");
		sendPIN_Btn.click();
		Thread.sleep(5000);

		
		String balance = accountBalancePopUp.getText();
		Thread.sleep(6000);
		
		balanceOK_Button.click();
		return balance;
	
	}

	
}
