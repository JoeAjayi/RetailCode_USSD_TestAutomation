package com.fbistech.SubDealer;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Retrieve_Retailcode extends BasePage {
	
	public Retrieve_Retailcode (AppiumDriver driver)
	{
		super(driver);
	}
	

	
	
//	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@content-desc=\"Asterisk\"]/android.widget.TextView") 
//	private AndroidElement starBtn;
//	
//	@AndroidFindBy(xpath = "//*[@resource-id='com.samsung.android.contacts:id/digits']") 
//	private AndroidElement textField;	
//	
//	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Call button\"]")
//	private AndroidElement callButon;

	
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	private AndroidElement digits_InputField;	
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Call\"]")
	private AndroidElement callButon;

	
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView']")
	private AndroidElement responseField_Popup;
	
	
	@AndroidFindBy(xpath = "//*[@text='OK']") 
	private AndroidElement ok_Btn;
	
	
//	public void userCheckBalance(String checkBalance) throws InterruptedException

	public String validateSubdealerRetrieve_Retailcode() throws InterruptedException
	{
//		starBtn.click();
		digits_InputField.sendKeys("*878*999*10#");
		callButon.click();
		Thread.sleep(6000);
		
		String balance = responseField_Popup.getText();
		Thread.sleep(6000);
		
		ok_Btn.click();

		return balance;
	}	

		
	
}