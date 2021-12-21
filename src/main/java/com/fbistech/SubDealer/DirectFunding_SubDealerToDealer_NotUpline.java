package com.fbistech.SubDealer;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DirectFunding_SubDealerToDealer_NotUpline extends BasePage {

	
	public DirectFunding_SubDealerToDealer_NotUpline(AppiumDriver driver)
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
//	private AndroidElement sendPIN_Btn;
	
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView']")
//	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
	private AndroidElement successPrompt;
	
	
	@AndroidFindBy(xpath = "//*[@text='OK']")
	private AndroidElement ok_Btn;
	
	
	public String validateSubDealerFundDealer_NotUpline(String subDealerFundDealer_NotUpline, String subDealer_PIN) throws Exception
	{
//		textField.sendKeys("*878*999*878*33*01*1#");
		textField.sendKeys(subDealerFundDealer_NotUpline);
		callButton.click(); 
		Thread.sleep(5000);
		
//		pinInPutField.sendKeys(subDealer_PIN);
//		sendPIN_Btn.click();
//		Thread.sleep(4000);
		 
		String balance = successPrompt.getText();
		Thread.sleep(7000);
		
		ok_Btn.click();

		return balance;
	}
}


	
	