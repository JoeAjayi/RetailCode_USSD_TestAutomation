package com.fbistech.Customer;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AirtimeRequest_CustomerFrom_RetailerUnderDealer extends BasePage {
	
	public AirtimeRequest_CustomerFrom_RetailerUnderDealer(AndroidDriver driver)
	{
		super(driver);
	}
	
	
		
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	private AndroidElement textField;	
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Call\"]")
	private AndroidElement call_Btn;
	
	
	
	@AndroidFindBy(xpath = "//*[@text='OK']")
	private AndroidElement balanceOK_Btn;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Close\"]")
	private AndroidElement smsCancel_Btn;
	
	
//	@AndroidFindBy(xpath = "//*[@text='Successful NGN1.00 airtime request sent. Your token is 45']")
//	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView']")
	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
	private AndroidElement requestSent_PopUp;

	public void customerRequestAirtimeFrom_RetailerUnderDealer() throws Exception

	{
//		Dial short code  
		textField.sendKeys("*878*878*007201*1#");
		call_Btn.click();
		Thread.sleep(4000);
		
		
//		balanceOK_Btn.click();
//		Thread.sleep(10000);
//		smsCancel_Btn.click();
	}	
		
	public String validateAirtimeRequestSentPopUp()
	{
		return requestSent_PopUp.getText();
	}
		
		
		
		
		
		
		 
		

		
	


}
