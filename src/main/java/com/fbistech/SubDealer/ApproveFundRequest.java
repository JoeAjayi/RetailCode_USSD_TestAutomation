package com.fbistech.SubDealer;

import java.io.*;

import com.fbistech.BasePage.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ApproveFundRequest extends BasePage{

	
	public ApproveFundRequest (AppiumDriver driver)
	{
		super(driver);
	}
	
	

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/"
			+ "android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.RelativeLayout[1]/android.widget.ListView/"
			+ "android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/"
			+ "android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/"
			+ "android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/"
			+ "android.widget.LinearLayout/android.widget.TextView")
		private AndroidElement readSubdealerFundRequestSMS;	
	
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	private AndroidElement textField;	
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Call\"]")
	private AndroidElement call_Btn;
	
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
	private AndroidElement pinInPutField;
	
	
	@AndroidFindBy(xpath = "//*[@text='SEND']")
	private AndroidElement sendPIN_Btn;
	
	@AndroidFindBy(xpath = "//*[@text='OK']")
	private AndroidElement ok_Button;
	
	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
	private AndroidElement fundTransferPopUpMessage;

	
	@AndroidFindBy(xpath = "//*[@class='android.widget.TextView']")
//	@AndroidFindBy(xpath = "//*[@resource-id='android:id/message']")
	private AndroidElement successPrompt;
	
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Close\"]")
	private AndroidElement smsCancel_Btn;
	
	

	
//	public String validateSubdealerApproveFundRequest(String subDealerApproveCustomerAirtimeRequest, String subDealer_PIN) throws Exception
//	{
//		textField.sendKeys(subDealerApproveCustomerAirtimeRequest);
//		call_Btn.click();
//		Thread.sleep(5000);
//		
////		Enter PIN 
//		pinInPutField.sendKeys(subDealer_PIN);
//		sendPIN_Btn.click();
//		Thread.sleep(8000);
//
//		
//		String text = successPrompt.getText();
//		Thread.sleep(6000);
//		
//		ok_Button.click(); 
//		return text; 
//		
//	}
	
	
	
	public String getRetailerFundApprovalToken() throws IOException
	{
		// Reading fund request SMS from sub-dealer phone SMS inbox
		String fundRequestSMS = readSubdealerFundRequestSMS.getText();
		
		// Extracting the last integer of the SMS 
		StringBuilder sb = new StringBuilder();
		for (int i = fundRequestSMS.length() - 1; i >= 0; i--) 
		{
			char c = fundRequestSMS.charAt(i);
			if (Character.isDigit(c)) 
			{
				sb.insert(0, c);
			} else 
			{
				break;
			}
		}
		
		
		String approvalToken = sb.toString();
		Integer.parseInt(approvalToken);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			System.out.println("invalid token read");
			e.printStackTrace();
		}
		 
		// Storing the approval token into a generated file named: token.txt  
		File file = new File("token.txt");                      // Created a File object called token.txt
		FileWriter filewrite = new FileWriter(file);            // Created a FileWriter object called fw
		PrintWriter printwriter = new PrintWriter(filewrite);   // Created a PrintWrirter object called pw
		printwriter.println(approvalToken);                     // Writing extracted approval token to txt file
		printwriter.close();
		 
		return approvalToken; 		
	}       
	
	
	
	
	String file = "token.txt";
	
	public String validateSubdealerApproveFundRequest() throws Exception
	{
		String approveFundRequestUSSD = null;
		String getApprovalToken = null;
		
		// Extracting the token stored in token.txt file
		try {
			InputStream ips = new FileInputStream(file);
			InputStreamReader ipsr = new InputStreamReader(ips);
			BufferedReader br = new BufferedReader(ipsr);
//			String getApprovalToken;

			while ((getApprovalToken = br.readLine()) != null) 
			{	
				approveFundRequestUSSD = "*878*999*44*" + getApprovalToken + "#";
				System.out.println("Fund Request Approval String is -->  " + approveFundRequestUSSD);
//				getApprovalToken += getApprovalToken + "\n";
			}
			br.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
//		Dial fund approval string 
		textField.sendKeys(approveFundRequestUSSD);
		call_Btn.click();
		Thread.sleep(5000);
		
//		Enter PIN 
		pinInPutField.sendKeys("1234");
		sendPIN_Btn.click();
		Thread.sleep(8000);

		
		String text = successPrompt.getText();
		Thread.sleep(6000);
		
		ok_Button.click(); 
		return text; 
		
	}

	

}
