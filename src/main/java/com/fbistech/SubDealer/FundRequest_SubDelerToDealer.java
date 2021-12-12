package com.fbistech.SubDealer;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FundRequest_SubDelerToDealer extends BasePage{

	
	public FundRequest_SubDelerToDealer (AppiumDriver driver)
	{
		super(driver);
	}
	

	
		
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	private AndroidElement textField;	
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Call\"]")
	private AndroidElement call_Btn;
	
	
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView']")
//	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
	private AndroidElement accountBalancePopUp;
	
	@AndroidFindBy(xpath = "//*[@text='OK']")
	private AndroidElement ok_Button;
	
//	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView']")
	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
	private AndroidElement token_Message;
	

	
//	public void SubdealerToFundSubdealer_OnSameDealer(String subDealerFundRetailer_OnDownline, String subDealer_PIN) throws Exception
	public String validateSubdealerRequestFundFromDealer() throws Exception
	{
//		textField.sendKeys(subDealerFundRetailer_OnDownline);
		textField.sendKeys("*878*878*34*1#");
		call_Btn.click();
		Thread.sleep(4000);
//		oK_Btn.click();
//		Thread.sleep(10000);
//	
		
		String text = accountBalancePopUp.getText();
		Thread.sleep(6000);
		
		ok_Button.click();
		return text;
	}
	
}
