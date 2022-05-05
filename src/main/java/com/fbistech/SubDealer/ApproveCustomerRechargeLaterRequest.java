package com.fbistech.SubDealer;

import org.openqa.selenium.support.PageFactory;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ApproveCustomerRechargeLaterRequest extends BasePage {
	
	
//	Initialize the Page Objects
	public ApproveCustomerRechargeLaterRequest(AppiumDriver driver)
	{
		super(driver);
//		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	

	
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	private AndroidElement textInputField;	
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Call\"]")
	private AndroidElement callButton;
	
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']") 
//	@AndroidFindBy(xpath = "//*[@resource-id='com.android.phone:id/input_field']")
	private AndroidElement pinInPutField;
	
	@AndroidFindBy(xpath = "//*[@text='SEND']")
	private AndroidElement sendPinButton;
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView']")
//	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
	private AndroidElement successPrompt;
	
	
	@AndroidFindBy(xpath = "//*[@text='OK']")
	private AndroidElement ok_Button;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Close\"]")
	private AndroidElement smsCancel_Btn;
	
//	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
//	private AndroidElement invalidFund_PopUp;
//
	

	
	public String validateSubdealerApproveCustomerRechargeLaterRequest(String subDealerApproveCustomerRechargeLaterRequest, 
			String subDealer_PIN) throws Exception
	{
		textInputField.sendKeys(subDealerApproveCustomerRechargeLaterRequest);
		callButton.click();
		Thread.sleep(5000);
		
//		Enter PIN to complete Fund Recall
		pinInPutField.sendKeys(subDealer_PIN);
		sendPinButton.click();
		Thread.sleep(8000);
		
		
		String text = successPrompt.getText();		
		Thread.sleep(6000);
		
		ok_Button.click();

		return text;
	}

}
